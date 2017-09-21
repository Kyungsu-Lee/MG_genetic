
public class Machine {
	
	public double l_margin;
	public double r_margin;
	public double b_margin;
	public double depth;
	public double width;
	public int group_index_m;
	
	Machine(double l_margin_arg, double r_margin_arg, double b_margin_arg, double depth_arg, double width_arg, int group_index_m_arg)
	{
		l_margin = l_margin_arg;
		l_margin = l_margin_arg;
		l_margin = l_margin_arg;
		depth = depth_arg;
		width = width_arg;
		group_index_m = group_index_m_arg;
	}

	public double l_marginGetter(){ return l_margin; }
	public double r_marginGetter(){ return r_margin; }
	public double b_marginGetter(){ return b_margin; }
	public double depthGetter(){ return depth; }
	public double widthGetter(){ return width; }
	public int group_index_mGetter(){ return group_index_m; }

	public void l_marginSetter(double arg){ l_margin = arg; }
	public void r_marginSetter(double arg){ r_margin = arg; }
	public void b_marginSetter(double arg){ b_margin = arg; }
	public void depthSetter(double arg){ depth = arg; }
	public void widthSetter(double arg){ width = arg; }
	public void group_index_mSetter(int arg){ group_index_m = arg; }
	


}
