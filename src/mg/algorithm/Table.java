package mg.algorithm;

import java.util.*;
import mg.machine.Machine;

public class Table
{
	private ArrayList<String> machine_name= new ArrayList<String>();
	private ArrayList<String> l_margins = new ArrayList<String>();
	private ArrayList<String> r_margins = new ArrayList<String>();
	private ArrayList<String> b_margins = new ArrayList<String>();
	private ArrayList<String> widthes= new ArrayList<String>();
	private ArrayList<String> depthes = new ArrayList<String>();
	private ArrayList<String> g_index = new ArrayList<String>();

	private ArrayList<String>[] arrays;

	public Table()
	{
			arrays = new ArrayList<String>[7];
			arrays[0] = machine_name;
			arrays[1] = l_margins;
			arrays[2] = r_margins;
			arrays[3] = b_margins;
			arrays[4] = widthes;
			arrays[5] = depthes;
			arrays[6] = g_index;
	}

	public void setValue(String str)
	{
		String[] lines = str.split("\r");

		if(lines.length != 7)
			lines = str.split("\n");
	
		for(int i=0; i<lines.length; i++)
		{
			String[] attributes = lines[i].split(",");
			
			for(String att : attributes)
				arrays[i].add(att);
		}
	}	

	private Double getValue(String m_index, String attribute)
	{
		int index = machine_name.indexOf(m_index);

		try
		{
			if(attribute.equals("l_margin"))
				return Double.parseDouble(l_margins.get(index));

			if(attribute.equals("r_margin"))
				return Double.parseDouble(r_margins.get(index));

			if(attribute.equals("b_margin"))
				return Double.parseDouble(b_margin.get(index));

			if(attribute.equals("width"))
				return Double.parseDouble(widthes.get(index));

			if(attribute.equals("depth"))
				return Double.parseDouble(depthes.get(index));

			if(attribute.equals("group_index"))
				return Integer.parseInt(g_index.get(index));

			return -1.0;

		}catch(Exception e)
		{
			e.printStackTrace();
	
			return -1.0;
		}
	}	

	private Double getValue(int m_index, String attribute)
	{
		int index = m_index;

		try
		{
			if(attribute.equals("l_margin"))
				return Double.parseDouble(l_margins.get(index));

			if(attribute.equals("r_margin"))
				return Double.parseDouble(r_margins.get(index));

			if(attribute.equals("b_margin"))
				return Double.parseDouble(b_margin.get(index));

			if(attribute.equals("width"))
				return Double.parseDouble(widthes.get(index));

			if(attribute.equals("depth"))
				return Double.parseDouble(depthes.get(index));

			if(attribute.equals("group_index"))
				return Integer.parseInt(g_index.get(index));

			return -1.0;

		}catch(Exception e)
		{
			e.printStackTrace();
	
			return -1.0;
		}
	}	

	public Machine getMachine(int index)
	{	
		Machine m = new Machine(
			this.getValue(index, "l_margin"),
			this.getValue(index, "r_marin"),
			this.getValue(index, "b_margin"),
			this.getValue(index, "depth"),
			this.getValue(index, "width"),
			this.getValue(index, "group_index")
		);

		return m;
	}

	public ArrayList<Machine> getAllMachines()
	{
		ArrayList<Machine> lists = new ArrayList<Machine>();

		for(int i = 1; i < 401; i++)
			lists.add(getMachine(i));

		return lists;
	}
}
