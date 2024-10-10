import java.util.Scanner;

public class Circumference {
  public static double circumference(int r) {
    return (2 * Math.PI * r);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the raduis of circle: ");
    int r = sc.nextInt();
    System.out.println("Circumference of circle is: " + circumference(r));
    sc.close();
  }
}