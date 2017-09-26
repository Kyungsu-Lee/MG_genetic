package mg.machine;

import java.util.ArrayList;

public class GroupList
{
	public final ArrayList<MachineGroup> groups = new ArrayList<MachineGroup>();

	public int parse(int n)
	{
		for(int i=0; i<groups.size(); i++)
			if(groups.get(i).getGroupIndex() == n)
				return i;

		return -1;
	}

	public GroupList(ArrayList<Machine> machines, int[] sequnece)
	{
		for(int s : sequnece)
			groups.add(new MachineGroup(s));

		for(Machine m : machines)	
			groups.get(parse(m.get_index())).add(m);
	}

	public ArrayList<MachineGroup> get() { return this.groups; }

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		for(MachineGroup mg : groups)
			sb.append(mg + "\n\n");

		return sb.toString();		
	}
}
