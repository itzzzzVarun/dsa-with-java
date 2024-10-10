import java.util.Scanner;

public class CheckEvenOdd {

  public static boolean checkEvenOdd(int number) {
    if (number % 2 == 0) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int input = sc.nextInt();
    boolean res = checkEvenOdd(input);

    if (res) {
      System.out.println(input + " is a even number.");
    } else {
      System.out.println(input + " is a odd number.");
    }
    sc.close();
  }
}
