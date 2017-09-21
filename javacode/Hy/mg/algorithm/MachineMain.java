package mg.algorithm;

import java.util.*;

public class MachineMain {
	
	static ArrayList<Machine> machi = new ArrayList<Machine>();
	Readfile fi = new Readfile();
	
	MachineMain(){
		
	}
	
	public void makeMachine(){
		Machine mach = new Machine();
		for(int i = 1; i<401; i++){
			mach.l_marginSetter(Double.parseDouble(Readfile.m_l_margin[i]));
			mach.r_marginSetter(Double.parseDouble(Readfile.m_r_margin[i]));
			mach.b_marginSetter(Double.parseDouble(Readfile.m_b_margin[i]));
			mach.depthSetter(Double.parseDouble(Readfile.m_depth[i]));
			mach.widthSetter(Double.parseDouble(Readfile.m_width[i]));
			mach.group_index_mSetter(Integer.parseInt(Readfile.m_group_index[i]));
			machi.add(mach);
		}
	}

}
