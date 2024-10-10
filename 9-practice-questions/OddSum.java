import java.util.Scanner;

public class OddSum {
  public static int oddSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        sum = sum + i;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int res = oddSum(n);
    System.out.println("Odd sum is: " + res);
    sc.close();
  }
}
