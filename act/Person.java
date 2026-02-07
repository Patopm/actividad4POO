package act;

/**
 * Base class representing a person in the school system.
 */
public class Person {
  protected String name;

  public Person() {
    this.name = "Unknown";
  }

  public Person(String name) {
    this.name = name;
  }

  public Person(Person other) {
    this.name = other.name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
