package mg.gui;

import java.awt.*;
import javax.swing.*;

public class Rect
{
	private MyPoint LU;
	private MyPoint RD;

	private double width = -1;
	private double height = -1;
	
	private Color borderColor = Color.BLACK;
	private Color innerColor = Color.BLACK;

	public Rect(MyPoint LU, MyPoint RD)
	{
		this.LU = LU;
		this.RD = RD;		
	}

	public Rect(double LU_X, double LU_Y, double RD_X, double RD_Y)
	{
		this.LU = new MyPoint(LU_X, LU_Y);
		this.RD = new MyPoint(RD_X, RD_Y);
	}

	public Rect(int LU_X, int LU_Y, int RD_X, int RD_Y)
	{
		this.LU = new MyPoint(LU_X, LU_Y);
		this.RD = new MyPoint(RD_X, RD_Y);
	}

	public Rect setBorderColor(Color color)
	{
		this.borderColor = color;

		return this;
	}

	public Rect setInnerColor(Color color)
	{
		this.innerColor = color;

		return this;
	}

	public Color getBorderColor() { return this.borderColor; }
	public Color getInnerColor() { return this.innerColor; }

	public MyPoint getLU() { return this.LU; }
	public MyPoint getRD() { return this.RD; }

	public double getWidth()
	{
		if(width == -1)
			width = Math.abs(LU.getX() - RD.getX());
	
		return this.width;
	}

	public double getHeight()
	{
		if(height == -1)
			height = Math.abs(LU.getY() - RD.getY());

		return this.height;
	}

	@Override
	public String toString()
	{
		return LU + " ~ " + RD;
	}
}
