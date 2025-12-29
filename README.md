# Hibernate Student Management System

A simple **Student Management System** developed using **Java, Hibernate ORM, and SQLite/MySQL**.  
This project demonstrates the use of Hibernate annotations and ORM concepts for database operations.

---

## 🛠 Technologies Used
- Java
- Hibernate ORM
- Maven
- SQLite / MySQL
- Eclipse IDE

---

## ✨ Features
- Add Student details
- Hibernate annotation-based configuration
- Automatic table creation using Hibernate
- Supports both SQLite (file-based) and MySQL (server-based)
- No web server required

---

## 📁 Project Structure




src/main/java/com/app

├── Student.java # Entity class

├── HibernateUtil.java # Hibernate configuration

└── MainApp.java # Main application






---

## ▶ How to Run
1. Clone the repository
2. Open the project in Eclipse
3. Configure database details in `HibernateUtil.java`
4. Run `MainApp.java`
5. Student record will be inserted into the database

---

## 🗄 Database
- **SQLite**: Local file-based database (`students.db`)
- **MySQL**: Requires database `hibernate_db`

---

## 📌 Notes
- Database files are excluded using `.gitignore`
- Hibernate automatically creates tables using `hbm2ddl.auto`

---

## 👨‍💻 Author
**Kakarla Gnana Sathwick**

GitHub: https://github.com/Mrkakarla
