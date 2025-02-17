# Spring Boot API with Postgres

## Description

A Spring Boot API that connects to a PostgreSQL database using JPA to perform CRUD operations on a `Student` table in the `StudentDB` database.

## Features

- CRUD operations on the `Student` table
- PostgreSQL integration using JPA

## Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/springboot-postgres-api.git
   ```

2. Update your database connection in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/StudentDB
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

- **POST /students**: Create a new student
- **GET /students**: List all students
- **GET /students/{id}**: Get student by ID
- **PUT /students/{id}**: Update a student by ID
- **DELETE /students/{id}**: Delete a student by ID

