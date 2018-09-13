echo --- Starting execution of the application---

mvn verify -P "singlethread" -Dmetafilter="+Test1" -Dwebdriver.driver=chrome -Dwebdriver.base.url="http://newtours.demoaut.com/" -Dplatform=DESKTOP