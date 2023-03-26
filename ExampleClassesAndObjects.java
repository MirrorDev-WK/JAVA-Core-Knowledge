public class ExampleClassesAndObjects {
    public static void main(String[] args) {
      // Creating an object of the Car class
      Car myCar = new Car("Toyota", "Camry", 2021, "red");
  
      // Calling methods on the Car object
      myCar.start();
      myCar.accelerate(50);
      myCar.brake();
      myCar.stop();
  
      // Creating an object of the Person class
      Person myPerson = new Person("Alice", 25);
  
      // Calling methods on the Person object
      System.out.println("Name: " + myPerson.getName());
      System.out.println("Age: " + myPerson.getAge());
  
      myPerson.birthday();
      System.out.println("New age: " + myPerson.getAge());
    }
  }
  
  class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private boolean running;
    private int speed;
  
    public Car(String make, String model, int year, String color) {
      this.make = make;
      this.model = model;
      this.year = year;
      this.color = color;
      this.running = false;
      this.speed = 0;
    }
  
    public void start() {
      System.out.println("Starting the car...");
      this.running = true;
    }
  
    public void stop() {
      System.out.println("Stopping the car...");
      this.running = false;
      this.speed = 0;
    }
  
    public void accelerate(int speed) {
      if (this.running) {
        System.out.println("Accelerating to " + speed + " mph...");
        this.speed = speed;
      } else {
        System.out.println("The car is not running!");
      }
    }
  
    public void brake() {
      if (this.running) {
        System.out.println("Braking...");
        this.speed = 0;
      } else {
        System.out.println("The car is not running!");
      }
    }
  }
  
  class Person {
    private String name;
    private int age;
  
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    public String getName() {
      return this.name;
    }
  
    public int getAge() {
      return this.age;
    }
  
    public void birthday() {
      this.age++;
    }
  }
  