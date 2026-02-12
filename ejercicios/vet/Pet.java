package ejercicios.vet;

public class Pet {
  private String name;
  private String species;
  private int age;
  private float weight;
  private Owner owner;

  // Constructor
  public Pet() {
  }

  public Pet(String name, String species, int age, float weight, Owner owner) {
    this.name = name;
    this.species = species;
    this.age = age;
    this.weight = weight;
    this.owner = owner;
  }

  public Pet(Pet p) {
    this(p.name, p.species, p.age, p.weight, p.owner);
  }

  // Getters
  String getName() {
    return name;
  }

  String getSpecies() {
    return species;
  }

  int getAge() {
    return age;
  }

  float getWeight() {
    return weight;
  }

  Owner getOwner() {
    return owner;
  }

  // Setters
  void setName(String n) {
    this.name = n;
  }

  void setSpecies(String s) {
    this.species = s;
  }

  void setAge(int a) {
    this.age = a;
  }

  void setWeight(float w) {
    this.weight = w;
  }

  void setOwner(Owner owner) {
    this.owner = owner;
  }

  // Metodos
  @Override
  public String toString() {
    return "Mascota: " + name + " (" + species + "), " + age + " años, " +
        weight + "kg | Dueño: " + owner.getName();
  }
}
