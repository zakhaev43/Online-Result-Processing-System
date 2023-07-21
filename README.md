# Online Result Processing System

Welcome to the Online Result Processing System project! This project was developed in 2015 and serves as a small-scale functioning system for managing and processing exam results online.

## Features

### Back-End (Admin)

The back-end of the Online Result Processing System offers various administrative features:

- **Users Management:** The system includes different types of admins, such as course teachers, head of the examination board, and the university registrar. Each admin type has specific access privileges:
  - Course teachers can only access the courses they have taught.
  - Head of the examination officer has access to courses that were examined during specific times.
  - The university registrar has access to all functionalities.
  
- **Course Management:** Admins can add, delete, and edit courses within the system.

- **Student Information Management:** The university registrar can add or edit student information in the system.

- **Marks Management:** Admins can input and manage marks for specific students and courses.

### Front-End

The front-end of the Online Result Processing System provides the following features:

- **Homepage:** The homepage displays lists of recently finished exams and a search bar where students can search for their results.

- **Exam Results:** Students can check their exam results online through the system.

## Technology Stack

As this was one of the first Java projects, the architecture might not be fully organized. Here are the technologies used:

- Frontend: HTML, CSS, Bootstrap, JavaScript, and jQuery.

- Backend: JavaServer Pages (JSP) and Servlets were used for processing server-side logic.

- Database: Oracle was used to store the system's data.

## Note

Please keep in mind that this project might have some code and design limitations, as it was developed early in the developer's learning journey.

## Installation

To set up the Online Result Processing System, follow these steps:

1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Set up the Oracle database and import the provided database schema.
3. Clone this repository and import it into your preferred Java EE development environment (e.g., Eclipse, IntelliJ).
4. Configure the database connection details in the application settings.
5. Deploy the application on your local server.

## Contribution

While this project may have some imperfections due to its early development, we welcome contributions from the community to improve and enhance the system. If you find any issues or have suggestions for improvement, feel free to submit a pull request.

## License

The Online Result Processing System project is open-source and available under the [MIT License](LICENSE). You are free to use, modify, and distribute the code as per the terms of the license.

Thank you for exploring the Online Result Processing System project. If you have any questions or need assistance, feel free to contact us. Happy coding!
