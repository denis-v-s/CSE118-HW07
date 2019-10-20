import java.util.*;
/**
 * (Sorted?)
 */
public class Ex7_19 {
  public static boolean isSorted(int[] list) {
    for (int i = 1; i < list.length; i++) {
      if (list[i] < list[i - 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // Enter the size of the list:
      System.out.print("Enter the size of the list: ");
      int n = scanner.nextInt();
      System.out.print("Enter the contents of the list: ");
      int[] list = new int[n];
      for (int i = 0; i < n; i++) {
        list[i] = scanner.nextInt();
      }

      System.out.println("The list has " + n + " integers " + Arrays.toString(list));
      System.out.printf("The list is %s", isSorted(list) ? "already sorted" : "not sorted");
    }
  }
}