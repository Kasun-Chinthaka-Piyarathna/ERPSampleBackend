## ABC Company ERP Sample - Backend Implementation

### The backend was written using Spring Boot, JPA, Hibernate, and MySql.

Sample UI repository can be found here - https://github.com/Kasun-Chinthaka-Piyarathna/ERPSampleUI

### How can set up the repo

* Clone or Download the repository.
* Open the project using Intellij Idea IDE (You can use any Java-preferred IDE according to your preference).
* Install Mysql in your system and create a database. (I have created a database called erp)
* Make sure to update the application.properties file inside resources with your MySQL username, password, and database name.
* Go to the root of the project via terminal and run command - mvn install. 
* Run the main application class - SpringbbotMongoAtlasApplication

### Current Functionality

* Advanced authentication will be handled using JWTs - Login and Signup APIs
* Client Information - POST API
* Quotation - POST API
