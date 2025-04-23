🚀 Trello Automation Test Suite
This project is an automated test suite for Trello, developed using Selenium WebDriver with Java. It automates essential Trello workflows like board creation, list creation, list sorting, and board deletion.

📌 Features
✅ Automated login using secure credentials

📝 Create new Trello boards dynamically

📋 Create and manage multiple lists within a board

🔃 Sort lists alphabetically using drag-and-drop

🗑️ Delete boards with verification

🧱 Page Object Model (POM) for clean and maintainable code

⏱️ Smart wait strategies using explicit waits

📄 View Sample Test Report (HTML)

🧰 Tech Stack
Language: Java

Automation Tool: Selenium WebDriver

Build Tool: Maven

Testing Framework: TestNG

Design Pattern: Page Object Model (POM)

▶️ How to Run
Clone the repository:

bash
Copy
Edit
git clone https://github.com/LingesanSri/TrelloAutomation.git

cd TrelloAutomation

Install Dependencies: Ensure you have Java 8+ and Maven installed on your system. Then, run the following command to install dependencies:

bash
Copy
Edit
mvn clean install
Configuration: Update the config.properties file located in the resources directory with your Trello credentials (username and password).

Set up WebDriver: Ensure the WebDriver executable (e.g., ChromeDriver) is placed inside the drivers directory or specify the correct path in your system.

Run the tests: You can run the tests using Maven:

bash
Copy
Edit
mvn test
View the Report: After execution, you can view the test results in the TestNG Report located at:

plaintext
Copy
Edit
test-output/emailable-report.html
🗂️ Directory Structure
bash
Copy
Edit
TrelloAutomation/
│
├── src/main/java/                 # Java source files
│   ├── com/trello/                # Main project package
│       ├── pomrepository/         # Page Object Models (POM)
│       ├── testscripts/           # Test scripts
│       ├── genericutility/        # Utility classes for WebDriver, Excel, etc.
│
├── src/test/resources/            # Test resources (e.g., testdata.xlsx, config.properties)
│   ├── config.properties          # Configuration file with login credentials
│   ├── testdata.xlsx              # Excel data file with test inputs
│
├── drivers/                       # WebDriver executables (e.g., ChromeDriver)
│
├── pom.xml                        # Maven project configuration
└── README.md                      # Project overview


👥 Contributing
Fork this repository.

Create a new branch (git checkout -b feature-name).

Commit your changes (git commit -m 'Add new feature').

Push to the branch (git push origin feature-name).

Open a pull request.
