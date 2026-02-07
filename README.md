# School Control System

This project is a Java-based school management system that handles students, professors, courses, and subjects using Advanced Object-Oriented Programming concepts.

## Features
- **Inheritance**: Both `Student` and `Professor` extend a base `Person` class.
- **Composition**: A `Course` is strictly made of three `Subject` objects.
- **Aggregation**: Professors and Students hold references to Subjects and Courses respectively.
- **Calculated Fields**:
    - Weekly salary based on subject hours.
    - Total course credits based on the sum of subject credits.

## Class Diagram Logic
- **Person**: Shared attributes (Name).
- **Subject**: Core data (Name, Code, Credits, Hours).
- **Course**: Aggregates 3 subjects and calculates total credits.
- **Professor**: Includes payroll data and links to a Subject.
- **Student**: Includes enrollment data and links to a Course.

## How to Run
1. Ensure you have JDK 8 or higher installed.
2. Compile all files:
   ```bash
   javac *.java
   ```
3. Run the main class:
   ```bash
   java SchoolSystem
   ```

## Example Output
```text
--- School System Report ---
Student: John Doe (ST-2026)
Enrolled in: Science & Tech
Total Course Credits: 30

Professor: Dr. Alan Turing
Teaches: Java Programming
Weekly Salary: $200.00
```

## Relationships Explained
- **Composition**: In the `Course` class, the `subjects` array represents a composition because the course defines the academic structure.
- **Aggregation**: The `Professor` class uses aggregation for `Subject` because a subject exists in the catalog regardless of whether a specific teacher is assigned to it.
- **Inheritance**: Used to avoid code duplication for common attributes like `name`.
