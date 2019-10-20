import java.util.*;
/**
 * (Random number chooser)
 */
public class Ex7_13 {
  public static int getRandom(int... numbers) {
    Arrays.parallelSort(numbers);
    int min = 1;
    int max = 54;
    int r;

    do {
      r = (int) (min + (Math.random() * max + 1) - min);
    } while (Arrays.binarySearch(numbers, r) > -1);
    
    return r;
  }

  public static void main(String[] args) {
    int[] numbers = {2, 3, 4};
    int r = getRandom(numbers);
    System.out.println("The random number is " + r);
  }
}