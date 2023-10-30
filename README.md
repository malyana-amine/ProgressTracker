# Geneiryodan Corporate ProgressTracker

![ProgressTracker Logo](https://maghreb.simplonline.co/_next/image?url=https%3A%2F%2Fsimplonline-v3-prod.s3.eu-west-3.amazonaws.com%2Fmedia%2Fimage%2Fpng%2Fprogress-tracker-653abf0f8b0a0022494992.png&w=1280&q=75)

## Project Context

"Geneiryodan Corporate" is an IT company aiming to modernize the management of progress and objectives. As a member of the development team, you've been entrusted with the mission to create a progress tracking application called "ProgressTracker" using the Spring framework.

## Project Objective

The goal of this project is to design an application that will manage users, their progress objectives, and track their achievements. This application will use the Spring framework for dependency management and configuration, providing a solid and modular structure for development.

## Key Tasks

The "ProgressTracker" project includes the following tasks:

### Creating User and Goal Classes

Create Java classes for the "User" and "Goal" entities. These classes should define the necessary attributes for users (e.g., ID, name, avatar) and progress goals (e.g., ID, description, completion status).

### Bean Configuration

Configure the "User" and "Goal" classes as Spring beans in an XML-based Spring configuration file (spring-config.xml). Ensure that you define singleton and prototype scopes for users as per the project's requirements.

### Dependency Injection

Create a service class named "ServiceProgressTracker" and inject instances of "User" and "Goal" into it using Spring. Implement methods within this class to assign goals to users, update their progress, and track their achievements using dependency injection.

### Adding Spring Data

Configure the data source in your Spring configuration. You can choose either XML-based or Java-based configuration depending on the project's needs and the database infrastructure being used.

### Main Application

Create a "Main" class that loads the Spring configuration file and demonstrates the features of the "ProgressTracker" application. Retrieve the beans from the Spring container and use "ServiceProgressTracker" to assign goals to users, track their progress, and perform other essential operations.

## Prerequisites

Before starting the development of the "ProgressTracker" application, make sure you have the following tools installed:

- JDK (Java Development Kit)
- Spring Framework
- Database Management System (if applicable)

## Configuration

Ensure the Spring configuration file (spring-config.xml) is correctly set up and the necessary dependencies are defined to make the application run smoothly.

## Getting Started

1. Clone this repository to your local system.
2. Import the project into your development environment.
3. Ensure the prerequisites are met, and the Spring configuration is correct.
4. Run the "Main" class to launch the "ProgressTracker" application.

## Authors

- Your Name
- Collaborator 1
- Collaborator 2

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for more details.

---

Feel free to contribute to this project by submitting pull requests and reporting issues. For any questions or suggestions, please contact us at [aminemalyana12@email.com].

*Copyright © 2023 Geneiryodan Corporate. All rights reserved.*
