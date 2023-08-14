
# Microservice Project using OpenFeign

This repository contains a microservice project that demonstrates how to build a microservice application using OpenFeign to connect an employee microservice with an address microservice.

## Overview

This project showcases the usage of OpenFeign, an open-source declarative REST client, to consume REST API endpoints exposed by microservices. It consists of two microservices:

1. **Employee Service**: This microservice retrieves employee details and addresses.
2. **Address Service**: This microservice provides address information for employees.

The Employee Service uses OpenFeign to communicate with the Address Service, enabling a seamless integration between the two microservices.

## Dependencies

- Java 17
- Spring Boot 3.0.2
- Spring Cloud Starter OpenFeign
- MySQL
- ModelMapper
- Spring Data JPA


