public class ExampleControlStatements {
    public static void main(String[] args) {
      // If-else statement
      int num = 10;
      if (num % 2 == 0) {
        System.out.println(num + " is even.");
      } else {
        System.out.println(num + " is odd.");
      }
  
      // Switch statement
      int dayOfWeek = 5;
      switch (dayOfWeek) {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        default:
          System.out.println("Invalid day of week.");
      }
  
      // While loop
      int i = 0;
      while (i < 5) {
        System.out.println("Value of i: " + i);
        i++;
      }
  
      // For loop
      for (int j = 0; j < 5; j++) {
        System.out.println("Value of j: " + j);
      }
  
      // Break statement
      for (int k = 0; k < 10; k++) {
        if (k == 5) {
          break;
        }
        System.out.println("Value of k: " + k);
      }
  
      // Continue statement
      for (int m = 0; m < 5; m++) {
        if (m == 3) {
          continue;
        }
        System.out.println("Value of m: " + m);
      }
    }
  }
  