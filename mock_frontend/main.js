init();

function init() {
    document.cookie = "select=false";
}

var url = "https://04cb-2a02-a461-20bc-0-8ea6-97be-b04b-d0ee.ngrok-free.app";

function getField() {
    var split = document.cookie.split(';');
    for (var i = 0; i < split.length; i++) {
        var cookie = split[i].trim();
        var key = cookie.split("=")[0];
        if (key == "field") {
            return cookie.replace("field=", "");
        }
    }
    alert("BAD");
}

function getSelect() {
    var split = document.cookie.split(';');
    for (var i = 0; i < split.length; i++) {
        var cookie = split[i].trim();
        var key = cookie.split("=")[0];
        if (key == "select") {
            return cookie.replace("select=", "");
        }
    }
}

function getAttribute() {
    var split = document.cookie.split(';');
    for (var i = 0; i < split.length; i++) {
        var cookie = split[i].trim();
        var key = cookie.split("=")[0];
        if (key == "attribute") {
            return cookie.replace("attribute=", "");
        }
    }
}

function devtoolsSelect(el) {
    if (getSelect() == "true") {
        var bar = document.getElementById("bar");
        var barDocument = bar.contentWindow.document;

        if (bar.classList.contains("collapsed")) {
            var splitter = document.getElementById("splitter");
            var icon = barDocument.getElementById("toggleCollapseIcon");
            bar.classList.remove("collapsed");
            icon.classList.remove("rotate-180");
            splitter.hidden = false;
            var tripledotParent = barDocument.getElementById("tripledotParent");
            tripledotParent.innerHTML = tripledotHTML + tripledotParent.innerHTML;
        }

        var selected = document.getElementsByClassName("devtools-selected");
        if (selected.length != 0) {
            selected[0].classList.remove("devtools-selected");
        }
        el.classList.add("devtools-selected");


        var field = el.id;
        var instance = template.replaceAll("$Field", field.charAt(0).toUpperCase() + field.slice(1)).replace("$field", field);
        if (field == "rekeningnummer") {
            instance = template.replaceAll("$Field", "BankGiroRekeningNummer").replace("$field", field);
        }
        document.cookie = `field=${field}`;

        var explorer = barDocument.getElementsByTagName("dt-element-explorer")[0];
        explorer.innerHTML = '<div class="loading"><div class="spinner"></div><p>Loading...</p></div>';

        var xhr = new XMLHttpRequest();
        xhr.open("POST", url + "/getAttribute", true);
        var name = "Verzekerde." + (field == "rekeningnummer" ? "BankGiroRekeningNummer" : field.charAt(0).toUpperCase() + field.slice(1));
        var data = `{
            "repository": "Kinderbijslag",
            "branch": "Trunk_copy_for_CET",
            "project": "Kinderbijslag",
            "module": "Kinderbijslag",
            "name": "${name}"
        }`;

        xhr.onreadystatechange = function() {
            if (xhr.readyState == xhr.DONE) {
                var json = JSON.parse(xhr.responseText);

                document.cookie = `attribute=${json.name}`;
                instance = instance.replaceAll("$AttributeName", getAttribute());
                explorer.innerHTML = instance; 

                var nl = barDocument.getElementById("nl");
                var en = barDocument.getElementById("en");
                var requestChangesButton = barDocument.getElementById("request");

                nl.value = json.nl;
                en.value = json.en;
                requestChangesButton.disabled = true;
                document.cookie = `nl=${json.nl};en=${json.en}`;

            }
        }
        xhr.send(data);
    }
}

function devtoolsHover(el) {
    if (getSelect() == "true") {
        el.classList.add("devtools-element-target");
    }
}

function devtoolsLeave(el) {
    //if (getSelect() == "true") {
        el.classList.remove("devtools-element-target");
    //}
}

function getNL() {
    var split = document.cookie.split(';');
    for (var i = 0; i < split.length; i++) {
        var cookie = split[i].trim();
        if (cookie[0] == 'n') {
            return cookie.replace("nl=", "");
        }
    }
    return "";
}

function getEN() {
    var split = document.cookie.split(';');
    for (var i = 0; i < split.length; i++) {
        var cookie = split[i].trim();
        if (cookie[0] == 'e') {
            return cookie.replace("en=", "");
        }
    }
    return "";
}

function processValueChange() {
    var nl = document.getElementById("nl");
    var en = document.getElementById("en");
    var requestChangesButton = document.getElementById("request");
    requestChangesButton.disabled = nl.value == getNL() && en.value == getEN();
} 

function discardChanges() {
    var nl = document.getElementById("nl");
    var en = document.getElementById("en");
    var message = document.getElementById("message");
    var requestChangesButton = document.getElementById("request");

    message.value = "";
    nl.value = getNL();
    en.value = getEN();
    requestChangesButton.disabled = true;
}

function requestChanges() {
    var field = getField();
    var nl = document.getElementById("nl");
    var en = document.getElementById("en");
    var message = document.getElementById("message");
    var requestChangesButton = document.getElementById("request");

    var name = "Verzekerde." + (field == "rekeningnummer" ? "BankGiroRekeningNummer" : field.charAt(0).toUpperCase() + field.slice(1));

    var explorer = document.getElementsByTagName("dt-element-explorer")[0];
    explorer.innerHTML = '<div class="loading"><div class="spinner"></div><p>Sending request...</p></div>';

    var xhr = new XMLHttpRequest(); xhr.open("POST", url + "/requestChanges", true);
    var data = `
    {
        "repository": "Kinderbijslag",
        "branch": "Trunk_copy_for_CET",
        "project": "Kinderbijslag",
        "module": "Kinderbijslag",
        "request": {
            "name": "${name}",
            "questionText": {
                "nl": "${nl.value}",
                "en": "${en.value}"
            },
            "message": "${message.value.replaceAll('"', '\\"')}"
        }
    }
    `;
    xhr.onreadystatechange = function() {
        if (xhr.readyState == xhr.DONE) {
            document.cookie = `nl=${nl.value};en=${en.value}`;
            message.value = "";

            var field = getField();
            var instance = template.replaceAll("$Field", field.charAt(0).toUpperCase() + field.slice(1)).replace("$field", field);
            if (field == "rekeningnummer") {
                instance = template.replaceAll("$Field", "BankGiroRekeningNummer").replace("$field", field);
            }
            instance = instance.replaceAll("$AttributeName", getAttribute());

            explorer.innerHTML = instance;

            nl = document.getElementById("nl");
            en = document.getElementById("en");

            nl.value = getNL();
            en.value = getEN();

            requestChangesButton.disabled = true;
        }
    };
    xhr.send(data);
}

function toggleCollapse() {
    var bar = parent.document.getElementById("bar");
    var splitter = parent.document.getElementById("splitter");
    var icon = document.getElementById("toggleCollapseIcon");

    if (bar.classList.contains("collapsed")) {
        bar.classList.remove("collapsed");
        icon.classList.remove("rotate-180");
        splitter.hidden = false;
        var tripledotParent = document.getElementById("tripledotParent");
        tripledotParent.innerHTML = tripledotHTML + tripledotParent.innerHTML;
    } else {
        bar.classList.add("collapsed");
        icon.classList.add("rotate-180");
        var tripledot = document.getElementById("tripledot");
        tripledot.remove();
        splitter.hidden = true;
    }
}

function toggleSelect() {
    var icon = document.getElementById("selectTogglerIcon");
    var icon2 = document.getElementById("selectTogglerIcon2");
    var text = document.getElementById("selectTogglerBig");

    if (getSelect() == "true") {
        icon.classList.remove("text-primary");
        if (icon2 != null) { 
            icon2.classList.remove("text-primary");
            text.classList.remove("text-primary");
        }
        document.cookie = "select=false";
    } else {
        icon.classList.add("text-primary");
        if (icon2 != null) {
            icon2.classList.add("text-primary");
            text.classList.add("text-primary");
        }
        document.cookie = "select=true";
    }
}

var tripledotHTML = '<button _ngcontent-ng-c2441343542="" bq-icon-button="" bq-tooltip="Customize toolbar" id="tripledot" class="m-0 bq-button-base ng-star-inserted"><span tabindex="-1"><bq-icon _ngcontent-ng-c2441343542="" icon="menu" class="bq-icon" style="height: 1.4rem; width: 1.4rem;"><div><svg xmlns="http://www.w3.org/2000/svg" version="1.1" viewBox="0 0 24 24" width="100%" height="100%" fit="" preserveAspectRatio="xMidYMid meet" fill="currentColor" focusable="false"><path d="M0 0h24v24H0V0z" fill="none"></path><path d="M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z"></path></svg></div></bq-icon></span></button>';

var template = `
      <div class="m-4">
        <h2 id="name-header" class="ng-star-inserted">$AttributeName (Field)</h2>
        <span>Last requested changes</span>
        <table class="table-fixed w-full ng-star-inserted">
          <tr class="ng-star-inserted">
            <td class="truncate w-1/3">
              <span class="font-medium">QuestionText</span> 
              <bq-tooltip class="ng-tns-c794289210-35 hidden ng-star-inserted">
              </bq-tooltip>
            </td>
            <td class="break-all">
              <dt-element-property>
                <div class="flex flex-row ng-star-inserted">
                  <div style="margin: 5px 0">
                    <bq-form-field _nghost-ng-c2798898945="">
                      <div _ngcontent-ng-c2798898945="" class="mb-5 relative">
                        <div _ngcontent-ng-c2798898945="" class="form-field-wrapper h-stack relative w-full bg-application-field border-b outline-none rounded-none box-border pl-3 border-application-separator">
                          <div _ngcontent-ng-c2798898945="" class="empty:hide flex self-center items-center mr-2"></div>
                          <div _ngcontent-ng-c2798898945="" class="h-item-fill relative">
                            <label _ngcontent-ng-c2798898945="" color-position="text" class="absolute mb-0 -mt-2 pt-4 left-0 top-0 z-10 leading-tight cursor-text pointer-events-none select-none duration-friendly truncate w-full ng-star-inserted -mt-6 text-xs opacity-subtext" for="bq-field-1" aria-owns="bq-field-1" style="">
                              <bq-label>nl-NL</bq-label>
                            </label>
                            <input bq-input="" value="" class="ng-pristine ng-valid ng-touched $field" id="nl" onkeyup="processValueChange()">
                          </div>
                          <div _ngcontent-ng-c2798898945="" class="empty:hide flex self-center items-center mx-2"></div>
                        </div>
                        <div _ngcontent-ng-c2798898945=""></div>
                      </div>
                    </bq-form-field>
                  </div>
                  <bq-tooltip class="ng-tns-c794289210-46 hidden ng-star-inserted"></bq-tooltip>
                </div>
                <div class="flex flex-row ng-star-inserted">
                  <div style="margin: tpx 0">
                    <bq-form-field _nghost-ng-c2798898945="">
                      <div _ngcontent-ng-c2798898945="" class="mb-5 relative">
                        <div _ngcontent-ng-c2798898945="" class="form-field-wrapper h-stack relative w-full bg-application-field border-b outline-none rounded-none box-border pl-3 border-application-separator">
                          <div _ngcontent-ng-c2798898945="" class="empty:hide flex self-center items-center mr-2"></div>
                          <div _ngcontent-ng-c2798898945="" class="h-item-fill relative">
                            <label _ngcontent-ng-c2798898945="" color-position="text" class="absolute mb-0 -mt-2 pt-4 left-0 top-0 z-10 leading-tight cursor-text pointer-events-none select-none duration-friendly truncate w-full ng-star-inserted -mt-6 text-xs opacity-subtext" for="bq-field-1" aria-owns="bq-field-1" style="">
                              <bq-label>en-GB</bq-label>
                            </label>
                            <input bq-input="" value="" class="ng-pristine ng-valid ng-touched $field" id="en" onkeyup="processValueChange()">
                          </div>
                          <div _ngcontent-ng-c2798898945="" class="empty:hide flex self-center items-center mx-2"></div>
                        </div>
                        <div _ngcontent-ng-c2798898945=""></div>
                      </div>
                    </bq-form-field>
                  </div>
                  <bq-tooltip class="ng-tns-c794289210-47 hidden ng-star-inserted"></bq-tooltip>
                </div>
              </dt-element-property>
            </td>
          </tr>
        </table>
        <div style="margin-top: 20px">
          <bq-form-field _nghost-ng-c2798898945="">
            <div _ngcontent-ng-c2798898945="" class="mb-5 relative">
              <div _ngcontent-ng-c2798898945="" class="form-field-wrapper h-stack relative w-full bg-application-field border-b outline-none rounded-none box-border pl-3 border-application-separator">
                <div _ngcontent-ng-c2798898945="" class="empty:hide flex self-center items-center mr-2"></div>
                <div _ngcontent-ng-c2798898945="" class="h-item-fill relative">
                  <label _ngcontent-ng-c2798898945="" color-position="text" class="absolute mb-0 -mt-2 pt-4 left-0 top-0 z-10 leading-tight cursor-text pointer-events-none select-none duration-friendly truncate w-full ng-star-inserted -mt-6 text-xs opacity-subtext" for="bq-field-1" aria-owns="bq-field-1" style="">
                    <bq-label>Message</bq-label>
                  </label>
                    <input bq-input="" value="" placeholder="Ex. typo fixed" class="ng-pristine ng-valid ng-touched $field" id="message" onkeyup="processValueChange()">
                </div>
                <div _ngcontent-ng-c2798898945="" class="empty:hide flex self-center items-center mx-2"></div>
              </div>
              <div _ngcontent-ng-c2798898945=""></div>
            </div>
          </bq-form-field>
          <div class="warning">Warning! The changes will be applied to all <i>$AttributeName</i> elements.</div>
          <div class="flex justify-end">
            <button bq-button="" color="primary" class="bq-button-base bq-primary $field" onclick="discardChanges()"><span tabindex="-1">Discard</span></button>
            <button bq-button="" color="primary" class="bq-button-base bq-primary $field" id="request" disabled onclick="requestChanges()"><span tabindex="-1">Request Changes</span></button>
          </div>
        </div>
      </div>`;
