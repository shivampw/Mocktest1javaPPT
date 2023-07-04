/*Write a Java program to check whether a given number is positive,
 negative, or zero using an if-else statement.*/

import java.util.*;

public class CheckNumber {

    public void Condition( int number){
         if (number > 0)
        {
            System.out.println("Number is Positive");
        }
        else if(number < 0)
        {
            System.out.println("Number is Negative ");
        }
        else
        {
            System.out.println("Number is Zero");
        }
    }
    public static void main(String args[])
    {
        CheckNumber num = new CheckNumber();
        Scanner op=new Scanner(System.in);
       System.out.println("Enter any number");
       int number = op.nextInt();
       num.Condition(number);
       
    }
}
    
