package ejercicio.gym;

/**
 * Clase Ejercicio - Representa un ejercicio físico
 *
 */
public class Ejercicio {
  private String nombre;
  private int series;
  private int repeticiones;
  private int duracionMinutos;

  // =====================================================
  // CONSTRUCTOR POR DEFECTO (COMPLETAR)
  // Inicializa con valores predeterminados
  // =====================================================
  public Ejercicio() {
    nombre = "Sin nombre";
    series = 0;
    repeticiones = 0;
    duracionMinutos = 0;
  }

  // =====================================================
  // CONSTRUCTOR CON PARÁMETROS (COMPLETAR)
  // Inicializa con valores específicos
  // =====================================================
  public Ejercicio(
      String nombre,
      int series,
      int repeticiones,
      int duracionMinutos) {
    this.nombre = nombre;
    this.series = series;
    this.repeticiones = repeticiones;
    this.duracionMinutos = duracionMinutos;
  }

  // =====================================================
  // CONSTRUCTOR DE COPIA (COMPLETAR)
  // Crea una copia de otro objeto Ejercicio
  // =====================================================
  public Ejercicio(Ejercicio e) {
    this(e.nombre, e.series, e.repeticiones, e.duracionMinutos);
  }

  // =====================================================
  // GETTERS Y SETTERS (COMPLETAR)
  // =====================================================
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    if (nombre == "")
      throw new IllegalArgumentException("El nombre no puede estar vacio");
    this.nombre = nombre;
  }

  public int getSeries() {
    return series;
  }

  public void setSeries(int series) {
    if (series < 0)
      throw new IllegalArgumentException("Las series no pueden ser menores a 0");
    this.series = series;
  }

  public int getRepeticiones() {
    return repeticiones;
  }

  public void setRepeticiones(int repeticiones) {
    if (repeticiones < 0)
      throw new IllegalArgumentException("Las repeticiones no pueden ser menores a 0");
    this.repeticiones = repeticiones;
  }

  public int getDuracionMinutos() {
    return duracionMinutos;
  }

  public void setDuracionMinutos(int duracionMinutos) {
    if (duracionMinutos < 0)
      throw new IllegalArgumentException("La duracion no puede ser menor a 0");
    this.duracionMinutos = duracionMinutos;
  }

  // =====================================================
  // MÉTODO FUNCIONAL (COMPLETAR)
  // Calcula la duración total del ejercicio (series * duracionMinutos)
  // =====================================================
  public int getDuracionTotal() {
    return (duracionMinutos * series);
  }

  // =====================================================
  // MÉTODO PARA MOSTRAR INFORMACIÓN (COMPLETAR)
  // =====================================================
  public void mostrarInfo() {
    System.out.println("--- Ejercicio ---");
    System.out.println("| - Nombre: " + getNombre());
    System.out.println("| - Series: " + getSeries());
    System.out.println("| - Repeticiones: " + getRepeticiones());
    System.out.println("| - Duracion: " + getDuracionTotal());
    System.out.println("-----------------");
  }
}
