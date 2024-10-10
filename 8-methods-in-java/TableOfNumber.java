import java.util.Scanner;

public class TableOfNumber {
  public static void tableOfNumber(int number) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(number * i);
    }
    return;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int input = sc.nextInt();
    tableOfNumber(input);
    sc.close();
  }
}
