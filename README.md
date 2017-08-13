# gamesys
Planet Express time Travel
## Approach
This project has been created using Java and Spring Boot framework. Spring boot helps with the set up of the webapps, 
Also Spring Boot comes with an embedded server which provides a container to easily deploy the web application in.
There are 2 webapps and a mysql database, all deployed in Docker containers. Running docker-compose up on the base directory will build and deploy all 3 containers

Requirements
1) Gradle 2.3 (To build java projects)
3) Docker

## Running the program
To run the project.
1) Using gradle build commmand, build both the planet express and crew projects
2) Change directory to the base directory and run docker-compose up.