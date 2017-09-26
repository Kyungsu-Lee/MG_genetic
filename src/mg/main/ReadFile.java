package mg.main;

import java.util.ArrayList;
import java.io.*;

public class ReadFile
{
	private static int[] sequence = new int[8];
	
	public static String readFile(final String fileName) throws IOException
	{
		StringBuilder sb = new StringBuilder();

		BufferedReader br = new BufferedReader(new FileReader(fileName));

		String line;
		while((line = br.readLine()) != null)
			sb.append(line + "%%");

		return sb.toString();
	}

	public static void setSequence(final String fileName) throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader(fileName));

		String line;
		while((line = br.readLine()) != null)
		{
			String[] split = line.split(",");
			
			for(int i=0; i<split.length; i++)
				sequence[i] = Integer.parseInt(split[i]);
		}

	}

	public static int[] getSequence() { return sequence; }
}
