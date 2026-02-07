package act;

/**
 * Represents a student enrolled in a specific course.
 */
public class Student extends Person {
  private String enrollmentId;
  private int age;
  private Course enrolledCourse;

  public Student() {
    super();
    this.enrollmentId = "S000";
    this.age = 0;
  }

  public Student(String name, String enrollmentId, int age, Course course) {
    super(name);
    this.enrollmentId = enrollmentId;
    this.age = age;
    this.enrolledCourse = course;
  }

  public Student(Student other) {
    super(other.name);
    this.enrollmentId = other.enrollmentId;
    this.age = other.age;
    this.enrolledCourse = (other.enrolledCourse != null) ? new Course(other.enrolledCourse) : null;
  }

  public String getEnrollmentId() {
    return enrollmentId;
  }

  public void setEnrollmentId(String id) {
    this.enrollmentId = id;
  }

  public Course getEnrolledCourse() {
    return enrolledCourse;
  }

  public void setEnrolledCourse(Course course) {
    this.enrolledCourse = course;
  }
}
