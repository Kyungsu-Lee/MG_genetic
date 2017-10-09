package mg.machine;

import javax.swing.*;
import java.awt.*;

import mg.gui.*;

public class Machine
{
	protected double l_margin;
	protected double r_margin;
	protected double b_margin;

	protected double width;
	protected double depth;

	protected int group_index;

	protected String name;

	protected MyPoint LU;
	protected MyPoint RD;

	protected MyPoint MLU;
	protected MyPoint MRD;

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

	public void setGlobalLocation(MyPoint LU, MyPoint RD, MyPoint MLU, MyPoint MRD)
	{
		this.LU = LU;
		this.RD = RD;

		this.MLU = MLU;
		this.MRD = MRD;

		System.out.println(this.get_name() + " : " + LU + "~" + RD + " : " + MLU + "~" + MRD);
	}

	public Rect toRect()
	{
		return new Rect(LU, RD);
	}

	public Rect toRect(Color borderColor)
	{
		return new Rect(LU, RD).setBorderColor(borderColor);
	}

	public Rect toRect(Color borderColor, Color innerColor)
	{
		return new Rect(LU, RD).setBorderColor(borderColor).setInnerColor(innerColor);
	}

	public Rect toMRect()
	{
		return new Rect(MLU, MRD);
	}

	public Rect toMRect(Color borderColor)
	{
		return new Rect(MLU, MRD).setBorderColor(borderColor);
	}

	public Rect toMRect(Color borderColor, Color innerColor)
	{
		return new Rect(MLU, MRD).setBorderColor(borderColor).setInnerColor(innerColor);
	}

	@Override
	public String toString() 
	{
		return this.name;	
	}
}
