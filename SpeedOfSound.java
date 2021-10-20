import java.util.Scanner;
public class SpeedOfSound

{

  public static void main(String[] args)

  {
  
  String medium;
  
  double distance;
    
  double time;
    
  time = 0;

  Scanner keyboard = new Scanner(System.in);
  
  System.out.println("Enter air, water or steel: ");
  medium = keyboard.nextLine();
  
  System.out.println("Enter the distance that the sound wave will travel: ");
  distance = keyboard.nextDouble();
    
  if (medium.equals("air"))
    
    time = distance/1100;
   
  else if (medium.equals("water"))
    
    time = distance/4900;
    
  else if (medium.equals("steel"))
    
    time = distance/16400;
    
 System.out.println("The amount of time it will take for the sound wave to travel through " +medium+ " is " +time);
    
  }

}