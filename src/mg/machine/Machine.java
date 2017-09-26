package mg.machine;

public class Machine
{
	protected double l_margin;
	protected double r_margin;
	protected double b_margin;

	protected double width;
	protected double depth;

	protected int group_index;

	protected String name;

	public double get_l_margin() { return this.l_margin; }
	public double get_r_margin() { return this.r_margin; }
	public double get_b_margin() { return this.b_margin; }
	public double get_width() { return this.width; }
	public double get_depth() { return this.depth; }
	public String get_name() { return this.name; }

	public int get_index() { return this.group_index; }

	public void setGroupIndex(int index) { this.group_index = index; }
	public void setName(String name) { this.name = name; }

	public Machine(double l, double r, double b, double d, double w, int index, String name)
	{
		this.l_margin = l;
		this.r_margin = r;
		this.b_margin = b;
		this.width = w;
		this.depth = d;
		this.group_index = index;
		this.name = name;
	}

	public Machine(double l, double r, double b, double d, double w, int index)
	{
		this.l_margin = l;
		this.r_margin = r;
		this.b_margin = b;
		this.width = w;
		this.depth = d;
		this.group_index = index;
	}

	public Machine(double l, double r, double b, double d, double w)
	{
		this.l_margin = l;
		this.r_margin = r;
		this.b_margin = b;
		this.width = w;
		this.depth = d;
	}

	@Override
	public String toString() 
	{
		return this.name;	
	}
}
