public class ExampleArrays {
    public static void main(String[] args) {
      // Declaring and initializing an array of integers
      int[] numbers = { 1, 2, 3, 4, 5 };
  
      // Accessing elements of an array
      System.out.println("The first element of the array is: " + numbers[0]);
      System.out.println("The last element of the array is: " + numbers[numbers.length - 1]);
  
      // Looping through an array
      for (int i = 0; i < numbers.length; i++) {
        System.out.println("Element " + i + " of the array is: " + numbers[i]);
      }
  
      // Declaring and initializing an array of strings
      String[] names = { "Alice", "Bob", "Charlie", "Dave" };
  
      // Accessing elements of an array
      System.out.println("The first element of the array is: " + names[0]);
      System.out.println("The last element of the array is: " + names[names.length - 1]);
  
      // Looping through an array
      for (int j = 0; j < names.length; j++) {
        System.out.println("Element " + j + " of the array is: " + names[j]);
      }
    }
  }
  