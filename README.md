# TaskFlow API

TaskFlow is a backend task management API built with Java, Spring Boot, and PostgreSQL.

I built the project to practise developing REST APIs with a layered architecture, database integration, DTOs, validation, and filtering.

## Features

* Create tasks
* View all tasks
* View a task by ID
* Update existing tasks
* Delete tasks
* Filter tasks
* Request validation
* DTO-based request and response handling
* PostgreSQL database persistence
* Centralised error handling

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Maven
* REST API

## Project Structure

The application follows a layered structure:

```text
src/main/java/
└── TaskFlow/
    ├── controller/
    ├── service/
    ├── repository/
    ├── dto/
    ├── model/
    ├── config/
    └── exception/
```

### Controller

Handles incoming HTTP requests and exposes the REST API endpoints.

### Service

Contains the main business logic used by the application.

### Repository

Handles communication with the PostgreSQL database using Spring Data JPA.

### DTO

Used to control the data sent between the API and clients instead of exposing database entities directly.

### Exception Handling

Provides consistent responses when errors occur, such as invalid requests or missing tasks.

## API Endpoints

```text
GET     /api/tasks
GET     /api/tasks/{id}
POST    /api/tasks
PUT     /api/tasks/{id}
DELETE  /api/tasks/{id}
```

The API also supports filtering tasks based on available task properties.

## Running the Project

### Requirements

* Java
* Maven
* PostgreSQL

Clone the repository:

```bash
git clone https://github.com/Thenu19/taskflow-api.git
```

Move into the project:

```bash
cd taskflow-api
```

Run the application:

```bash
mvn spring-boot:run
```

## About the Project

I built TaskFlow to strengthen my backend development skills with Spring Boot and to understand how a REST API is structured beyond a basic CRUD example.

During the project I worked with controllers, services, repositories, DTOs, validation, database integration, filtering, and exception handling.

## Author

**Thenuka Gunawardhana**
