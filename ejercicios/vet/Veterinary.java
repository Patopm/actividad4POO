package ejercicios.vet;

public class Veterinary {
  private String name;
  private String employeeNumber;
  private String specialty;
  private int yearsOfExperience;
  private float commission;

  // Constructors
  public Veterinary() {
  }

  public Veterinary(String name, String employeeNumber, String specialty, int yearsOfExperience, float commission) {
    this.name = name;
    this.employeeNumber = employeeNumber;
    this.specialty = specialty;
    this.yearsOfExperience = yearsOfExperience;
    this.commission = commission;
  }

  public Veterinary(Veterinary v) {
    this(v.name, v.employeeNumber, v.specialty, v.yearsOfExperience, v.commission);
  }

  // Getters
  String getName() {
    return name;
  }

  String getEmployeeNumber() {
    return employeeNumber;
  }

  String getSpecialty() {
    return specialty;
  }

  int getYearsOfExperience() {
    return yearsOfExperience;
  }

  float getCommission() {
    return commission;
  }

  // Setters
  void setName(String n) {
    this.name = n;
  }

  void setEmployeeNumber(String en) {
    this.employeeNumber = en;
  }

  void setSpecialty(String s) {
    this.specialty = s;
  }

  void setYearsOfExperience(int y) {
    this.yearsOfExperience = y;
  }

  void setCommission(float c) {
    this.commission = c;
  }

  // Metodos
  @Override
  public String toString() {
    return "Veterinario: " + name + " | ID: " + employeeNumber +
        " | Especialidad: " + specialty + " | Experiencia: " +
        yearsOfExperience + " años";
  }
}
