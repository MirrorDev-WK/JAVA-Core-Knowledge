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
  
  class Cat extends Animal {
    private String name;
  
    public Cat(String name) {
      super("cat");
      this.name = name;
    }
  
    public void meow() {
      System.out.println(this.name + " meows!");
    }
  }
  
  public class ExamplePolymorphism {
    public static void main(String[] args) {
      // Creating an array of Animal objects
      Animal[] myAnimals = new Animal[2];
      myAnimals[0] = new Dog("Rufus");
      myAnimals[1] = new Cat("Fluffy");
  
      // Looping through the array and calling the makeSound method
      for (Animal animal : myAnimals) {
        animal.makeSound();
      }
  
      // Casting an Animal object to a Dog object and calling the bark method
      Animal myAnimal = new Dog("Fido");
      Dog myDog = (Dog) myAnimal;
      myDog.bark();
    }
  }
  