import java.util.*;   //Importing Java package section (util)
public class ArrayListDemonstration    //Class declaration section

{
 
  public static void main(String[] args)    //Main declaration section
  
  {     
    ArrayList<Integer> NewList = new ArrayList<Integer>();     //Creation of the ArrayList named NewList
    
    NewList.add(5);        //Adds 5 to the end of the list, creating a new space in the array
    NewList.add(0, 15);		//insert element at the beginning
    NewList.add(1, 25);		//insert element at the index 1 
    NewList.remove(0);     //Removes the element at this index, making the array smaller by one
    
    Object[] arr = NewList.toArray();   //int[] toArray = (int[]) NewList.toArray(); // converts ArrayList to array
    
    System.out.println(NewList);    //Prints out the contents of the ArrayList named NewList
    
    System.out.println("The number of elements in the array " + NewList.size());  //Computing the size of the ArrayList
    
  }
  
  //End of program
  
}