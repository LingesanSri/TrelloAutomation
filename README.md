# 🧪 Trello Automation Suite

An end-to-end test automation suite for Trello built with **Java**, **Selenium WebDriver**, and **TestNG**. This project automates core Trello workflows such as logging in, board and list management, sorting lists alphabetically via drag-and-drop, and cleanup.

## 📌 Features

- 🔐 Automated login to Trello  
- 📋 Board and list creation  
- 🔄 Alphabetical list sorting (drag-and-drop)  
- 🧽 Cleanup via board deletion  
- 🚪 Logout functionality  
- 🧼 Page Object Model (POM) design  
- ⏱ Explicit wait strategy with WebDriverWait  
- 📊 Excel-based data-driven testing  
- 📋 Test management with `testng.xml` and method grouping  

## 🛠 Tech Stack

| Tech            | Details                 |
|-----------------|-------------------------|
| Language        | Java                    |
| Automation Tool | Selenium WebDriver      |
| Build Tool      | Maven                   |
| Test Framework  | TestNG                  |
| Data Source     | Apache POI + Excel      |
| Design Pattern  | Page Object Model (POM) |

## 🚀 Getting Started

### Prerequisites

- Java 11 or higher  
- Maven  
- Chrome browser  
- ChromeDriver (compatible version)

### Clone the Project

```bash
git clone https://github.com/LingesanSri/TrelloAutomation.git
cd TrelloAutomation


Configure Your Credentials
Edit config.properties in the resources/ folder:

email=your-email@example.com
password=yourPassword123

⚠️ Do not commit real credentials to version control.

Run Tests
Run the full grouped suite via TestNG:

mvn clean test -DsuiteXmlFile=testng.xml
Make sure your test methods in TrelloTestScripts.java use TestNG group annotations, like:

@Test(groups = "login")

📂 Project Structure

TrelloAutomation/
│
├── src/
│   ├── main/
│   │   └── java/                    
│   │       └── com/trello/pages/          # Page classes
│   └── test/
│       └── java/
│           └── com/trello/testscripts/   # Test scripts
│               └── TrelloTestScripts.java
│
├── resources/
│   ├── config.properties                 # Login details & config
│   └── TrelloExcelData.xlsx              # Test data from Excel
│
├── testng.xml                            # TestNG suite config
├── pom.xml                               # Maven config
└── README.md                             # You're reading this!
🧪 testng.xml

Your test suite is defined with grouped methods in TrelloTestScripts.java:

<?xml version="1.0" encoding="UTF-8"? verbrose"2">
<suite name="Trello Automation Suite">
  <test name="End-to-End">
    <classes>
      <class name="com.trello.testscripts.TrelloTestScripts"/>
    </classes>
  </test>
</suite>

✅ Test Coverage
Login/logout flow

Board creation from Excel data

List creation 

Drag-and-drop alphabetical sorting

Board deletion/cleanup

Organized execution with TestNG groups

📊 Excel Data
The TrelloExcelData.xlsx file contains test data for board and list names. Place it inside the resources/ folder and make sure the structure matches your data provider logic.

📸 Reports & Screenshots
Optional: Add test report links or attach screenshots here if available.

🤝 Contribution
Pull requests are welcome. Fork the repo and feel free to improve anything — whether it’s code, structure, or documentation.

📃 License
This project is licensed under the MIT License.

Built with 💻 by LingesanSri
