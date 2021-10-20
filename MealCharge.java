import java.util.Scanner;
public class MealCharge
{

// Public section

   public static void main (String[] args)
   
   {
   	 double taxRate = 0.0675;
     double tipPercentage = 0.2;
     
     // Scanner section creating a Scanner object to read input from user
     
     Scanner keyboard = new Scanner(System.in);
     
   //  Read user inputs
     
 	 System.out.println("Enter the charge for the meal ");
     double mealcharge = keyboard.nextDouble();
   	
    // Calculate  the meal charge, tax, and tip
     double tax = mealcharge *  taxRate;
     double tip = mealcharge * tipPercentage;
     double totalMealCharge = mealcharge + tax + tip;
       

      System.out.println("Your meal charge is " + mealcharge);
      System.out.println("Your tax amount is " +tax);
      System.out.println("Your tip amount is " +tip);
      System.out.println("Your total bill amount is " +totalMealCharge);     
      //End program
   }
}