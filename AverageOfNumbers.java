/*Write a Java program to calculate the average of a list
 of numbers using a do-while loop.*/

import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of numbers: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        do {
            System.out.println("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
            i++;
        } while (i <= n);

        double average = sum / n;
        System.out.println("The average is " + average);
    }
}

