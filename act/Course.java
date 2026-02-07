package act;

/**
 * Represents a course composed of exactly three subjects.
 */
public class Course {
  private String name;
  private Subject[] subjects;

  public Course() {
    this.name = "New Course";
    this.subjects = new Subject[] { new Subject(), new Subject(), new Subject() };
  }

  public Course(String name, Subject s1, Subject s2, Subject s3) {
    this.name = name;
    this.subjects = new Subject[] { s1, s2, s3 };
  }

  public Course(Course other) {
    this.name = other.name;
    this.subjects = new Subject[3];
    for (int i = 0; i < 3; i++) {
      this.subjects[i] = new Subject(other.subjects[i]);
    }
  }

  /**
   * Calculates total credits by summing the credits of its three subjects.
   * 
   * @return sum of subject credits.
   */
  public int getTotalCredits() {
    int total = 0;
    for (Subject s : subjects) {
      total += s.getCredits();
    }
    return total;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Subject[] getSubjects() {
    return subjects;
  }
}
