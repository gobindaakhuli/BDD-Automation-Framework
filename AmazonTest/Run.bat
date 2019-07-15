 echo Cleaning...
 CALL mvn clean  
 echo Done
 echo.

 echo Compiling...
 CALL mvn compile  
 echo Done
 echo.
 
CALL mvn verify -P "singlethread" -Dmetafilter="+PdpPlpWithCart" -Dwebdriver.driver=chrome -Dwebdriver.base.url="https://amazon.com/"

echo --- Copying test result to TestResults folder... 
 IF NOT EXIST %CD%\TestResults MD %CD%\TestResults
  XCOPY /E "%CD%\target\site\serenity\*.*" "%CD%\TestResults\%date:~-4%%date:~4,2%%date:~7,2%_%time:~0,2%%time:~3,2%%time:~6,2%\*.*"  | echo > NUL
echo Done
echo.