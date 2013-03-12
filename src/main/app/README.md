
WELCOME
=======
Welcome to the Mule Example Studio SFDC SOAP Client application 

TESTING
=======

This application utilizes the Salesforce streaming API to recieve SFDC Account updates and route them to a simple SOAP service.

- Importing this example project into Mule Studio

1) Clone this git repoistory to a local directory

2) From Mule Studio complete the following steps:
	- File > IMPORT
	- Select "Mule > Mule Studio Project from External Location" (click Next)
	- Project Root select local directory from step (1)
	- Click "Finish"

- Configure Salesforce streaming Topic:
To test this application it is neccessary to create a SFDC streaming topic to do this complete the following steps:

1) Login to the SFDC Developer workbench - https://workbench.developerforce.com/login.php

2) Note: You will need a SFDC Developer edition account streaming API enabled

3) Once logged in, Select "Jump To" > Streaming Push Topics, and click 'Select'

4) From the drop down menu select Push Topic > "Create new"
	- Name: BasicAccountUpdates
	- Query: SELECT Id,Name FROM Account 
	- API Version: (accept default)

5) Click 'Save'

- Configuring example application 'mule-app.properties'

1) There is a sample 'mule-app.properties' file (named mule-app.sample.properties) in the /src/main/app directory of your project

2) Copy this file and rename it to 'mule-app.properties' in the same directory location

3) Add your own SFDC and CloudHub user credentials and tokens in the provided placeholders

4) Note: For testing locally the http.port parameter is required, but when deploying to CloudHub (http://cloudhub.io) this parameter is not required and should be commented out.

ADDITIONAL RESOURCES
====================
Everything you need to know about getting started with Mule can be found here:
http://www.mulesoft.org/documentation/display/MULE3INTRO/Home

Remember if you get stuck you can try getting help on the Mule user list:
http://www.mulesoft.org/email-lists

Also, MuleSoft, the company behind Mule, offers 24x7 support options:
http://www.mulesoft.com/enterprise-subscriptions-and-support

Enjoy your Mule ride!

The Mule Team
