# 📘 SpringSecureNotes

A full-stack backend application built using **Java**, **Spring Boot**, and **MySQL**, featuring:

- User Registration & Login with password hashing
- Secure Note management (CRUD)
- REST APIs with full Swagger documentation
- Layered architecture (Controller → Service → Repository → Entity)
- Ready for frontend integration and JWT expansion

---

## 🔧 Tech Stack

- **Java 17+**
- **Spring Boot 3.x**
- **Spring Web**
- **Spring Data JPA**
- **Spring Security**
- **MySQL**
- **Swagger (springdoc-openapi)**

---

## 📂 Project Structure

src/
└── main/

├── java/

│ └── com.codecup.demo/

│ ├── controller/ # REST endpoints

│ ├── service/ # Business logic

│ ├── model/ # Entity classes (User, Note)

│ ├── repository/ # JPA interfaces

│ └── config/ # Security config

└── resources/

└── application.properties # DB + Hibernate config

## 🧪 API Features

### 🔐 Authentication

| Method | Endpoint            | Description         |
|--------|---------------------|---------------------|
| POST   | `/api/auth/register`| Register new user   |
| POST   | `/api/auth/login`   | Login with credentials |

### 📝 Notes Management

| Method | Endpoint                  | Description            |
|--------|---------------------------|------------------------|
| POST   | `/api/notes/add`          | Create a new note      |
| GET    | `/api/notes/{id}`         | Get note by ID         |
| GET    | `/api/notes/all`          | Get all notes          |
| PUT    | `/api/notes/update/{id}`  | Update a note          |
| DELETE | `/api/notes/delete/{id}`  | Delete a note          |

---

## ⚙️ Setup Instructions

### 🐳 Requirements:
- Java 17+
- Maven
- MySQL (create a database `userdb`)

### 📥 Clone and Run:

```bash
git clone https://github.com/your-username/SpringSecureNotes.git
cd SpringSecureNotes
```

### ⚙️ Configure application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


🛡️ Security Configuration
Passwords are hashed using BCryptPasswordEncoder

Public endpoints: /api/auth/**

All other endpoints are secured and can later be extended to JWT

🧪 API Testing
Use Postman or Swagger UI:

Swagger UI:
👉 http://localhost:8080/swagger-ui/index.html

✅ Completed Features

 User entity + registration & login

 Secure password hashing with BCrypt

 Note CRUD API with database persistence

 MySQL + JPA integration

 REST API documentation with Swagger

 Security config with public/private endpoints

📦 Future Improvements

🔐 JWT Token-based Auth

🧾 Note ownership by user

📱 React or Android frontend

🗃️ Pagination, filtering, search

