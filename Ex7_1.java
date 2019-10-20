import java.util.Scanner;
/**
 * (Assign grades)
 */
public class Ex7_1 {

  // gets the max int value of the array
  private static int getMaxArrayValue(int[] a) {
    int maxValue = a[0];
    for (int i = 0; i < a.length; i++) {
      maxValue = Math.max(maxValue, a[i]);
    }

    return maxValue;
  }

  // compares score to top score, and returns the letter grade depending on the result
  private static char getLetterGrade(int score, int bestScore) {
    if (score >= (bestScore - 10)) {
      return 'A';
    }
    if (score >= (bestScore - 20)) {
      return 'B';
    }
    if (score >= (bestScore - 30)) {
      return 'C';
    }

    if (score >= (bestScore - 40)) {
      return 'D';
    }

    return 'F';
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter the number of students: ");
      int n = scanner.nextInt();

      System.out.printf("Enter %d scores: ", n);
      
      int[] scores = new int[n];
      int i = 0;
      while (i < n) {
        scores[i++] = scanner.nextInt();
      }

      int highScore = getMaxArrayValue(scores);
      for (i = 0; i < n; i++) {
        System.out.printf("Student %d score is %d and grade is %c%n", 
          i, scores[i], getLetterGrade(scores[i], highScore)
        );
      }
    }
  }
}