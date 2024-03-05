Selenium_Project_1_BugBusters

Java Selenium Project: Account Management

Overview:
This Java Selenium project focuses on automating various scenarios related to account management on a web application. We used https://www.akakce.com website to automize our tests. It utilizes Selenium WebDriver for browser automation and Java for scripting.

Scenarios Covered:

1. Successful Account Creation Scenario:

Automates the process of creating a new account on the web application.
Enters valid information such as username, email, password, etc.
Verifies successful creation by checking for the presence of a confirmation message or redirect to the user dashboard.

2. Creation Scenario with Missing Information:

Tests the behavior of the application when attempting to create an account with missing information.
Simulates scenarios where required fields such as email, password, etc., are left blank.
Verifies that appropriate error messages are displayed prompting the user to provide the missing information.

3. Account Verification Check:

Validates the account verification process.
Verifies that an email or SMS verification link/code is sent upon account creation.
Automates the verification process and confirms successful verification.

4. Logout - Successful Situation:

Automates the logout process from the user account.
Verifies successful logout by confirming the user is redirected to the login page or another appropriate landing page.

5. Successful Login:

Tests the login functionality with valid credentials.
Enters correct email and password combinations.
Verifies successful login by checking for the presence of elements unique to the user dashboard or homepage.

6. Invalid Login Attempt with Incorrect Email and/or Password:

Tests the behavior of the application when attempting to login with incorrect credentials.
Provides incorrect email and/or password combinations.
Verifies that appropriate error messages are displayed, indicating invalid login credentials.

7. Failed Login Attempt with Empty (Null) Email and/or Password:

Checks the application's response when attempting to login with empty (null) email and/or password fields.
Verifies that the login button remains disabled or appropriate error messages are displayed prompting the user to enter valid credentials.

8. Order List Check:

Automates the process of checking the user's order history or list of previous transactions.
Verifies that the order list is displayed correctly with accurate details such as order date, status, etc.

9. Message Box Check:

Tests the functionality of the message box feature on the application.
Automates sending and receiving messages between users.
Verifies that messages are sent and received successfully, and the message box UI functions as expected.

10. Account Deletion and Negative Scenarios:

Automates the account deletion process.
Tests scenarios where the user attempts to delete their account with valid and invalid passwords.
Verifies that the account is deleted successfully with a valid password and appropriate error messages are displayed for invalid password scenarios.

Tools Used:

Java programming language for test scripting.
Selenium WebDriver for browser automation.
TestNG or JUnit for test case management and execution.
Maven for project management and dependency management.

Conclusion:
This Java Selenium project provides comprehensive test coverage for various account management scenarios, ensuring the functionality and security of the web application. It helps in identifying and addressing any issues related to account creation, login, logout, verification, and deletion, thereby enhancing the overall user experience.
