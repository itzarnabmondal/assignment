/* Q.2 Write a java program to solve quadratic equations. */

import java.util.Scanner;

public class ProgramToSolveQuadraticEquations {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Enter a: ");
            double a = sc.nextDouble();
            System.out.print("Enter b: ");
            double b = sc.nextDouble();
            System.out.print("Enter c: ");
            double c = sc.nextDouble();

            double result = b * b - 4.0 * a * c;

            if (result > 0.0) {
                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
                System.out.println("Roots are " + r1 + " and " + r2);
            } else if (result == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("Root is " + r1);
            } else {
                System.out.println("This equation has no roots.");
            }

    }
}
