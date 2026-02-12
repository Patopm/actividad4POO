package ejercicios.vet;

import java.util.List;

public class Owner {
  private String name;
  private String rfc;
  private String phone;

  // Constructors
  public Owner() {
  }

  public Owner(String name, String rfc, String phone) {
    this.name = name;
    this.rfc = rfc;
    this.phone = phone;
  }

  public Owner(Owner o) {
    this.name = o.name;
    this.rfc = o.rfc;
    this.phone = o.phone;
  }

  // Getters
  String getName() {
    return name;
  }

  String getRFC() {
    return rfc;
  }

  String getPhone() {
    return phone;
  }

  // Setters
  void setName(String n) {
    this.name = n;
  }

  void setRFC(String rfc) {
    this.rfc = rfc;
  }

  void setPhone(String p) {
    this.phone = p;
  }

  // Metodos
  @Override
  public String toString() {
    return "Dueño: " + name + " | RFC: " + rfc + " | Tel: " + phone;
  }
}
