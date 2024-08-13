# OrangeHRM Automation Testing Suite

## Project Overview
This project is an automation testing suite for the OrangeHRM demo application. It covers key functionalities such as login, employee management, leave management, 
and more, using Selenium WebDriver and TestNG.

## Technologies Used
- **Programming Language:** Java
- **Testing Framework:** TestNG
- **Automation Tool:** Selenium WebDriver
- **Build Tool:** Maven
- **Version Control:** Git and GitHub
- **Reporting Tool:** Extent Reports (or Allure Reports)
- **CI/CD Integration:** Jenkins (optional)

## Project Structure
src/

orangehrm-automation/
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       └── java/
│           └── com/orangehrm/tests/
├── pom.xml
└── README.md



- `src/main/`: Contains the main application code (if any).
- `src/test/`: Contains the test code and test resources.

## Setup Instructions

### Prerequisites
- Java JDK 8 or above
- Maven

  2. Test Cases
Module 1: Login

Test Case 1.1: Verify that a user can log in with valid credentials.
Test Case 1.2: Verify that an error message is displayed for invalid credentials.
Test Case 1.3: Verify that a user can log out successfully.
Module 2: Employee Management

Test Case 2.1: Verify that an admin can add a new employee.
Test Case 2.2: Verify that an admin can search for an existing employee by name.
Test Case 2.3: Verify that an admin can edit an employee's information.
Module 3: Leave Management

Test Case 3.1: Verify that a user can apply for leave.
Test Case 3.2: Verify that an admin can approve or reject leave requests.
Test Case 3.3: Verify that a user can view their leave balance.
Module 4: Time Tracking

Test Case 4.1: Verify that a user can punch in and punch out.
Test Case 4.2: Verify that an admin can view the time sheets.
Test Case 4.3: Verify that a user can generate a report of their working hours.
Module 5: Admin Module

Test Case 5.1: Verify that an admin can add and remove user roles.
Test Case 5.2: Verify that an admin can reset a user's password.
Test Case 5.3: Verify that an admin can manage organizational settings.
Module 6: Recruitment Module

Test Case 6.1: Verify that an admin can post a job vacancy.
Test Case 6.2: Verify that a candidate can apply for a job.
Test Case 6.3: Verify that an admin can track the application status.
Module 7: PIM Module

Test Case 7.1: Verify that an employee can update personal information.
Test Case 7.2: Verify that an admin can update job details for an employee.
Test Case 7.3: Verify that an employee can upload documents to their
- Git

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/orangehrm-automation.git
