💰 Monthly Expense Tracker Application

This project is a simple, single-page application (SPA) built to track personal monthly expenses. It demonstrates a foundational Model-View-Controller (MVC) architecture using the Java Spring Boot framework.

🚀 Key Technologies and Architecture

This application is built using a modern Java stack, focusing on stability, convention, and rapid development.

1. Spring Boot (Java Backend)

The entire application logic is powered by Java and the Spring Boot framework.

MVC Pattern: The code is cleanly separated into dedicated layers:

Model (Expense.java): The core data entity representing a single expense record.

Repository (ExpenseRepository.java): Handles data access (CRUD operations) using Spring Data JPA.

Service (ExpenseService.java): Contains the business logic, such as calculating the monthly total and finding expenses for the current month.

Controller (ExpenseController.java): Maps HTTP requests (e.g., GET / and POST /save) to business logic and prepares data for the view.

2. Maven (Build and Dependency Management)

Maven is used as the project's build tool. It manages all dependencies (libraries) and handles the packaging and execution of the application. The pom.xml file specifies all required components:

spring-boot-starter-web: Provides embedded Tomcat for running the application.

spring-boot-starter-data-jpa: Connects the application to the database.

thymeleaf: The view layer template engine.

h2: The in-memory database used for easy development.

3. HTML & Thymeleaf (Frontend View)

The user interface is a single page rendered using plain HTML enhanced by Thymeleaf. Thymeleaf allows the backend (Java/Spring) to dynamically inject data (like the list of expenses and the monthly total) directly into the HTML template (index.html).

✨ Project Features

View Monthly Expenses: Displays a list of all expenses recorded for the current month.

Expense Summary: Calculates and displays the total amount spent for the month.

Add New Expense: Simple form to input a new expense (description, amount, date, and category).

Delete Expense: Allows removal of individual expense records.

In-Memory Database: Uses H2 for rapid development and testing, ensuring data is kept secure and available while the application is running.

🛠️ Getting Started (Running the Application)

Prerequisites

Java Development Kit (JDK 17+)

Apache Maven

Running via IntelliJ IDEA (Recommended)

Project Setup: Use the Spring Initializr in IntelliJ to create the project structure.

File Placement: Ensure all Java files are in src/main/java/com/expensetracker/ and index.html is in src/main/resources/templates/.

Run: Open ExpenseTrackerApplication.java and click the green "Play" arrow next to the main method.

Access the Application

Once the application successfully starts (look for "Started ExpenseTrackerApplication..." in the console):

Open your web browser and navigate to:

http://localhost:8080/


🔗 Version Control Integration

This project is configured for Git using a comprehensive .gitignore file to ensure only necessary source code is committed, excluding IDE files (.idea), build outputs (target/), and operating system files.

To Push to GitHub:

Initialize the project locally (VCS → Enable Version Control).

Add all source files (Git → Add).

Commit your changes (VCS → Commit...).

Ensure a remote repository is created on GitHub.

Push your local commits to the remote repository (Git → Push...).
