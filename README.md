# irretailier

### Prerequisite

* Java 1.7
* Maven 3.3.*
* Git 
* Apache Tomcat 7
* no-99

###Get Started
1. use `mvn clean install` to compile the project, add dependency to pom.xml
2. `admin-console-1.0-SNAPSHOT.war` would be generated in the target folder
3. copy *.war to `tomcat_path//webapps/`, (re)start tomcat
4. these two urls should be reachable
	[`(http://localhost:8080/admin-console-1.0-SNAPSHOT/rest/welcome/index)`]( http://localhost:8080/admin-console-1.0-SNAPSHOT/rest/welcome/index) (for i18n sample)
	[`(http://localhost:8080/admin-console-1.0-SNAPSHOT/rest/hello/beer`]( http://localhost:8080/admin-console-1.0-SNAPSHOT/rest/hello/beer) (original sample)
#5. TODO:

### Notes
* Don't check in any IDE related stuffs, be sure to append them to `.gitignore` 

### FAQ
#1. TODO:
