# 🎓 Student Academic Management REST API

A RESTful API built using **Java and Spring Boot** to manage student academic records. This project demonstrates backend development fundamentals, including REST endpoints, JSON data exchange, and CRUD operations.

## 📌 Project Overview

The Student Academic Management REST API provides endpoints to create, retrieve, and update student information. It is designed as a backend application that can be tested using Postman and extended into a larger academic management system.

## ✨ Features

- Create student records
- Retrieve all student records
- Retrieve student details by ID
- Update existing student information
- Exchange data using JSON
- Test REST endpoints using Postman
- Follow a structured Spring Boot application architecture

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java | Programming language |
| Spring Boot | Backend application framework |
| Spring Web | Building REST APIs |
| Maven | Dependency management and build automation |
| JSON | API request and response format |
| Postman | API testing |
| IntelliJ IDEA | Development environment |
| Git & GitHub | Version control and project hosting |

## 📂 Project Structure

```text
Student-Academic-Management-REST-API/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── kiet/
│       │           └── classw/
│       │               ├── controller/
│       │               │   └── StudentController.java
│       │               ├── model/
│       │               │   └── Student.java
│       │               └── ClassWApplication.java
│       └── resources/
│           └── application.properties
├── pom.xml
├── .gitignore
└── README.md
```

*Note: The package directory structure may differ slightly depending on the actual project configuration.*

## 🚀 Getting Started

### Prerequisites

Install the following tools:

- Java Development Kit (JDK)
- IntelliJ IDEA or another Java IDE
- Maven
- Postman

### Installation

**1. Clone the repository**

```bash
git clone https://github.com/vggupta12112-cell/Student-Academic-Management-REST-API.git
```

**2. Open the project**

Open the cloned project in IntelliJ IDEA and allow Maven to download the required dependencies.

**3. Run the application**

Run `ClassWApplication.java` from IntelliJ IDEA.

Alternatively, from the project root, execute:

```bash
mvn spring-boot:run
```

**4. Access the API**

The application runs locally on port `8080`, unless configured otherwise.

Base URL:

```text
http://localhost:8080
```

## 🔌 API Endpoints

The following table describes the expected student CRUD endpoints. Confirm the exact mappings in `StudentController.java`.

| HTTP Method | Endpoint | Description |
|---|---|---|
| GET | `/students` | Retrieve all students |
| GET | `/students/{id}` | Retrieve a student by ID |
| POST | `/students` | Create a new student |
| PUT | `/students/{id}` | Update an existing student |

## 🧪 Testing with Postman

### 1. Retrieve all students

- Method: `GET`
- URL: `http://localhost:8080/students`

Click **Send** to retrieve the available student records.

### 2. Create a student

- Method: `POST`
- URL: `http://localhost:8080/students`
- Header: `Content-Type: application/json`
- Body: Select **raw → JSON**

Example request:

```json
{
  "studentId": 104,
  "name": "Vaibhav",
  "email": "vaibhav@example.com",
  "branch": "CSE(AI & ML)",
  "year": 2,
  "cgpa": 8.65
}
```

Adjust the request fields to match the `Student` model and the ID-generation logic implemented in the application.

### 3. Update a student

- Method: `PUT`
- URL: `http://localhost:8080/students/103`
- Header: `Content-Type: application/json`
- Body: Select **raw → JSON**

Example request:

```json
{
  "studentId": 103,
  "name": "Vaibhav",
  "email": "vaibhav@example.com",
  "branch": "CSE(AI & ML)",
  "year": 2,
  "cgpa": 8.65
}
```

The request body and URL must follow the update logic defined in `StudentController.java`.

## 📚 Learning Objectives

This project helps demonstrate practical understanding of:

- RESTful API design
- HTTP methods: GET, POST, and PUT
- Spring Boot application structure
- Controllers and model classes
- JSON serialization and deserialization
- Request handling and response generation
- API testing using Postman
- Version control using Git and GitHub

## 🔮 Future Enhancements

- Add DELETE functionality
- Integrate a relational database using Spring Data JPA
- Add input validation and centralized exception handling
- Implement pagination and search
- Add automated unit and integration tests
- Deploy the API to a cloud platform

## 👨‍💻 Author

**Vaibhav**

Computer Science and Engineering (AI & ML)

KIET Group of Institutions

GitHub: [vggupta12112-cell](https://github.com/vggupta12112-cell)

---

*This project is developed for learning and demonstrating backend development with Java and Spring Boot.*
