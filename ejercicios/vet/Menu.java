package ejercicios.vet;

import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Menu {
  private static Scanner sc = new Scanner(System.in);
  private static List<Owner> owners = new ArrayList<>();
  private static List<Pet> pets = new ArrayList<>();
  private static List<Veterinary> vets = new ArrayList<>();
  private static List<Service> services = new ArrayList<>();
  private static List<Consult> consults = new ArrayList<>();

  public static void main(String[] args) {
    int opcion;
    do {
      System.out.println("\n=== SISTEMA DE GESTIÓN VETERINARIA ===");
      System.out.println("1. Registrar Dueño");
      System.out.println("2. Registrar Mascota");
      System.out.println("3. Registrar Veterinario");
      System.out.println("4. Registrar Servicio");
      System.out.println("5. Crear Consulta");
      System.out.println("6. Listar Consultas");
      System.out.println("0. Salir");
      System.out.print("Seleccione una opción: ");
      opcion = sc.nextInt();
      sc.nextLine();

      switch (opcion) {
        case 1 -> registrarDueno();
        case 2 -> registrarMascota();
        case 3 -> registrarVeterinario();
        case 4 -> registrarServicio();
        case 5 -> crearConsulta();
        case 6 -> listarConsultas();
        case 0 -> System.out.println("Saliendo del sistema...");
        default -> System.out.println("Opción inválida.");
      }
    } while (opcion != 0);
  }

  private static void registrarDueno() {
    System.out.print("Nombre: ");
    String n = sc.nextLine();
    System.out.print("RFC: ");
    String r = sc.nextLine();
    System.out.print("Teléfono: ");
    String p = sc.nextLine();
    owners.add(new Owner(n, r, p));
    System.out.println(">> Dueño registrado exitosamente.");
  }

  private static void registrarMascota() {
    if (owners.isEmpty()) {
      System.out.println("No hay dueños registrados. Registre primero uno.");
      return;
    }
    System.out.println("Seleccione el dueño de la mascota:");
    for (int i = 0; i < owners.size(); i++)
      System.out.println((i + 1) + ". " + owners.get(i));

    System.out.print("Opción: ");
    int idx = sc.nextInt();
    sc.nextLine();
    if (idx < 1 || idx > owners.size()) {
      System.out.println("Dueño inválido.");
      return;
    }

    Owner owner = owners.get(idx - 1);

    System.out.print("Nombre de la mascota: ");
    String name = sc.nextLine();
    System.out.print("Especie: ");
    String species = sc.nextLine();
    System.out.print("Edad: ");
    int age = sc.nextInt();
    System.out.print("Peso (kg): ");
    float weight = sc.nextFloat();
    sc.nextLine();

    pets.add(new Pet(name, species, age, weight, owner));
    System.out.println(">> Mascota registrada para " + owner.getName());
  }

  private static void registrarVeterinario() {
    System.out.print("Nombre: ");
    String n = sc.nextLine();
    System.out.print("Número de empleado: ");
    String num = sc.nextLine();
    System.out.print("Especialidad: ");
    String esp = sc.nextLine();
    System.out.print("Años de experiencia: ");
    int exp = sc.nextInt();
    sc.nextLine();
    System.out.print("Comisión por servicio: ");
    float comm = sc.nextFloat();
    sc.nextLine();

    vets.add(new Veterinary(n, num, esp, exp, comm));
    System.out.println(">> Veterinario registrado.");
  }

  private static void registrarServicio() {
    System.out.print("Nombre del servicio: ");
    String n = sc.nextLine();
    System.out.print("Precio: ");
    float p = sc.nextFloat();
    System.out.print("Duración (minutos): ");
    int d = sc.nextInt();
    sc.nextLine();

    services.add(new Service(n, p, d));
    System.out.println(">> Servicio registrado.");
  }

  private static void crearConsulta() {
    if (owners.isEmpty() || pets.isEmpty() || vets.isEmpty() || services.isEmpty()) {
      System.out.println("Faltan datos. Asegúrese de tener dueños, mascotas, veterinarios y servicios.");
      return;
    }

    System.out.println("====================");
    System.out.println("Seleccione el dueño:");
    for (int i = 0; i < owners.size(); i++)
      System.out.println((i + 1) + ". " + owners.get(i));
    System.out.println("====================");
    int ownerId = sc.nextInt();
    sc.nextLine();
    Owner owner = owners.get(ownerId - 1);

    List<Pet> ownersPets = pets.stream()
        .filter(m -> m.getOwner().equals(owner)).toList();
    if (ownersPets.isEmpty()) {
      System.out.println("Este dueño no tiene mascotas registradas.");
      return;
    }

    System.out.println("====================");
    System.out.println("Seleccione la mascota:");
    for (int i = 0; i < ownersPets.size(); i++)
      System.out.println((i + 1) + ". " + ownersPets.get(i));
    System.out.println("====================");
    int petId = sc.nextInt();
    sc.nextLine();
    Pet pet = ownersPets.get(petId - 1);

    System.out.println("====================");
    System.out.println("Seleccione veterinario:");
    for (int i = 0; i < vets.size(); i++)
      System.out.println((i + 1) + ". " + vets.get(i));
    System.out.println("====================");
    int vetId = sc.nextInt();
    sc.nextLine();
    Veterinary vet = vets.get(vetId - 1);

    System.out.println("====================");
    System.out.println("Seleccione servicio:");
    for (int i = 0; i < services.size(); i++)
      System.out.println((i + 1) + ". " + services.get(i));
    System.out.println("====================");
    int servId = sc.nextInt();
    sc.nextLine();
    Service serv = services.get(servId - 1);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
        "yyyy-MM-dd HH:mm");
    LocalDateTime scheduled = null;

    while (scheduled == null) {
      System.out.println("Ingrese la fecha a agendar el servicio (formato: yyyy-MM-dd HH:mm):");
      String userInput = sc.nextLine();

      try {
        scheduled = LocalDateTime.parse(userInput, formatter);
      } catch (DateTimeParseException e) {
        System.out.println(
            "Formato Invalido. Intenta otra vez. (Ejemplo: 2024-12-25 15:30)");
      }
    }
    Consult consult = new Consult(pet, vet, serv, scheduled);
    consults.add(consult);
    System.out.println(">> Consulta creada con éxito.");
    System.out.println(consult);
  }

  private static void listarConsultas() {
    if (consults.isEmpty()) {
      System.out.println("No hay consultas registradas.");
    } else {
      System.out.println("\n=== Consultas Registradas ===");
      consults.forEach(System.out::println);
    }
  }
}
