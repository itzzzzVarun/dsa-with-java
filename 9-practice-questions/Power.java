import java.util.Scanner;

public class Power {
  public static long power(int x, int n) {
    long mul = 1;
    for (int i = 1; i <= n; i++) {
      mul = mul * x;
    }
    return mul;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int x = sc.nextInt();
    System.out.println("Enter the power of the number: ");
    int n = sc.nextInt();
    System.out.println("The result is: " + power(x, n));
    sc.close();
  }
}
