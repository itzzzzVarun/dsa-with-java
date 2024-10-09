
import java.util.*;

public class InputFromUser {
  public static void main(String[] args) {
    // Input
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number: ");

    // Storing the value in variable 'a'
    int a = sc.nextInt();

    System.out.println("Enter second number: ");

    // Storing the value in variable 'b'
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println("Sum is " + sum);
    sc.close();
  }
}
