/*Write a Java program to print the Fibonacci series up to a 
given number using a for loop. */

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);

            a = b;
            b = c;
        }
    }
}
