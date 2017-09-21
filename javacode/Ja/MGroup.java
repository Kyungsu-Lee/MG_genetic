import java.util.*;


public class MGroup {
	
	private int group_index_g;
	ArrayList<Machine> machines;
	
	MGroup( int group_index_g_arg ){
		group_index_g = group_index_g_arg;
	}
	
	public void addMachine(	double l_margin, double r_margin, double b_margin, double depth, double width, int group_index_m) 
	{ /*machine instance 생 후 추가*/
		Machine machine = new Machine( l_margin, r_margin, b_margin, depth, width, group_index_m );
		machines.add(machine);
	} // add in ArrayList
	public int group_index_g_getter(){ return group_index_g; }
	public Machine getMachine( int machineIndex ){ return machines.get( machineIndex ); } // get 'n'th Machine of ArrayList

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
