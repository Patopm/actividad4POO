package act;

/**
 * Represents a teacher in the school.
 */
public class Professor extends Person {
  private String payrollId;
  private double hourlyWage;
  private Subject assignedSubject;

  public Professor() {
    super();
    this.payrollId = "0000";
    this.hourlyWage = 0.0;
  }

  public Professor(String name, String payrollId, double hourlyWage, Subject subject) {
    super(name);
    this.payrollId = payrollId;
    this.hourlyWage = hourlyWage;
    this.assignedSubject = subject;
  }

  public Professor(Professor other) {
    super(other.name);
    this.payrollId = other.payrollId;
    this.hourlyWage = other.hourlyWage;
    this.assignedSubject = (other.assignedSubject != null) ? new Subject(other.assignedSubject) : null;
  }

  /**
   * Calculates the weekly salary based on hours of the assigned subject.
   * Salary formula: \( S = h \times w \)
   * 
   * @return Weekly salary amount.
   */
  public double calculateWeeklySalary() {
    if (assignedSubject == null)
      return 0.0;
    return assignedSubject.getWeeklyHours() * hourlyWage;
  }

  public String getPayrollId() {
    return payrollId;
  }

  public void setPayrollId(String payrollId) {
    this.payrollId = payrollId;
  }

  public Subject getAssignedSubject() {
    return assignedSubject;
  }

  public void setAssignedSubject(Subject assignedSubject) {
    this.assignedSubject = assignedSubject;
  }
}
