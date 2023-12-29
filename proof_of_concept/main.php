<!DOCTYPE html>

<html>
    <head>
        <title>Content Editing Tool</title>
    </head>
    <body>
        <?php
            $ch = curl_init();
            $username = $_POST["username"];
            $password = $_POST["password"];
            $repository = $_POST["repository"];
            $project = $_POST["project"];

            $command = escapeshellcmd(sprintf("python3 scripts/GetModules.py %s %s %s %s", $username, $password, $repository, $project));
            shell_exec($command);
            $command = escapeshellcmd("python3 scripts/GetModulesParse.py");
            $module = json_decode(shell_exec($command), true);
            $module = $module["name"];

            $command = escapeshellcmd(sprintf("python3 scripts/GetAllModuleElements.py %s %s %s %s %s", $username, $password, $repository, $project, $module));
            shell_exec($command);
            $command = escapeshellcmd("python3 scripts/GetAllModuleElementsParse.py");
            $data = json_decode(shell_exec($command), true);

            echo("<form method='post'>");
            $command = escapeshellcmd(sprintf("python3 scripts/ApplyOperationsPrepare.py %s", $repository));
            shell_exec($command);

            $i = 0;
            foreach ($data["elements"] as $elementName) {
                $command = escapeshellcmd(sprintf("python3 scripts/GetModuleElement.py %s %s %s %s %s %s", $username, $password, $repository, $project, $module, $elementName));
                shell_exec($command);
                $command = escapeshellcmd("python3 scripts/GetModuleElementParse.py");
                $element = json_decode(shell_exec($command), true);

                if (empty($element)) {
                    unset($data["elements"][$i]);
                } else {
                    echo("<label for='".$elementName."[nl-text]'>".$elementName."</label><br>");
                    echo("<textarea name='" . $elementName . "[nl-text]' rows=10 cols=80>".$element["nl-text"]."</textarea><br><br>");

                    $command = escapeshellcmd(sprintf("python3 scripts/OperationEntryPrepare.py %s %s", $project, $module));
                    shell_exec($command);
                }
                $i++;
            }
            echo("<input type='hidden' name='username' value='" . $username ."'/>");
            echo("<input type='hidden' name='password' value='" . $password ."'/>");
            echo("<input type='hidden' name='repository' value='" . $repository ."'/>");
            echo("<input type='hidden' name='project' value='" . $project ."'/>");
            echo("<input type='hidden' name='module' value='" . $module ."'/>");

            echo("<input type='submit' name='requestsent' value='Request changes'/>");
            echo("</form>");

            if (isset($_POST["requestsent"])) {
                foreach ($data["elements"] as $element) {
                    $text = '"'.$_POST[$element]["nl-text"].'"';
                    $command = escapeshellcmd(sprintf("python3 scripts/OperationEntrySet.py %s %s", $element, $text));
                    shell_exec($command);
                }
                $command = escapeshellcmd("python3 scripts/NamespaceHackFix.py");
                shell_exec($command);

                $command = escapeshellcmd(sprintf("python3 scripts/CreateFeatureBranch.py %s %s %s", $username, $password, $repository));
                shell_exec($command);

                $command = escapeshellcmd(sprintf("python3 scripts/ApplyOperations.py %s %s", $username, $password));
                shell_exec($command);
            }
        ?>
    </body>
</html>
