package mg.machine;

public class Machine
{
	protected double l_margin;
	protected double r_margin;
	protected double b_margin;

	protected double width;
	protected double depth;

	protected int group_index;

	public double get_l_margin() { return this.l_margin; }
	public double get_r_margin() { return this.r_margin; }
	public double get_d_margin() { return this.b_margin; }
	public double get_width() { return this.width; }
	public double get_depth() { return this.depth; }

	public Machine(double l, double r, double b, double w, double d, int index)
	{
		this.l_margin = l;
		this.r_margin = r;
		this.b_margin = b;
		this.width = w;
		this.depth = d;
		this.group_index = index;
	}
}
