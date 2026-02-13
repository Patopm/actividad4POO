package ejercicios.gym;

import java.util.List;
import java.util.Arrays;

/**
 * Clase PlanEntrenamiento - Representa un plan de entrenamiento
 *
 * Características:
 * - Tiene exactamente 5 ejercicios (COMPOSICIÓN)
 * - Un Plan pertenece a un Miembro
 */
public class PlanEntrenamiento {
  private String nombrePlan;
  private String objetivo;
  private List<Ejercicio> ejercicios; // Exactly 5 ejercicios
  private Miembro miembro; // ASOCIACIÓN: Plan pertenece a un Miembro

  // =====================================================
  // CONSTRUCTORES (COMPLETAR)
  // =====================================================
  public PlanEntrenamiento() {
    nombrePlan = "Sin nombre";
    objetivo = "Sin objetivo";
    ejercicios = Arrays.asList(new Ejercicio[5]);
    miembro = new Miembro();
  }

  public PlanEntrenamiento(
      String nombrePlan,
      String objetivo,
      Miembro miembro) {
    this.nombrePlan = nombrePlan;
    this.objetivo = objetivo;
    this.miembro = miembro;
    ejercicios = Arrays.asList(new Ejercicio[5]);
  }

  public PlanEntrenamiento(PlanEntrenamiento p) {
    this(p.nombrePlan, p.objetivo, p.miembro);
    for (int i = 0; i < p.ejercicios.size(); i++) {
      this.ejercicios.set(i, new Ejercicio(p.ejercicios.get(i)));
    }
  }

  // =====================================================
  // MÉTODO PARA AGREGAR EJERCICIO (COMPLETAR)
  // Agrega un ejercicio a la lista (máximo 5)
  // =====================================================
  public void agregarEjercicio(Ejercicio e) {
    if (ejercicios.size() >= 5) {
      throw new Exception("Maxima cantidad de ejercicios alcanzada.");
    }
    ejercicios.add(e);
  }

  // =====================================================
  // MÉTODO FUNCIONAL (COMPLETAR)
  // Calcula la duración total de todos los ejercicios
  // =====================================================
  public int getDuracionTotalPlan() {
    return ejercicios
        .stream()
        .map(Ejercicio::getDuracionTotal)
        .reduce(0, Integer::sum);
  }

  // =====================================================
  // GETTERS Y SETTERS (COMPLETAR)
  // =====================================================
  public String getNombrePlan() {
    return nombrePlan;
  }

  public void setNombrePlan(String nombrePlan) {
    this.nombrePlan = nombrePlan;
  }

  public String getObjetivo() {
    return objetivo;
  }

  public void setObjetivo(String objetivo) {
    this.objetivo = objetivo;
  }

  public List<Ejercicio> getEjercicios() {
    return ejercicios;
  }

  public Miembro getMiembro() {
    return miembro;
  }

  public void setMiembro(Miembro miembro) {
    this.miembro = miembro;
  }

  public void mostrarInfoPlan() {
    System.out.println("--- Datos del Miembro ---");
    System.out.println("| - Nombre: " + getNombrePlan());
    System.out.println("| - Duracion total: " + getDuracionTotalPlan());
    System.out.println("| - Objetivo: " + getObjetivo());
    System.out.println("| - Miembro: " + getMiembro());
    System.out.println("| - Ejercicios: ");
    for (Ejercicio e : ejercicios) {
      e.mostrarInfo();
    }
    System.out.println("------------------");
  }
}
