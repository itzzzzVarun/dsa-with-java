import java.util.Scanner;;

public class GCDRec {
  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }

    return gcd(b, a % b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = sc.nextInt();
    System.out.println("Enter second number: ");
    int b = sc.nextInt();
    System.out.println("GCD of a and b is: " + gcd(a, b));
    sc.close();
  }
}
