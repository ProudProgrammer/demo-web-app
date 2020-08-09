# Demo Project - Web Application
A simple web application project
### Build
Manually:
```
$ mvn clean package
```
### Deploy
Manually:
```
Copy the war file from project's target folder into Tomcat's webapps folder. 
Tomcat deploys it during startup. If Tomcat is already started Tomcat will deploy it immediately.
```
### Start
Manually (in Windows machine):
```
$ startup.bat
http://localhost:8080/ (Tomcat's main page)
http://localhost:8080/demo-web-app/ (Project's main page, index.jsp)
http://localhost:8080/demo-web-app/welcome (WelcomeServlet)
```