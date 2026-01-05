#  Student Management System

Hey there! 👋 This is a **Student Management System** built with Spring Boot. Think of it as your digital assistant for keeping track of students - whether you're running a school, a course, or just need to organize student information.

## What can it do?

This application helps you manage student records easily. Here's what you get:

-  **Add new students** - Quickly add students with their first name, last name, and email
-  **Edit student info** - Update any student's details whenever you need to
-  **View all students** - See all your students in a clean, organized table
-  **Delete students** - Remove students from the system when needed

Everything is just a few clicks away through a simple, user-friendly web interface!

## What's under the hood?

If you're curious about the tech stack, here's what makes this application tick:

- **Java 21** - The programming language powering everything
- **Spring Boot 3.5.6** - Makes building web applications a breeze
- **Spring Data JPA** - Handles all the database magic for us
- **Thymeleaf** - Creates those nice-looking web pages
- **MySQL** - Where all your student data is safely stored
- **Bootstrap 4** - Makes everything look pretty and responsive

## Getting Started

### Prerequisites

Before you dive in, make sure you have:
- Java 21 (or later) installed on your machine
- MySQL server up and running
- A database called `studentdb` created (or you can change it in the config)

### Setup Steps

1. **Get the code**
   ```bash
   git clone <your-repo-url>
   ```

2. **Configure your database**
   
   Open up `src/main/resources/application.properties` and update these lines with your own MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/studentdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC&useLegacyDatetimeCode=false
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```
   
   Don't worry - the project already comes with a template, just fill in your details!

3. **Open in your IDE**
   
   I recommend **Spring Tools Suite (STS)** or **IntelliJ IDEA**, but any Java IDE will work just fine.

4. **Run it!**
   
   Simply run the `Project2Application.java` file, or use Maven:
   ```bash
   mvn spring-boot:run
   ```

5. **Start managing students**
   
   Once it's running, open your browser and head to:
   ```
   http://localhost:8080
   ```
   
   You'll be automatically redirected to the student list page, and you're ready to go! 🎉

## How to Use

Once the application is running:

1. **View all students** - Go to `/students` (or just the home page `/`)
2. **Add a new student** - Click the "Add Student" button
3. **Edit a student** - Click "Update" next to any student in the list
4. **Delete a student** - Click "Delete" (you'll get a confirmation prompt to prevent accidents)

It's that simple! The interface is intuitive and straightforward, so you'll be managing students in no time.

## A Quick Note

The application uses Hibernate's auto-update feature, which means it will automatically create the database tables for you the first time you run it. No need to write SQL scripts manually - just make sure your database exists and your credentials are correct!
