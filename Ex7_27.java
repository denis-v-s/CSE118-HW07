import java.util.*;
/**
 * (Identical arrays)
 */
public class Ex7_27 {
  public static boolean equals(int[] list1, int[] list2) {
    Arrays.sort(list1);
    Arrays.sort(list2);

    return Arrays.equals(list1, list2);
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter list1 size and contents: ");
      int[] list1 = getUserInput(scanner);

      System.out.print("Enter list2 size and contents: ");
      int[] list2 = getUserInput(scanner);

      System.out.println(
        equals(list1, list2) ? "Two lists are identical" : "Two lists are not identical"
      );
    }
  }

  private static int[] getUserInput(Scanner scanner) {
    int n = scanner.nextInt();
    int[] list = new int[n];
    for (int i = 0; i < n; i++) {
      list[i] = scanner.nextInt();
    }

    return list;
  }
}