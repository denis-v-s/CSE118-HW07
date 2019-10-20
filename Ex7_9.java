import java.util.Scanner;

/**
 * (Find the smallest element)
 */
public class Ex7_9 {

  public static void min(double[] array) {
    // The minimum number is
    double m = array[0];
    for (int i = 1; i < array.length; i++) {
      m = Math.min(m, array[i]);
    }

    System.out.println("The minimum number is " + m);
  }

  public static void main(String[] args) {
    int n = 10;
    double[] values = new double[n];
    System.out.print("Enter 10 numbers: ");

    try (Scanner scanner = new Scanner(System.in)) {
      for (int i = 0; i < n; i++) {
        values[i] = scanner.nextDouble();
      }
    }

    min(values);
  }
}