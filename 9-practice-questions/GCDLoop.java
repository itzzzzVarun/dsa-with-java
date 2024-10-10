import java.util.Scanner;

public class GCDLoop {
  public static int gcd(int a, int b) {
    int i;
    if (a > b) {
      i = b;
    } else {
      i = a;
    }

    for (; i > 1; i--) {
      if (a % i == 0 && b % i == 0) {
        return i;
      }
    }
    return 1;
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
