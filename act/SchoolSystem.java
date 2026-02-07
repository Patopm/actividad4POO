package act;

/**
 * Main class to demonstrate the school control system.
 */
public class SchoolSystem {
  public static void main(String[] args) {
    Subject math = new Subject("Advanced Math", "MAT101", 10, 5.5);
    Subject physics = new Subject("Quantum Physics", "PHY202", 12, 6.0);
    Subject programming = new Subject("Java Programming", "CS303", 8, 4.0);

    Course scienceCourse = new Course("Science & Tech", math, physics, programming);

    Professor prof = new Professor("Dr. Alan Turing", "P-998", 50.0, programming);

    Student student = new Student("John Doe", "ST-2026", 20, scienceCourse);

    System.out.println("--- School System Report ---");
    System.out.println("Student: " + student.getName() + " (" + student.getEnrollmentId() + ")");
    System.out.println("Enrolled in: " + student.getEnrolledCourse().getName());
    System.out.println("Total Course Credits: " + student.getEnrolledCourse().getTotalCredits());

    System.out.println("\nProfessor: " + prof.getName());
    System.out.println("Teaches: " + prof.getAssignedSubject().getName());
    System.out.printf("Weekly Salary: $%.2f%n", prof.calculateWeeklySalary());
  }
}
