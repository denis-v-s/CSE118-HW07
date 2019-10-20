import java.util.*;
/**
 * (Count occurrence of numbers)
 */
public class Ex7_3 {

  public static void main(String[] args) {
    TreeMap<Integer, Integer> counter = new TreeMap<>();

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter the integers between 1 and 100: ");
      int key;
      // get the user's input and populate the dictionary
      do {
        key = scanner.nextInt();
        if (counter.containsKey(key)) {
          counter.put(key, counter.get(key) + 1);
        }
        else {
          if (key != 0) {
            counter.put(key, 1);
          }
        }
      } while (key != 0);

      // print out the counts for each entry
      for (int k : counter.keySet()) {
        System.out.printf("%d occurs %d time%s%n", k, counter.get(k), (counter.get(k) == 1) ? "" : "s");
      }
    }
  }
}