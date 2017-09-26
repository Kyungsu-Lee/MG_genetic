package mg.machine;

import java.util.ArrayList;

public class MachineGroup
{
	private ArrayList<Machine> array = new ArrayList<Machine>();

	private int groupIndex;

	public MachineGroup(final int index) { groupIndex = index; }
	public MachineGroup(ArrayList<Machine> array, final int index)
	{
		this.groupIndex = index;
		this.array = array;
	}

	public int getGroupIndex() { return this.groupIndex; }

	public void add(Machine m) { this.array.add(m); }

	public void addMachine(Machine machine)
	{
		this.add(machine);
		machine.setGroupIndex(this.groupIndex);
	}
}
