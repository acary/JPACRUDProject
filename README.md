# JPACRUDProject

### Description

JobBird is a virtual mascot that helps developers find their next job.

JobBird is an application made up of Spring Boot and Java Persistence Application (JPA) with a MySQL database.

### Functionality:
- Show All Jobs
- Search Jobs By ID
- Search Jobs By Keyword
- Add New Job
- Show Job Details
- Update Job
- Delete Job

##### Running the program:
```
- Import project into Spring Tool Suite (STS)
- Compile and run main (as Spring Boot App) in `JobBirdApplication.java`
- Note: Must run MySQL with relevant database (jobdb) locally
```

### Classes

- `JobBirdApplication`: Application for job board
- `JobController`: Defines request mappings
- `JobDAO`: Defines database methods
- `JobDaoJpaImpl`: Implements JobDAO
- `Job`: Job object
- `JobTest`: JUnit tests for entity mappings

### Lessons Learned

- Java Persistence Query Language (JPQL) provides the ability to construct Structured Query Language (SQL) queries (including joins and binding variables) with Java and MySQL to provide robust interactivity embedded in a Java application.
- Spring Boot integrates with JPA to connect web functionality with a database-backed application.
- MySQL Workbench provides tools to forward engineer a database including sample data.
- Coding to the interface which defines the database access methods helps separate concerns related to implementation.

### Technologies Used

- Spring Boot
- Java Persistence Application (JPA)
- MySQL
- JavaSE-1.8
  - Interfaces
  - Collections; List, ArrayList
- Eclipse IDE

### Author

- Andy Cary (@acary)
