package ejercicios.vet;

public class Service {
  private String name;
  private float price;
  private int duration; // in minutes

  // Constructors
  public Service() {
  }

  public Service(String name, float price, int duration) {
    this.name = name;
    this.price = price;
    this.duration = duration;
  }

  public Service(Service s) {
    this.name = s.name;
    this.price = s.price;
    this.duration = s.duration;
  }

  // Getters
  String getName() {
    return name;
  }

  float getPrice() {
    return price;
  }

  int getDuration() {
    return duration;
  }

  // Setters
  void setName(String n) {
    this.name = n;
  }

  void setPrice(float p) {
    this.price = p;
  }

  void setDuration(int d) {
    this.duration = d;
  }

  // Metodos
  @Override
  public String toString() {
    return "Servicio: " + name + " | Precio: $" + price +
        " | Duración: " + duration + " min";
  }
}
