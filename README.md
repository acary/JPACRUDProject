# JPACRUDProject

### Description

JobBird is a virtual mascot that helps developers find their next job.

JobBird is an application made up of Spring Boot and Java Persistence Application (JPA) with a MySQL database.

### Functionality:
- Show All Jobs
- Search Job By ID
- Create: Add New Job
- Read: Show Job By ID
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
- `JobDAO`: Defines database methods
- `JobDaoJpaImpl`: Implements JobDAO
- `Job`: Job object

### Lessons Learned

- Java Persistence Query Language (JPQL) provides the ability to construct Structured Query Language (SQL) queries (including joins and binding variables) with Java and MySQL to provide robust interactivity embedded in a Java application.
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
