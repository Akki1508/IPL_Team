package team_Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import team_Core.Player;

public class Player_Serial 
{
	public static void storePlayerDetails(HashMap<Integer,Player> hm, String fileName) throws IOException 
	{
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) 
		{
			out.writeObject(hm);
		}
	}

	@SuppressWarnings("unchecked")
	public static HashMap<Integer,Player> playerDetails(String fileName) throws Exception 
	{
		File f1 = new File(fileName);
		if (f1.exists() && f1.isFile() && f1.canRead()) 
		{
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f1))) 
			{
				return (HashMap<Integer,Player>) in.readObject();
			}
		}
		return new HashMap<>();
	}
}
