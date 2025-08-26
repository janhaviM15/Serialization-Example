package IO;

import java.io.ObjectOutputStream;

public class Serialization 
{
	try
	{
		
		FileOutputStream fout = new FileOutputStream("D:\\SS.txt\");"
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(e);
		out.flush();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	public static void main(String[] args) 
	{
		
	}

}
