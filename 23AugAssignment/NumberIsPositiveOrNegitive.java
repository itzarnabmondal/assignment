/* Q.1 Write a java program to get a number from the user and print 
whether it is positive or negative. */

import java.util.Scanner;

public class NumberIsPositiveOrNegitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = sc.nextInt();
        sc.close();
        if (input > 0)
        {
            System.out.println("It's a positive number :)");
        }
        else if (input < 0)
        {
            System.out.println("It's a negative number :)");
        }
        else
        {
            System.out.println("Number is zero :(");
        }
    }
}
