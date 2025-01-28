# Quiz-Application

## Overview

The **Quiz Application** is an interactive web-based platform designed to engage users with quizzes on various topics. This project allows Users to create quizzes and manage questions via microservices.

## Features

- **Microservices Architecture**: Built using spring Boot to ensure scalability and modularity for managing quizzes and questions.
- **Quiz Management**: Users can create, update, and delete quizzes and questions.
- **Flexible Question Type**: Supports multiple-choice, supports Questions by specific topic.

## Technologies Used

- **Backend**: Spring Boot (Microservices Architecture)
- **Database**: PostgreSQL
- **Version Control**: Git

## Installation

1. Clone the repository:
    ```bash
   git clone https://github.com/sabrek15/Quiz-Application.git
    ```
   
2. Navigate ot the project directory:
    ```bash
   cd Quiz-Application
    ```

3. Install dependencies:
    ```bash
   mvn install
    ```
   
4. Set up the database:
   - Ensure PostgreSQL is running locally or provide a connection string in the application.properties file
   - Example application.properties file:
     ```bash
     spring.datasource.url=jdbc:postgresql://localhost:5432/quizdb
     spring.datasource.username=your-username
     spring.datasource.password=your-password
     spring.jpa.hibernate.ddl-auto=update
     ```
5. Start the application:
    ```bash
   mvn spring-boot:run
    ```
   
6. Open your browser and navigate to the appropriate endpoints(e.g. https://localhost:8080).

## Contributing

Contributions are welcome! Follow these steps to contribute:

1. Fork the repository.

2. Create a new branch:
    ```bash
   git checkout -b feature-name
    ```
   
3. Make your changes and commit them:
    ```bash
   git commit -m "Descriptions of changes"
    ```
   
4. Push your changes:
    ```bash
   git push origin feature-name
    ```

5. Submit a pull request.