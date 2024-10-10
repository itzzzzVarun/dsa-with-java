import java.util.Scanner;

public class CheckVoter {
  public static boolean checkVoter(int age) {
    if (age >= 18) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age: ");
    int age = sc.nextInt();
    if (checkVoter(age)) {
      System.out.println("You are eligible to vote.");
    } else {
      System.out.println("You are not eligible to vote.");
    }
    sc.close();
  }
}
