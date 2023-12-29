import sys
import requests
from requests.auth import HTTPBasicAuth

username, password, repository, project, module, element = sys.argv[1:]

url = "https://meet-encore.blueriq.com/Studio/Server/Services/ManagementService"
headers = {"Content-Type": "text/xml","SOAPAction": "GetModuleElement"}
auth = HTTPBasicAuth(username, password)

body = ""
with open("xml/GetModuleElementRequest.xml", 'r') as file:
    body = file.read()

body = body.replace("$REPOSITORY", repository)
body = body.replace("$PROJECT", project)
body = body.replace("$MODULE", module)
body = body.replace("$ELEMENT", element)

with open("xml/GetModuleElementResponse.xml", 'wb') as file:
    response = requests.post(url, auth=auth, headers=headers, data=body)
    file.write(response.content)
