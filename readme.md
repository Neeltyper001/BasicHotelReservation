# Hotel Reservation Project

This is a basic hotel reservation project implemented in Java with JDBC in MySQL. The application allows users to perform all CRUD operations (Create, Read, Update, Delete) on guest reservations.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Database Schema](#database-schema)
- [Contributing](#contributing)
- [License](#license)

## Features

- **Create Reservation**: Add a new guest reservation to the database.
- **View Reservations**: Retrieve information about all guest reservations.
- **Update Reservation**: Modify existing guest reservation details.
- **Delete Reservation**: Remove a guest reservation from the database.

## Prerequisites

- [Java 8+](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
- [MySQL](https://dev.mysql.com/downloads/)
- [JDBC driver for MySQL](https://dev.mysql.com/downloads/connector/j/)

## Installation

1. Clone the repository:
    ```shell
    git clone <repository_url>
    ```

2. Navigate to the project directory:
    ```shell
    cd project-directory
    ```

3. Set up the MySQL database and import the database schema.

4. Update the database configuration in the project code:
    - Open the project source code file(s) and locate the database configuration section.
    - Update the database URL, username, and password with your MySQL server details.

5. Compile and run the project:
    ```shell
    javac HotelReservationApp.java
    java HotelReservationApp
    ```

## Usage

Once the project is up and running, you can interact with it using a console-based interface. The app provides the following options:

- **1. Create Reservation**: Add a new reservation by providing guest details.
- **2. View Reservations**: Retrieve and display a list of all reservations.
- **3. Update Reservation**: Update the details of an existing reservation.
- **4. Delete Reservation**: Delete a reservation from the database.
- **0. Exit**: Exit the application.

Follow the on-screen prompts to navigate through the menu and perform the desired operations.

## Contribution
Contributions to this project are welcome! Feel free to open an issue or submit a pull request.

