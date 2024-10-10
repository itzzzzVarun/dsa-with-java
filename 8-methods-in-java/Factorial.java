import java.util.Scanner;

public class Factorial {
  public static int fact(int num) {
    if (num <= 1) {
      return 1;
    }
    return num * fact(num - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int input = sc.nextInt();
    System.out.println("Factorial is : " + fact(input));
    sc.close();
  }
}
