package ejercicios.vet;

import java.time.LocalDateTime;

public class Consult {
  private Pet pet;
  private Veterinary vet;
  private Service service;
  private LocalDateTime scheduledAt;
  private float totalCost;

  // Constructors
  public Consult() {
  }

  public Consult(Pet pet, Veterinary vet, Service service, LocalDateTime scheduledAt) {
    this.pet = pet;
    this.vet = vet;
    this.service = service;
    this.scheduledAt = scheduledAt;
    this.totalCost = service.getPrice() * (1 + (vet.getCommission() / 100));
  }

  public Consult(Consult c) {
    this.scheduledAt = c.scheduledAt;
    this.totalCost = c.totalCost;
  }

  // Getters
  LocalDateTime getScheduledAt() {
    return scheduledAt;
  }

  float getTotalCost() {
    return totalCost;
  }

  // Setters
  void setScheduledAt(LocalDateTime s) {
    this.scheduledAt = s;
  }

  void setTotalCost(float t) {
    this.totalCost = t;
  }

  // Metodos
  @Override
  public String toString() {
    return "Consulta [" + scheduledAt + "] -> " + pet.getName() +
        " | Veterinario: " + vet.getName() +
        " | Servicio: " + service.getName() +
        " | Costo: $" + totalCost;
  }
}
