package ejercicios.gym;

import java.util.Scanner;

/**
 * Menú Interactivo - Completa este método
 */
public class MenuGimnasio {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int opcion;
    do {
      mostrarMenu();
      while (!sc.hasNextInt()) {
        System.out.print("Por favor, introduce un número válido: ");
        sc.next();
      }
      opcion = sc.nextInt();
      sc.nextLine(); // Limpiar buffer
      switch (opcion) {
        case 1 -> createMember();
        case 2 -> createExcercise();
        case 3 -> createPlan();
        case 4 -> createTrainer();
        case 5 -> System.out.println("Saliendo del programa...");
        default -> System.out.println("Opción inválida");
      }
    } while (opcion != 5);
  }

  public static void mostrarMenu() {
    System.out.println("\n=== MENÚ GIMNASIO ===");
    System.out.println("1. Crear miembro");
    System.out.println("2. Crear ejercicio");
    System.out.println("3. Crear plan de entrenamiento");
    System.out.println("4. Crear entrenador");
    System.out.println("5. Salir");
    System.out.print("Elige una opción: ");
  }

  private static void createMember() {
    System.out.println("\n=== CREAR MIEMBRO ===");
    System.out.print("Nombre: ");
    String nombre = sc.nextLine();
    System.out.print("Edad: ");
    int edad = sc.nextInt();
    sc.nextLine(); // Limpiar buffer
    System.out.print("Tipo de membresía (básica/premium): ");
    String membresia = sc.nextLine();

    Miembro miembro = new Miembro(nombre, edad, membresia);
    System.out.println("Miembro creado exitosamente:");
    miembro.mostrarInfo();
  }

  private static void createExcercise() {
    System.out.println("\n=== CREAR EJERCICIO ===");
    System.out.print("Nombre del ejercicio: ");
    String nombre = sc.nextLine();
    System.out.print("Número de series: ");
    int series = sc.nextInt();
    System.out.print("Número de repeticiones: ");
    int reps = sc.nextInt();
    System.out.print("Duración por serie (min): ");
    int duracion = sc.nextInt();
    sc.nextLine(); // Limpiar buffer

    Ejercicio ejercicio = new Ejercicio(nombre, series, reps, duracion);
    System.out.println("Ejercicio creado exitosamente.");
    ejercicio.mostrarInfo();
  }

  private static void createPlan() {
    System.out.println("\n=== CREAR PLAN DE ENTRENAMIENTO ===");
    System.out.print("Nombre del plan: ");
    String nombrePlan = sc.nextLine();
    System.out.print("Objetivo: ");
    String objetivo = sc.nextLine();

    // El plan requiere un Miembro según el constructor definido
    Miembro dummyMiembro = new Miembro("Usuario Temporal", 0, "básica");
    PlanEntrenamiento plan = new PlanEntrenamiento(
        nombrePlan,
        objetivo,
        dummyMiembro);

    System.out.println("=== AGREGAR EJERCICIOS (máx 5) ===");
    for (int i = 1; i <= 5; i++) {
      System.out.println("Ejercicio " + i + ":");
      System.out.print("Nombre: ");
      String nombreE = sc.nextLine();
      System.out.print("Series: ");
      int series = sc.nextInt();
      System.out.print("Repeticiones: ");
      int reps = sc.nextInt();
      System.out.print("Duración: ");
      int duracion = sc.nextInt();
      sc.nextLine(); // Limpiar buffer

      Ejercicio e = new Ejercicio(nombreE, series, reps, duracion);
      plan.agregarEjercicio(e);
    }

    System.out.println("\nPlan creado exitosamente:");
    plan.mostrarInfoPlan();
  }

  private static void createTrainer() {
    System.out.println("\n=== CREAR ENTRENADOR ===");
    System.out.print("Nombre: ");
    String nombre = sc.nextLine();
    System.out.print("Especialidad: ");
    String especialidad = sc.nextLine();
    System.out.print("Certificación: ");
    String certificacion = sc.nextLine();

    Entrenador entrenador = new Entrenador(nombre, especialidad, certificacion);
    System.out.println("Entrenador creado exitosamente:");
    entrenador.mostrarInfo();
  }
}
