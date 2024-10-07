
public class Loops {
  public static void main(String[] args) {
    // for loop
    System.out.println("for loop start");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
    System.out.println("for loop ended");

    // while loop
    System.out.println("while loop started");
    int j = 1;
    while (j <= 10) {
      System.out.println(j);
      j++;
    }
    System.out.println("while loop ended");

    // do-while loop
    System.out.println("do-while loop started");
    int k = 1;
    do {
      System.out.println(k);
      k++;
    } while (k <= 10);
    System.out.println("do-while loop ended");
  }
}
