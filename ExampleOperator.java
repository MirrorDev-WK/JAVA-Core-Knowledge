public class ExampleOperator {
    public static void main(String[] args) {
      int x = 10;
      int y = 5;
  
      // Arithmetic operators
      int sum = x + y;
      int difference = x - y;
      int product = x * y;
      int quotient = x / y;
      int remainder = x % y;
  
      System.out.println("Sum: " + sum);
      System.out.println("Difference: " + difference);
      System.out.println("Product: " + product);
      System.out.println("Quotient: " + quotient);
      System.out.println("Remainder: " + remainder);
  
      // Comparison operators
      boolean isEqual = (x == y);
      boolean isNotEqual = (x != y);
      boolean isGreater = (x > y);
      boolean isLess = (x < y);
      boolean isGreaterOrEqual = (x >= y);
      boolean isLessOrEqual = (x <= y);
  
      System.out.println("Is x equal to y? " + isEqual);
      System.out.println("Is x not equal to y? " + isNotEqual);
      System.out.println("Is x greater than y? " + isGreater);
      System.out.println("Is x less than y? " + isLess);
      System.out.println("Is x greater than or equal to y? " + isGreaterOrEqual);
      System.out.println("Is x less than or equal to y? " + isLessOrEqual);
  
      // Logical operators
      boolean a = true;
      boolean b = false;
  
      boolean andResult = a && b;
      boolean orResult = a || b;
      boolean notResult = !a;
  
      System.out.println("a AND b: " + andResult);
      System.out.println("a OR b: " + orResult);
      System.out.println("NOT a: " + notResult);
    }
  }
  