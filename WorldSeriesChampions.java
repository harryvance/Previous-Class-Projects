import java.util.Scanner;
import java.io.File;
public class WorldSeriesChampions

{
  
	//Public static void section

	public static void main(String[] args) {

		//Variable declaration section
      
        String nameOfTeam;

        int numberOfVictories;
      
        numberOfVictories = 0;

        String[] teams = new String[107];

		//Scanner section
      
        Scanner keyboard = new Scanner(System.in);

		//Input section
      
        System.out.println("Enter the team of a team.");

        nameOfTeam = keyboard.nextLine();

		//Loop section
      
        try {
			File winners = new File ("WorldSeriesWinners.txt");
            Scanner teamReader = new Scanner(winners);

            int x;
          
          	x = 0;
          
          		while (teamReader.hasNextLine() == true)
               
                {
                 teams[x] = teamReader.nextLine();
                 x++;
                }
			

        } catch (Exception e) {
            System.out.println(e);
        }

      for (int x = 0; x < teams.length; x++)
      {
     		if (teams[x] != null) {
				if (teams[x].equals(nameOfTeam))

				{
					numberOfVictories++;

				}
			}

        
      }
      
      //Final display message section
      
      System.out.println(numberOfVictories);
      
      //End of program
      
    }
  
  
}