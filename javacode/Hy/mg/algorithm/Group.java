package mg.algorithm;

import java.util.ArrayList;

public class Group {
	private ArrayList<String []> machineGroup;
	private int group_index_g;
	//set group algorithm
	
	/**set group index*/
	public void setgroupindex(int value){}

	/**get group index*/
	public int getgroupindex_g(){
		return group_index_g;
	}
	
	/**arrayList -> machine*/
	public ArrayList<String[]> arrMachine(Machine m){
		return machineGroup;
	}
}
