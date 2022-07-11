# spring-boot-k8s-demo

spring-boot-k8s-demo is a sample Spring boot Rest api app to play wiht Kunernets deployment and learnign.
Application is using PostGresql a database.
To use MySql database, remove Postgrsql jdbc driver in pom.xml and add MySql jdbc driver dependency.

Run mvn clean install to buil the project.

Project is using jib-maven-plugin [https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin] to generate a container image as part of build process. 

Image name: spring-boot-k8s-demo:latest

This project also has Dockerfile as sample to manualy build the container image

docker build -t spring-boot-k8s-demo:latest .

all kubernets deploymetn configurtion saved into k8s folder.

1) config.yml 
change data base ip address, user, password. default *k8s* us default username/password
2) deployment-blue.yml
3) deployment-green.yml (to perorm blue geen deployment testing)
4) service.yml 


kubectl apply -f config.yml

kubectl apply -f deployment-blue.yml

kubectl apply -f service.yml 

Sample urls to test apps.

Create employee

http://localhost:8080/employee/save?name=Tom

List employees

http://localhost:8080/employee/list

replace localhost with service IP after deployment to test the apps from kubernets