interface Shape {
    double getArea();
    double getPerimeter();
  }
  
  class Rectangle implements Shape {
    private double width;
    private double height;
  
    public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
    }
  
    public double getArea() {
      return width * height;
    }
  
    public double getPerimeter() {
      return 2 * (width + height);
    }
  }
  
  class Circle implements Shape {
    private double radius;
  
    public Circle(double radius) {
      this.radius = radius;
    }
  
    public double getArea() {
      return Math.PI * radius * radius;
    }
  
    public double getPerimeter() {
      return 2 * Math.PI * radius;
    }
  }
  
  public class ExampleInterface {
    public static void main(String[] args) {
      // Creating an array of Shape objects
      Shape[] myShapes = new Shape[2];
      myShapes[0] = new Rectangle(3, 4);
      myShapes[1] = new Circle(2);
  
      // Looping through the array and calling the getArea and getPerimeter methods
      for (Shape shape : myShapes) {
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
      }
    }
  }
  