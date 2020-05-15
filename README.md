# Spring Boot Boilerplate
Java 11 Spring Boot boilerplate to speed up future projects startup.

## How it works

By default this application will listen on port 8080.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine.

### Prerequisites

```
* JDK 11 or later
* Maven 2.2.7 or later
* Docker 19.0 or later
```

### Installing

Run `mvn package` to compile, test and create a package. The dockerfile maven plugin
will update the docker image for this project. 
```
mvn package
```

Start the docker container

```
docker-compose up
```

## Running the tests

You can run the tests by navigating into the root folder and using
```
mvn test
```

## Built With

* [Java 11](https://www.java.com/pt_BR/download/) - The language most people love to hate
* [Maven](https://gradle.org/) - Dependency Management
* [SpringBoot](http://spring.io/projects/spring-boot) - Framework used
* [Spring Initializr](https://start.spring.io/) - Bootstrap for SpringBoot applications
* [Docker](https://www.docker.com/) - Containers made simple

## Authors

* **Leonardo Marinho** - [Github](https://github.com/leonardomarinho) | [Deu Tilt](http://deutilt.com.br) | [Linkedin](http://linkedin.com/in/leonardomarinho)