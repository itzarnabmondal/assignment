import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @Arnab Mondal
 */
public class Solution {
    public static void main(String[] args) { // main method
        Scanner sc = new Scanner(System.in); // creating scanner object
        try { // try block
              // These code may throw exception
            System.out.println("Enter two integers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName()); // printing class name
        } catch (ArithmeticException e) { // multiple catch block
            System.out.println(e.getClass().getName() + ": / by zero");
        } finally {
            sc.close(); // closing scanner
        }
    }
}
