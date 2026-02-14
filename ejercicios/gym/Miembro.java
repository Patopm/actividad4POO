package ejercicios.gym;

/**
 * Clase Miembro - Representa un miembro del gimnasio
 */
public class Miembro {
  private String nombre;
  private int edad;
  private String tipoMembresia; // "básica" o "premium"
  private PlanEntrenamiento plan; // ASOCIACIÓN: Miembro tiene un Plan

  // Constructores
  public Miembro() {
    this.nombre = "Sin nombre";
    this.edad = 0;
    this.tipoMembresia = "básica";
  }

  public Miembro(String nombre, int edad, String tipoMembresia) {
    setNombre(nombre);
    setEdad(edad);
    setTipoMembresia(tipoMembresia);
  }

  public Miembro(Miembro otro) {
    this.nombre = otro.nombre;
    this.edad = otro.edad;
    this.tipoMembresia = otro.tipoMembresia;
    // No copiamos el plan (cada miembro tiene su propio plan)
  }

  // Getters y setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    if (nombre == null || nombre.trim().isEmpty()) {
      throw new IllegalArgumentException("El nombre no puede estar vacío");
    }
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    if (edad < 0 || edad > 120) {
      throw new IllegalArgumentException("Edad no válida");
    }
    this.edad = edad;
  }

  public String getTipoMembresia() {
    return tipoMembresia;
  }

  public void setTipoMembresia(String tipoMembresia) {
    if (tipoMembresia == null || (!tipoMembresia.equals("básica") && !tipoMembresia.equals("premium"))) {
      throw new IllegalArgumentException("Tipo de membresía inválido");
    }
    this.tipoMembresia = tipoMembresia;
  }

  public PlanEntrenamiento getPlan() {
    return plan;
  }

  public void setPlan(PlanEntrenamiento plan) {
    this.plan = plan;
  }

  // Método funcional
  public boolean tienePlanActivo() {
    return plan != null;
  }

  public void mostrarInfo() {
    System.out.println("--- Datos del Miembro ---");
    System.out.println("| - Nombre: " + getNombre());
    System.out.println("| - Edad: " + getEdad());
    System.out.println("| - Membresía: " + getTipoMembresia());
    if (plan != null) {
      System.out.println("| - Plan: " + getPlan().getNombrePlan());
    }

    System.out.println("------------------");
  }
}
