# CRUD Employee Management

CRUD Employee Management is a **Spring Boot** application that provides functionality for managing employees using basic **CRUD (Create, Read, Update, Delete)** operations. This project is designed to run locally and leverages basic web dependencies for seamless operation.

## Features

- **Create** new employee records.
- **Read** employee information (individual and list).
- **Update** existing employee details.
- **Delete** employee records.
- RESTful API endpoints for CRUD operations.
- Lightweight, easy-to-run local server.

## Prerequisites

Before running the application, ensure you have the following installed:

- [JDK 17 or higher](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) (JDK 21 is recommended for this project).
- [Maven](https://maven.apache.org/) (for managing dependencies and building the project).
- A database (e.g., H2, MySQL, or PostgreSQL).

## How to Run the Project

1. **Clone the repository:**

   ```bash
   git clone https://github.com/anish-18github/CRUD-Employee_Managementnt.git
## Configure the database:

Update the application.properties file in the src/main/resources directory with your database configuration:

```bash
   spring.datasource.url=jdbc:h2:mem:testdb
   spring.datasource.driverClassName=org.h2.Driver
   spring.datasource.username=<Your mysql Workspace username>
   spring.datasource.password=<Your mysql Workspace password>
   spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```


## Build and run the application:


```bash
    mvn clean install
    mvn spring-boot:run

```
# Access the application:

The application runs locally on http://localhost:8080.




## API Endpoints

#### Get all Employees

```http
  GET http://localhost:8080/api/items
```

|        Method   | Endpoint     | Description                |
| :-------------- | :------- | :------------------------- |
| `GET` | `/get/employee` | Fetch all employees |

#### Get Employee By Id

```http
  GET http://localhost:8080/api/items/${id}
```

|        Method   | Endpoint     | Description                |
| :-------------- | :------- | :------------------------- |
| `GET` | `/get/employee/{id}` |Fetch a single employee by ID |

#### Add emlpoyee

```http
  POST http://localhost:8080/api/items
```

|        Method   | Endpoint     | Description                |
| :-------------- | :------- | :------------------------- |
| `POST` | `/add/employee` |Create a new employee |

#### Update Employee By Id

```http
  PUT http://localhost:8080/api/items/${id}
```

|        Method   | Endpoint     | Description                |
| :-------------- | :------- | :------------------------- |
| `PUT` | `/update/employee/{id}` |Update an existing employee |

#### Delete Employee By Id

```http
  DELETE http://localhost:8080/api/items/${id}
```

|        Method   | Endpoint     | Description                |
| :-------------- | :------- | :------------------------- |
| `GET` | `/delete/employee/{id}` |Delete an employee by ID |




## Dependencies

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- MySQL Connector
- Lombok

## Technologies Used

- Java 17
- Spring Boot 3
- Maven
- H2 Database (default, can be replaced with MySQL/PostgreSQL)
## Front End UI

Git Repository : [CRUD Front End UI](https://github.com/anish-18github)
## Authors

- [@anish-18github](https://github.com/anish-18github)

