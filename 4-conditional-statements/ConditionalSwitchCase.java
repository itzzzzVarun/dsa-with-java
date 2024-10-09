
import java.util.*;

public class ConditionalSwitchCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your button number: ");

    int button = sc.nextInt();

    // switch-case
    switch (button) {
      case 1:
        System.out.println("hello");
        break;
      case 2:
        System.out.println("Namste");
        break;
      case 3:
        System.out.println("Bonjour");
        break;
      default:
        System.out.println("Invalid button");
        break;
    }
    sc.close();
  }
}
