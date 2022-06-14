//add import statements
import java.util.Scanner;
import java.text.DecimalFormat;
/***************************************************************
 Filename: ReadDoubleVariables
 Created by: Melat
 Created on: 9/28/2021
 Comment: prompt two real numbers from the user and calculate the sum of the numbers.
 ***************************************************************/

class Main 
{
  public static void main(String[] args) 
  {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");
        double num1,num2,num3;

        //get first number
        System.out.println("Please enter number one: ");
        num1 = keyboard.nextDouble();

        //get second number
        System.out.println("Please enter number two: ");
        num2 = keyboard.nextDouble();

        num3= num1 + num2;

        System.out.println("The sum of your two numbers is: " + df.format(num3));
        keyboard.close();
  }//main
  //class
}