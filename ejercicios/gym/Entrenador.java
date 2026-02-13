package ejercicios.gym;

/**
 * Clase Entrenador - Representa un entrenador del gimnasio
 */
public class Entrenador {
  private String nombre;
  private String especialidad;
  private String certificacion;

  // Constructores
  public Entrenador() {
    this.nombre = "Sin nombre";
    this.especialidad = "General";
    this.certificacion = "Ninguna";
  }

  public Entrenador(String nombre, String especialidad, String certificacion) {
    this.nombre = nombre;
    this.especialidad = especialidad;
    this.certificacion = certificacion;
  }

  public Entrenador(Entrenador otro) {
    this.nombre = otro.nombre;
    this.especialidad = otro.especialidad;
    this.certificacion = otro.certificacion;
  }

  // Getters y setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEspecialidad() {
    return especialidad;
  }

  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }

  public String getCertificacion() {
    return certificacion;
  }

  public void setCertificacion(String certificacion) {
    this.certificacion = certificacion;
  }

  public void mostrarInfo() {
    System.out.println("--- Entrenador ---");
    System.out.println("| - Nombre: " + getNombre());
    System.out.println("| - Especialidad: " + getEspecialidad());
    System.out.println("| - Certificacion: " + getCertificacion());
    System.out.println("------------------");
  }
}
