package team_Core;

import java.io.Serializable;

public class Player implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private static int Size;
	private int player_Id;
	private String player_Name;
	private int player_rank;
	private double player_points;
	
	static
	{
		Size=0;
	}
	
	public Player() 
	{
		Size++;
		System.out.println("In Player constr");
	}

	public Player(int player_Id, String player_Name, int player_rank, double player_points) 
	{

		Size++;
		this.player_Id = player_Id;
		this.player_Name = player_Name;
		this.player_rank = player_rank;
		this.player_points = player_points;
	}

	public int getPlayer_Id() 
	{
		return player_Id;
	}

	public void setPlayer_Id(int player_Id) 
	{
		this.player_Id = player_Id;
	}

	public String getPlayer_Name() 
	{
		return player_Name;
	}

	public void setPlayer_Name(String player_Name) 
	{
		this.player_Name = player_Name;
	}

	public int getPlayer_rank() 
	{
		return player_rank;
	}

	public void setPlayer_rank(int player_rank) 
	{
		this.player_rank = player_rank;
	}

	public double getPlayer_points() 
	{
		return player_points;
	}

	public void setPlayer_points(double player_points) 
	{
		this.player_points = player_points;
	}

	public static int getSize()
	{
		return Size;
	}

	@Override
	public String toString() 
	{
		return "Player [player_Id=" + player_Id + ", player_Name=" + player_Name + ", player_rank=" + player_rank
				+ ", player_points=" + player_points + "]";
	}
}
