# SpringBootRestService

## Table of Contents

- [Introduction](#introduction)
- [Technical Info](#technical-info)
- [Requirements](#requirements)
- [Usage](#usage)
- [Test Coverage](#test-coverage)
- [Non-Tested Classes](#non-tested-classes)

## Introduction

This is a Spring Boot REST API with Swagger Documentation that uses Transactions and H2 as Database and Audit.

Should	be	able	to	create,	access,	find	accounts	and	to	be	able	to	transfer	money	between	them.	 

An	account	seen	by	a	REST	client	has	the	following	details:	 

- Name:	String		

- Currency:	Currency		

- Balance:	Money		

- Treasury:	Boolean		

The	requirements	are	the	following:	 

- Treasury	property	can	be	set	only	at	creation	time.	
- Only	treasury	accounts	(Treasury	property)	can	have	a	negative	balance.		
- Non	treasury	accounts	should	block	transfers	if	there	is	not	enough	balance.	


## Technical Info

The software was built using the following tools/platforms:
- [IBM cloud](http://75.126.254.59:8080/accounts) - The Operational System that I use
- [Java 8](https://www.java.com/pt_BR/) - **THE PROGRAMMING LANGUAGE**
- [Spring Boot 2.1.0](http://spring.io/projects/spring-boot) - The framework I use every day for building nice applications
- [H2 Database](http://www.h2database.com/html/main.html) - Database that can be used as a library http://75.126.254.59:8080/h2
- [Lombok](https://projectlombok.org/) - Framework used to reduce boilerplate code
- [SpringFox](http://springfox.github.io/springfox/) - Library used to generate Swagger Documentation and UI
- [Maven](https://maven.apache.org/) - Just Maven!
- [JUnit](https://junit.org/) - Used for tests
- [AssertJ](http://joel-costigliola.github.io/assertj/) - assertThat() like a *PRO*
- [Mockito](https://site.mockito.org/) - Mocking dependencies
- [Jacoco](https://www.eclemma.org/jacoco/trunk/doc/maven.html) - Test Coverage Library

## Usage

First, you have to generate the `jar` with `mvn`:

```sh
$ mvn clean install
```

You are ready to run with the command:

```sh
$ mvn springboot:run
```

The program will start embedded tomcat at port 8080, so you can now navigate to [Swagger UI](http://localhost:8080/swagger-ui.html)

Swagger Documentation could be reached [HERE](http://localhost:8080/v2/api-docs) and can be imported to Postman, for example.

## Test Coverage

I tried to focus on the application *CORE BUSINESS*, so not all the classes were not tested on purpose.

1. Test Coverage is 100% of Tested Classes
2. The Coverage is measured by Jacoco library that gives a HTML report that can be reached at `target/site/jacoco/index.html`

## Non-Tested Classes
1. `Exceptions` were not tested.
2. `SpringBootRestService` was nos tested
3. `JpaConfiguration` and `SwaggerConfig` were not tested 
3. `model` package was not tested, but the `Account` class was, because of the business logic methods
4. `DTOs` inside of `request` and `response` packages were not tested
5. `@NotSameAccount` annotation was not tested
