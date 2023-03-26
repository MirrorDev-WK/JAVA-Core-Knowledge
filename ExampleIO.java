import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleIO {
  public static void main(String[] args) throws IOException {
    // Writing to a file
    BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
    writer.write("Hello, world!");
    writer.newLine();
    writer.write("This is an example of file output.");
    writer.close();

    // Reading from a file
    BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
    String line;
    while ((line = reader.readLine()) != null) {
      System.out.println(line);
    }
    reader.close();
  }
}
