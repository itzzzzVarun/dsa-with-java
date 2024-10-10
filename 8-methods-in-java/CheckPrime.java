import java.util.Scanner;

public class CheckPrime {

  public static boolean checkPrime(int number) {

    if (number <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int input = sc.nextInt();
    boolean res = checkPrime(input);
    if (res) {
      System.out.println(input + " is a prime number.");
    } else {
      System.out.println(input + " is not a prime number.");
    }
    sc.close();
  }
}
