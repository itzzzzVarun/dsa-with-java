
import java.util.*;

public class ConditionalIfElse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your age: ");
    int age = sc.nextInt();

    // If-else
    if (age > 18) {
      System.out.println("Adult");
    } else {
      System.out.println("Not Adult");
    }
    sc.close();
  }
}
