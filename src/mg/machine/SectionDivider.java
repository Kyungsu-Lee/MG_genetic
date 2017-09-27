package mg.machine;

import java.util.ArrayList;
	
import mg.main.ReadFile;

public class SectionDivider
{
	public static ArrayList<Section> make(GroupList groups)
	{
		ArrayList<Section> arr = new ArrayList<Section>();
		int index = 0;

		try
		{

			for(int n : ReadFile.getSequence())
			{
				Section current = new Section(index++, n);
				arr.add(current);

				for(MachineGroup mg : groups.getAllGroups())
				{
					for(Machine m : mg.getAllMachines())
					{

						if(current.getGroupIndex() == m.get_index())
						{
							if(current.addMachine(m))
							{
							}
							else
							{
								current = new Section(index++, n);
								arr.add(current);
								current.addMachine(m);
							}
						}

					}
				}
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		for(Section s : arr)
			s.build();

		return arr;
	} 
}
