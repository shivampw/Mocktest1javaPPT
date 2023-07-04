/*Write a Java program to find the largest of three numbers
 using nested if-else statements.*/
 
import java.util.*;

public class LargestNumber {
    public static void main(String args[])
    {
      Scanner op=new Scanner(System.in);

      System.out.println("Enetr 1'st Number");
      int val1=op.nextInt();

      System.out.println("Enter 2'nd Number");
      int val2=op.nextInt();

      System.out.println("Enter 3'rd Number");
      int val3=op.nextInt();

      if(val1 > val2 && val1 > val3)
      {
        System.out.println("Greater Number is: " + val1);
      }

        else if(val2 > val3 && val2 > val1)
        {
            System.out.println("Greater Number is: " + val2);
        }
            
            else
            {
                System.out.println("Greater Number is: " + val3);
            }
        }
}
    

