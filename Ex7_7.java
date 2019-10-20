/**
 * (Count single digits)
 */
public class Ex7_7 {

  public static void main(String[] args) {
    int[] counts = new int[10];
    int r;

    // generate 100 random numbers
    for (int i = 0; i < 100; i++) {
      r = (int)(Math.random() * 10);
      counts[r] = counts[r] + 1;
    }

    // display the generated numbers
    for (int i = 0; i < counts.length; i++) {
      System.out.printf("%d occurs %d times%n", i + 1, counts[i]);
    }
  }
}