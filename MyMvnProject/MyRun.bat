@ECHO OFF
echo --- Starting execution of the application---
 echo Cleaning...
 CALL mvn clean  
 echo Done
 echo.

 echo Compiling...
 CALL mvn compile  
 echo Done
 echo.
 
mvn verify -P "singlethread" -Dmetafilter="+TestAPI" -Dwebdriver.driver=chrome -Dwebdriver.base.url="http://newtours.demoaut.com/" -Dplatform=DESKTOP