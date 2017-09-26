package mg.main;

import java.util.*;
import mg.machine.Machine;

public class Parser
{
	public static ArrayList<Machine> makeMachine(String str)
	{
		ArrayList<Machine> array = new ArrayList<Machine>();

		String[] substr = str.split("%%");

		for(String sub : substr)
		{
			try
			{
				double[] attr = toAttributes(sub);
				array.add(new Machine(attr[0], attr[1], attr[2], attr[3], attr[4], (int)attr[5]));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		return array;
	}

	public static double[] toAttributes(String str) throws Exception
	{
		String[] sub = str.split(",");

		if(sub.length != 7) throw new Exception("Error String");

		double[] arr = new double[6];

		for(int i=0; i<6; i++)
			arr[i] = Double.parseDouble(sub[i+1]);	

		return arr;
	}
}
