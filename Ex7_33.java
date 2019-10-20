import java.util.Scanner;
/**
 * (Culture: Chinese Zodiac)
 */
public class Ex7_33 {

  public static void main(String[] args) {
    String[] animals = {
      "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", 
      "rabbit", "dragon", "snake", "horse", "sheep"
    };

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter a year: ");
      int year = scanner.nextInt();
      
      System.out.println(animals[year % 12]);
    }
  }
}