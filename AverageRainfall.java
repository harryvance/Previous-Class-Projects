import java.util.Scanner;
public class AverageRainfall

{

//Public static void section

public static void main(String[] args)

{

//Double variable declaration section

int numberOfYears = 0;

double numberOfMonths = 0;

double inchesOfRainfall = 0;

double averageRainfallPerMonth = 0;

double totalRainfall = 0;
  
//Scanner section

Scanner keyboard = new Scanner(System.in);

System.out.println("How many years would you like to calculate average rainfall over?");
numberOfYears = keyboard.nextInt();
  
//Loop section
  
  for (int y = 1; y <= numberOfYears; y++)
    {
	for (int count = 1; count <= 12; count++)
      {
      System.out.println("How many inches of rainfall were there in that month?");
      inchesOfRainfall = keyboard.nextDouble();
        totalRainfall = totalRainfall + inchesOfRainfall;
        }
      }

  numberOfMonths = numberOfYears * 12;

  averageRainfallPerMonth = (totalRainfall / numberOfMonths);
  
  //Closing message
  
  System.out.println("The number of months is " + numberOfMonths 
                     + "and the total inches of rainfall is " + totalRainfall 
                     + "and the average rainfall per month for the entire period is " + averageRainfallPerMonth);
  
//End of program

   }
   
}