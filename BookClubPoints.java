import java.util.Scanner; 
public class BookClubPoints 
{ 
  public static void main(String[] args)
  
  { 
    
    double numberOfBooks;
    double numberOfPoints; 
    
    Scanner keyboard = new Scanner(System.in); 
    
    System.out.println("Enter the number of books you have purchased: "); 
    
    numberOfBooks = keyboard.nextDouble(); 
    
    if (numberOfBooks == 0) numberOfPoints = 0; 
    
    else if (numberOfBooks == 1) numberOfPoints = 5; 
    
    else if (numberOfBooks == 2) numberOfPoints = 15; 
    
    else if (numberOfBooks == 3) numberOfPoints = 30;

    else numberOfPoints = 60; System.out.println("The number of points you have been awarded is: " +numberOfPoints);
  
  } 

}
