package team_Utils;

import static team_Utils.Player_Validate.validId;
import static team_Utils.Player_Validate.validName;
import static team_Utils.Player_Validate.validPoints;
import static team_Utils.Player_Validate.validRank;
import java.util.HashMap;
import team_Core.Player;
import team_Execption.Player_Execption;

public class Player_Collection 
{
	public static HashMap<Integer,Player> populatePlayer() throws Exception
	{
		HashMap<Integer, Player> pm=new HashMap<>();
		pm.put(101, new Player(validId(101, pm) , validName("Dhoini", pm) , validRank(5) , validPoints(108.5,pm)));
		pm.put(102, new Player(validId(102, pm) , validName("Raina", pm) , validRank(4) , validPoints(150.8,pm)));
		pm.put(103, new Player(validId(103, pm) , validName("Kohili", pm) , validRank(4) , validPoints(178.9,pm)));
		pm.put(104, new Player(validId(104, pm) , validName("Sachin", pm) , validRank(5) , validPoints(146.2,pm)));
		pm.put(105, new Player(validId(105, pm) , validName("Yuraj", pm) , validRank(4) ,validPoints(180.5,pm)));
		
		return pm;
	}
	
	public static Player getPlayerById(int Id, HashMap<Integer,Player> map) throws Player_Execption{
		Player p=map.get(Id);
		if(p == null)
			throw new Player_Execption("!!!!!!!! Player not Found !!!!!!!");
		return p;
	}
}
