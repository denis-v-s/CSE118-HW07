import java.util.Scanner;
/**
 * (Algebra: solve quadratic equations)
 */
public class Ex7_25 {
  public static int solveQuadratic(double[] eqn, double[] roots) {
    // (-b +- sqrt(b^2 - 4ac)) / (2a)
    double a = eqn[0];
    double b = eqn[1];
    double c = eqn[2];

    int rootsCount = 0;

    double discriminant = Math.pow(b, 2) - 4 * a * c;
    if (discriminant > 0) {
      roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
      roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
      rootsCount = 2;
    }
    else if (discriminant == 0) {
      roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
      rootsCount = 1;
    }
    
    return rootsCount;
  }
  
  public static void main(String[] args) {
    double[] roots = new double[3];

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter the 3 coefficients of the quadratic equation: ");
      double[] eqn = new double[3];
      eqn[0] = scanner.nextDouble();
      eqn[1] = scanner.nextDouble();
      eqn[2] = scanner.nextDouble();
      
      int n = solveQuadratic(eqn, roots);

      System.out.printf("%.1fx^2 + %.1fx + %.1f has %d real roots.%n", eqn[0], eqn[1], eqn[2], n);
      if (n == 2) {
        System.out.printf("root 1: %f, root 2: %f", roots[0], roots[1]);
      }
      else if (n == 1) {
        System.out.printf("root: %f", roots[0]);
      }
    }
  }
}