# 💰 Monthly Expense Tracker Application

This project is a simple, single-page application (SPA) built to track personal monthly expenses.  
It demonstrates a foundational **Model-View-Controller (MVC)** architecture using the **Java Spring Boot** framework.

---

## 🚀 Key Technologies and Architecture

This application is built using a modern **Java stack**, focusing on stability, convention, and rapid development.

### 1. 🧩 Spring Boot (Java Backend)

The entire application logic is powered by **Java** and the **Spring Boot** framework.

#### MVC Pattern
The code is cleanly separated into dedicated layers:

- **Model (`Expense.java`)** – The core data entity representing a single expense record.  
- **Repository (`ExpenseRepository.java`)** – Handles data access (CRUD operations) using Spring Data JPA.  
- **Service (`ExpenseService.java`)** – Contains the business logic, such as calculating the monthly total and finding expenses for the current month.  
- **Controller (`ExpenseController.java`)** – Maps HTTP requests (e.g., `GET /` and `POST /save`) to business logic and prepares data for the view.

---

### 2. ⚙️ Maven (Build and Dependency Management)

**Maven** is used as the project’s build tool.  
It manages all dependencies and handles the packaging and execution of the application.

**`pom.xml`** includes the following key dependencies:

- `spring-boot-starter-web`: Provides embedded Tomcat for running the application.  
- `spring-boot-starter-data-jpa`: Connects the application to the database.  
- `thymeleaf`: Template engine for rendering dynamic views.  
- `h2`: In-memory database used for easy development and testing.

---

### 3. 🎨 HTML & Thymeleaf (Frontend View)

The user interface is a single page rendered using **plain HTML** enhanced by **Thymeleaf**.  
Thymeleaf allows the backend to dynamically inject data (like the list of expenses and the monthly total) directly into the HTML template (`index.html`).

---

## ✨ Project Features

✅ **View Monthly Expenses** – Displays a list of all expenses recorded for the current month.  
✅ **Expense Summary** – Calculates and displays the total amount spent for the month.  
✅ **Add New Expense** – Simple form to input a new expense (description, amount, date, and category).  
✅ **Delete Expense** – Allows removal of individual expense records.  
✅ **In-Memory Database (H2)** – Enables rapid development and testing with a lightweight, in-memory DB.

---

## 🛠️ Getting Started (Running the Application)

### Prerequisites
- Java Development Kit (**JDK 17+**)  
- **Apache Maven**

---

### 🚀 Running via IntelliJ IDEA (Recommended)

1. **Project Setup:** Use **Spring Initializr** in IntelliJ to create the project structure.  
2. **File Placement:**  
   - Java files → `src/main/java/com/expensetracker/`  
   - HTML template → `src/main/resources/templates/index.html`  
3. **Run the Application:**  
   Open `ExpenseTrackerApplication.java` and click the green ▶️ icon next to the `main()` method.

---

### 🌐 Access the Application

Once the application successfully starts (look for: in the console),

open your web browser and navigate to:

👉 [http://localhost:8080/](http://localhost:8080/)

---

## 🔗 Version Control Integration

This project is configured for **Git** using a comprehensive `.gitignore` file to ensure only necessary source code is committed — excluding:
- IDE files (`.idea/`)  
- Build outputs (`target/`)  
- Operating system files  

### 🧠 To Push to GitHub

1. **Initialize the project locally:**  
   `VCS → Enable Version Control (Git)`
2. **Add all source files:**  
   `Git → Add`
3. **Commit your changes:**  
   `VCS → Commit...`
4. **Create a remote repository on GitHub.**
5. **Push your local commits:**  
   `Git → Push...`

---

## 📁 Project Structure

ExpenseTracker/
├── src/
│ ├── main/
│ │ ├── java/com/expensetracker/
│ │ │ ├── model/Expense.java
│ │ │ ├── repository/ExpenseRepository.java
│ │ │ ├── service/ExpenseService.java
│ │ │ ├── controller/ExpenseController.java
│ │ │ └── ExpenseTrackerApplication.java
│ │ └── resources/
│ │ ├── templates/index.html
│ │ └── application.properties
├── pom.xml
└── README.md


---

## 🧾 License
This project is open source and available under the [MIT License](LICENSE).

---

**👨‍💻 Developed by:** *Yashasvi Patel*  
📧 *yashasvipatel19@gmail.com*  
📍 *Toronto, ON, Canada*

