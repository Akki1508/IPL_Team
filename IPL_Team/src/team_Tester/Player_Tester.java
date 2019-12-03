package team_Tester;

import java.util.HashMap;
import java.util.Scanner;
import static team_Utils.Player_Collection.populatePlayer;
import static team_Utils.Player_Serial.storePlayerDetails;
import static team_Utils.Player_Collection.getPlayerById;
import team_Core.Player;
import team_Execption.Player_Execption;

public class Player_Tester 
{
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		try (Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter the file name to restore data");
			String fileName=sc.nextLine();
			HashMap<Integer,Player> p1=populatePlayer();
			storePlayerDetails(p1,fileName);
			System.out.println("atudent info"+p1);
			boolean exit=true;
			while(exit)
			{
				System.out.println();
				System.out.println();
				System.out.println("1. Add Player");
				System.out.println("2. Display players");
				System.out.println("3. Exit");
				System.out.printf("Enter Option :-");
				switch (sc.nextInt()) 
				{
				case 1:
					System.out.println("Enter players Details");
					System.out.println("Enter Id,Name,Rank,Points");
					Player p=new Player(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble());
					if(p.getSize()<11)
					{
						p1.put(p.getPlayer_Id(),p);
						System.out.println("Player Added Successfully");
					}
					else
						throw new Player_Execption("!!!!!! Entry in a team is full !!!!!!");
					break;
					
				case 2:
					System.out.println("Enter Player ID");
					System.out.println(getPlayerById(sc.nextInt(),p1));
					break;
					
				case 3:
					storePlayerDetails(p1,fileName);
					exit = true;
					break;

				default:
					break;
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
