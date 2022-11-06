# Spring Boot Multi-Module Maven Project with DDD
Spring Boot &amp; Multi-Module Maven Project following DDD Methodology.

Ref: https://dzone.com/articles/ddd-spring-boot-multi-module-maven-project

# My fork changes
I added PostgreSQL and Docker to this project.
For my feeling, it's helpful to see, how a database can be connected.

# Installation
```
docker-compose -f docker-compose.yml up -d --build
```

# Try it out
Add a customer to your DB
```
curl -XPOST 'http://localhost:8080/customer/MeinCustomer'
```
Load a customer from your DB
```
curl -XGET 'http://localhost:8080/customer/1'
```