sessionservlet
==============

Simple servlet based web application. User session management.Useful Link :
        http://coding4ataraxia.blogspot.in/


To build the project
        sudo mvn clean install
    
    
copy session-webapp.war file from target folder to apache tomcat's webapp directory. Start the tomcat server
        cd $CatalinaHome; cd bin; sudo ./catalina.sh start
    
    
In the browser visit the URL
        http://localhost:8080/session-webapp
