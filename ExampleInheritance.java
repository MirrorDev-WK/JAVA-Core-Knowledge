class Animal {
    protected String species;
  
    public Animal(String species) {
      this.species = species;
    }
  
    public void makeSound() {
      System.out.println("The " + this.species + " makes a sound.");
    }
  }
  
  class Dog extends Animal {
    private String name;
  
    public Dog(String name) {
      super("dog");
      this.name = name;
    }
  
    public void bark() {
      System.out.println(this.name + " barks!");
    }
  }
  
  public class ExampleInheritance {
    public static void main(String[] args) {
      // Creating a Dog object
      Dog myDog = new Dog("Rufus");
  
      // Calling methods on the Dog object
      System.out.println("My dog's species is " + myDog.species);
      myDog.makeSound();
      myDog.bark();
    }
  }
  