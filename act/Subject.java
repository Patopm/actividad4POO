package act;

/**
 * Represents a subject taught in the school.
 */
public class Subject {
  private String name;
  private String code;
  private int credits;
  private double weeklyHours;

  public Subject() {
    this.name = "Empty";
    this.code = "000";
    this.credits = 0;
    this.weeklyHours = 0.0;
  }

  public Subject(String name, String code, int credits, double weeklyHours) {
    this.name = name;
    this.code = code;
    this.credits = credits;
    this.weeklyHours = weeklyHours;
  }

  public Subject(Subject other) {
    this.name = other.name;
    this.code = other.code;
    this.credits = other.credits;
    this.weeklyHours = other.weeklyHours;
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public int getCredits() {
    return credits;
  }

  public void setCredits(int credits) {
    this.credits = credits;
  }

  public double getWeeklyHours() {
    return weeklyHours;
  }

  public void setWeeklyHours(double weeklyHours) {
    this.weeklyHours = weeklyHours;
  }

  @Override
  public String toString() {
    return name + " (" + code + ")";
  }
}
