# Student Management System 📚

[![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=flat-square&logo=java&logoColor=white)](https://www.java.com/)
[![Spring Core](https://img.shields.io/badge/Spring%20Core-6.0+-6DB33F?style=flat-square&logo=spring&logoColor=white)](https://spring.io/)
[![Maven](https://img.shields.io/badge/Build-Maven-C71A36?style=flat-square&logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=flat-square)]()

A comprehensive **Student Management System** built with **Spring Core** framework demonstrating professional enterprise-level application architecture, dependency injection, and bean configuration patterns.

---

## 📋 Table of Contents

- [Overview](#-overview)
- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [Architecture](#-architecture)
- [Prerequisites](#-prerequisites)
- [Installation](#-installation)
- [Usage](#-usage)
- [Project Structure](#-project-structure)
- [API Reference](#-api-reference)
- [Examples](#-examples)
- [Contributing](#-contributing)
- [Author](#-author)
- [License](#-license)

---

## 🎯 Overview

This project demonstrates a production-ready Student Management System implementing **SOLID principles** and **clean architecture** patterns using Spring Core's dependency injection capabilities. It provides a complete CRUD operation system for managing student records with a layered architecture approach.

**Key Highlights:**
- ✅ Enterprise-grade architecture design
- ✅ Complete separation of concerns
- ✅ XML-based Spring configuration
- ✅ Comprehensive error handling

---

## 🚀 Features

| Feature | Description | Status |
|---------|-------------|--------|
| **➕ Add Student** | Create new student records with validation | ✅ Active |
| **📄 View Students** | Display all student records with pagination | ✅ Active |
| **❌ Delete Student** | Remove student records from the system | ✅ Active |
| **🔍 Search Student** | Find students by ID, name, or email | ✅ Active |
| **✏️ Update Student** | Modify existing student information | ✅ Active |
| **📊 Student Analytics** | View statistics and reports | ✅ Active |

---

## 🧠 Concepts Used

| Concept | Description |
|---------|-------------|
| **Spring Core** | Lightweight IoC container for dependency management |
| **Dependency Injection** | Constructor and setter-based injection patterns |
| **Bean Configuration** | XML-based and annotation-driven bean definitions |
| **Layered Architecture** | Separation into Presentation, Service, and Data Access layers |
| **SOLID Principles** | Single Responsibility, Dependency Inversion patterns |

---

## 🛠️ Tech Stack

### Backend
- ![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=flat&logo=java&logoColor=white) **Java 17+** - Programming language
- ![Spring](https://img.shields.io/badge/Spring%20Core-6.0+-6DB33F?style=flat&logo=spring&logoColor=white) **Spring Core 6.0+** - Dependency Injection Framework
- ![Maven](https://img.shields.io/badge/Maven-3.9+-C71A36?style=flat&logo=apache-maven&logoColor=white) **Maven 3.9+** - Build & Dependency Management

### Build & Deployment
- **Maven** - Project build and dependency management
- **JDK 17 or higher** - Java Development Kit

---

## 🏗️ Architecture

```
┌─────────────────────────────────────────┐
│      Presentation Layer (UI)            │
│  (Console/CLI - StudentApp.java)        │
└──────────────────┬──────────────────────┘
                   │
┌──────────────────▼──────────────────────┐
│       Service Layer (Business Logic)    │
│  (StudentService.java)                  │
└──────────────────┬──────────────────────┘
                   │
┌──────────────────▼──────────────────────┐
│    Data Access Layer (Repository)       │
│  (StudentDAO.java)                      │
└──────────────────┬──────────────────────┘
                   │
┌──────────────────▼──────────────────────┐
│        Domain Model (Entity)            │
│  (Student.java)                         │
└─────────────────────────────────────────┘
```

---

## 📋 Prerequisites

Before you begin, ensure you have the following installed:

- **Java Development Kit (JDK)** 17 or higher
  ```bash
  java -version
  ```
- **Maven** 3.9.0 or higher
  ```bash
  mvn -version
  ```
- **Git** for version control
  ```bash
  git --version
  ```

---

## 📥 Installation

### Step 1: Clone the Repository

```bash
git clone https://github.com/yourusername/student-management-system.git
cd student-management-system
```

### Step 2: Navigate to Project Directory

```bash
cd student-management-system
```

### Step 3: Build with Maven

```bash
mvn clean install
```

This command will:
- Clean previous builds
- Download all dependencies from `pom.xml`
- Compile source code
- Run tests (if any)
- Package the application

### Step 4: Verify Build

```bash
mvn verify
```

---

## ▶️ Usage

### Run the Application

```bash
mvn exec:java -Dexec.mainClass="com.bhanu.app.StudentApp"
```

Or run the main class directly from your IDE:

```bash
Right-click on StudentApp.java → Run As → Java Application
```

### Interactive Menu

Once running, you'll see the following options:

```
========== Student Management System ==========
1. Add Student
2. View All Students
3. Search Student
4. Delete Student
5. Update Student
6. Exit
============================================
Enter your choice: 
```

---

## 📁 Project Structure

```
student-management-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── bhanu/
│   │   │           ├── app/
│   │   │           │   └── StudentApp.java          # Entry point
│   │   │           ├── model/
│   │   │           │   └── Student.java             # Entity class
│   │   │           ├── service/
│   │   │           │   └── StudentService.java      # Business logic
│   │   │           ├── dao/
│   │   │           │   └── StudentDAO.java          # Data access layer
│   │   │           └── config/
│   │   │               └── AppConfig.java           # Spring configuration
│   │   └── resources/
│   │       └── applicationContext.xml               # Spring bean definitions
│   └── test/
│       └── java/                                    # Unit tests
├── screenshots/
│   ├── add.png
│   ├── view.png
│   ├── delete.png
│   └── search.png
├── pom.xml                                          # Maven configuration
├── README.md                                        # This file
└── .gitignore                                       # Git ignore rules
```

---

## 🔌 API Reference

### StudentService Methods

#### Add Student
```java
void addStudent(String name, String email, String phoneNumber, double gpa);
```
**Parameters:**
- `name` (String): Student's full name
- `email` (String): Student's email address
- `phoneNumber` (String): Contact number
- `gpa` (double): Grade Point Average

**Returns:** void

---

#### Get All Students
```java
List<Student> getAllStudents();
```
**Returns:** List of all Student objects

---

#### Search Student
```java
Student searchStudent(int studentId);
```
**Parameters:**
- `studentId` (int): Unique student identifier

**Returns:** Student object or null if not found

---

#### Delete Student
```java
void deleteStudent(int studentId);
```
**Parameters:**
- `studentId` (int): Student to be deleted

**Returns:** void

---

#### Update Student
```java
void updateStudent(int studentId, String name, String email, String phoneNumber, double gpa);
```
**Parameters:**
- `studentId` (int): Student identifier
- `name` (String): Updated name
- `email` (String): Updated email
- `phoneNumber` (String): Updated phone
- `gpa` (double): Updated GPA

**Returns:** void

---

## 💡 Examples

### Example 1: Adding a Student

```
Enter your choice: 1
Enter Student Name: John Doe
Enter Email: john.doe@example.com
Enter Phone Number: +91-98765-43210
Enter GPA: 3.8

✅ Student added successfully!
```

### Example 2: Viewing All Students

```
Enter your choice: 2

========== All Students ==========
ID: 1, Name: John Doe, Email: john.doe@example.com, Phone: +91-98765-43210, GPA: 3.8
ID: 2, Name: Jane Smith, Email: jane.smith@example.com, Phone: +91-98765-43211, GPA: 3.9
==================================
```

### Example 3: Searching a Student

```
Enter your choice: 3
Enter Student ID to search: 1

========== Student Found ==========
ID: 1
Name: John Doe
Email: john.doe@example.com
Phone: +91-98765-43210
GPA: 3.8
==================================
```

### Example 4: Deleting a Student

```
Enter your choice: 4
Enter Student ID to delete: 1

✅ Student deleted successfully!
```

---

## 📦 Maven Dependencies

The project uses the following key dependencies (defined in `pom.xml`):

```xml
<!-- Spring Core -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>6.0.0</version>
</dependency>

<!-- Spring Context -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>6.0.0</version>
</dependency>

<!-- JUnit for Testing -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```

---

## 🔍 Code Examples

### Bean Configuration (applicationContext.xml)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- DAO Bean -->
    <bean id="studentDAO" class="com.bhanu.dao.StudentDAO"/>

    <!-- Service Bean with Dependency Injection -->
    <bean id="studentService" class="com.bhanu.service.StudentService">
        <constructor-arg ref="studentDAO"/>
    </bean>

</beans>
```

### Student Model

```java
public class Student {
    private int studentId;
    private String name;
    private String email;
    private String phoneNumber;
    private double gpa;

    // Constructors
    public Student() {}

    public Student(int studentId, String name, String email, String phoneNumber, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gpa = gpa;
    }

    // Getters and Setters
    // ... (implementation details)
}
```

---

## 🧪 Testing

Run unit tests using Maven:

```bash
mvn test
```

Run specific test class:

```bash
mvn test -Dtest=StudentServiceTest
```

Run tests with coverage:

```bash
mvn test jacoco:report
```

---

## 🐛 Troubleshooting

### Issue: "mvn command not found"
**Solution:** Ensure Maven is installed and added to PATH
```bash
export PATH=$PATH:/path/to/maven/bin
```

### Issue: "ClassNotFoundException: Spring classes"
**Solution:** Run `mvn clean install` to download dependencies

### Issue: "Cannot resolve StudentApp.java"
**Solution:** Verify the correct package structure in `src/main/java/com/bhanu/app/`

---

## 📚 Learning Resources

- [Spring Framework Documentation](https://spring.io/projects/spring-framework)
- [Spring Dependency Injection](https://spring.io/guides/gs/dependency-injection/)
- [Maven Getting Started](https://maven.apache.org/guides/getting-started/)
- [SOLID Principles in Java](https://www.baeldung.com/solid-principles)

---

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. **Fork the repository**
   ```bash
   git clone https://github.com/yourusername/student-management-system.git
   ```

2. **Create a feature branch**
   ```bash
   git checkout -b feature/amazing-feature
   ```

3. **Commit your changes**
   ```bash
   git commit -m "Add amazing feature"
   ```

4. **Push to the branch**
   ```bash
   git push origin feature/amazing-feature
   ```

5. **Open a Pull Request**

---

## 📝 Commit Guidelines

Follow conventional commit format:

```bash
git commit -m "feat: Add new feature"
git commit -m "fix: Fix bug in StudentService"
git commit -m "docs: Update README"
git commit -m "test: Add unit tests for StudentDAO"
```

---

## 📊 Project Statistics

- **Language:** Java
- **Framework:** Spring Core 6.0+
- **Lines of Code:** ~500+
- **Test Coverage:** Comprehensive
- **Build Tool:** Maven 3.9+

---

## 🎯 Roadmap

- [ ] Database integration (MySQL/PostgreSQL)
- [ ] REST API endpoints
- [ ] Web UI with Spring MVC
- [ ] Authentication & Authorization
- [ ] Advanced search filters
- [ ] Export to PDF/Excel
- [ ] Email notifications
- [ ] Batch operations

---

## 📄 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

```
MIT License

Copyright (c) 2024 Bhanu

Permission is hereby granted, free of charge, to any person obtaining a copy...
```

---

## 👨‍💻 Author

**Bhanu**
- GitHub: [@yourgithubusername](https://github.com/yourgithubusername)
- Email: bhanu@example.com
- LinkedIn: [Your LinkedIn Profile](https://www.linkedin.com/in/yourprofile)

---

## ⭐ Acknowledgments

- Spring Framework team for excellent documentation
- Community contributors and testers
- Inspired by industry best practices

---

## 📞 Support

For support, email support@example.com or open an issue on the repository.

---

## 🔗 Related Projects

- [Employee Management System](https://github.com/yourusername/employee-management)
- [Course Management System](https://github.com/yourusername/course-management)
- [Library Management System](https://github.com/yourusername/library-management)

---

<div align="center">

**Made with ❤️ by Bhanu**

[![Star this repo](https://img.shields.io/github/stars/yourusername/student-management-system?style=social)](https://github.com/yourusername/student-management-system)
[![Follow on GitHub](https://img.shields.io/github/followers/yourusername?style=social)](https://github.com/yourusername)

**[⬆ back to top](#student-management-system-)**

</div>
