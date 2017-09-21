package mg.algorithm;

import java.util.*;

public class Machine {
		
	private double l_margin;
	private double r_margin;
	private double b_margin;
	private double depth;
	private double width;
	private int group_index_m;

	public double l_marginGetter(){ 
		return l_margin; 
		}
	public double r_marginGetter(){ 
		return r_margin; 
		}
	public double b_marginGetter(){ 
		return b_margin; 
		}
	public double depthGetter(){ 
		return depth; 
		}
	public double widthGetter(){ 
		return width; 
		}
	public int group_index_mGetter(){ 
		return group_index_m;
		}

	public void l_marginSetter(double arg){ 
		l_margin = arg; 
		}
	public void r_marginSetter(double arg){ 
		r_margin = arg; 
		}
	public void b_marginSetter(double arg){ 
		b_margin = arg; 
		}
	public void depthSetter(double arg){ 
		depth = arg; 
		}
	public void widthSetter(double arg){ 
		width = arg; 
		}
	public void group_index_mSetter(int arg){ 
		group_index_m = arg; 
		}

}
