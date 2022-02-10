public class ArrayDemonstrationOne    //Class declaration section

{
 
  public static void main(String[] args)    //Main declaration section
  
  { 
    //part a of the problem
    int[] arrayOne = new int[10];    //Creation of the first array (reference added, 1a)
    
    //part d of the problem
    arrayOne[0] = 1;
    
    //part b of the problem
    arrayOne[arrayOne.length -1] = 13;     //Adding a value at the end index (9)
    arrayOne[arrayOne.length -2] = arrayOne[arrayOne.length -1];        //Relocated the last element
    
    //part c of the problem
    arrayOne[arrayOne.length -1] = 17;
    arrayOne[arrayOne.length / 2] = 15;
    
    //part e of the problem
    for (int i = 0; i < 10; i++)       //For loop to cycle through elements to print out each individually
      {
        System.out.println(arrayOne[i]);     //Printing out the value of each individual element until the end is reached
      }
    
    System.out.println("The number of elements in the array is " + arrayOne.length);
    
      }
  
  //End of program
  
 	 }
