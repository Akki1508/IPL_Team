package team_Utils;

import java.util.HashMap;
import team_Core.Player;
import team_Execption.Player_Execption;

public class Player_Validate 
{
	public static int validId(int id,HashMap<Integer,Player> pm) throws Player_Execption
	{
		for(Player p : pm.values())
			if(p.getPlayer_Id()==id)
				throw new Player_Execption("!!!!!!!! Invalid Id !!!!!!!!");
		return id;
	}
	
	public static String validName(String name,HashMap<Integer,Player> pm) throws Player_Execption
	{
		for(Player p : pm.values())
			if(p.getPlayer_Name().equalsIgnoreCase(name))
				throw new Player_Execption("!!!!!!!! Player with this name already exists !!!!!!!!");
		return name;
	}
	
	public static int validRank(int rank)throws Player_Execption
	{
		if((rank>0)&&(rank<6))
			return rank;
		throw new Player_Execption("!!!!!!!! Please Enter Valid Points !!!!!!!!");
	}
	
	public static double validPoints(double points,HashMap<Integer,Player> pm) throws Exception
	{
		for(Player p: pm.values())
			if(p.getPlayer_rank()==points)
				throw new Player_Execption("!!!!!!!! This rank is allready ocupied !!!!!!!!");
		return points;
	}
}
