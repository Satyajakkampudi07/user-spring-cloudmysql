
## IOspring

**IOspring** is a simple Spring Boot application that demonstrates integration with a MySQL database. It provides basic functionality to manage `User` entities through RESTful endpoints.

### Features

- **Add a User**: Create a new user in the database with their name and email.
- **Get All Users**: Retrieve a list of all users stored in the database.

### Technology Stack

- **Spring Boot**: Framework for building the application.
- **Spring Data JPA**: Simplifies database interactions.
- **MySQL**: Relational database used for persistence.


#### Prerequisites

- Java 11 or later
- Maven or Gradle
- MySQL database



4. **Run the Application**

   If using Maven:

   ```bash
   mvn spring-boot:run
   ```

**Test the Endpoints**

   - **Add a User**

     ```http
     POST http://localhost:8080/IOSpring/add -d name="yourname" -d email="example@xyz.com"
     ```

   - **Get All Users**

     ```http
     GET http://localhost:8080/IOSpring/all
     ```
