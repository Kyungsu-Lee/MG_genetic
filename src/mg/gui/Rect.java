package mg.gui;

import java.awt.*;
import javax.swing.*;

public class Rect extends JPanel
{
	private MyPoint LU;
	private MyPoint RD;

	private double width = -1;
	private double height = -1;

	public Rect(MyPoint LU, MyPoint RD)
	{
		this.LU = LU;
		this.RD = RD;		
		
		repaint();
	}

	public Rect(double LU_X, double LU_Y, double RD_X, double RD_Y)
	{
		this.LU = new MyPoint(LU_X, LU_Y);
		this.RD = new MyPoint(RD_X, RD_Y);
		
		repaint();
	}

	public Rect(int LU_X, int LU_Y, int RD_X, int RD_Y)
	{
		this.LU = new MyPoint(LU_X, LU_Y);
		this.RD = new MyPoint(RD_X, RD_Y);
		
		repaint();
	}

	public double getCustomWidth()
	{
		if(width == -1)
			width = Math.abs(LU.getX() - RD.getX());
	
		return this.width;
	}

	public double getCustomHeight()
	{
		if(height == -1)
			height = Math.abs(LU.getY() - RD.getY());

		return this.height;
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		g.drawRect((int)LU.getX(), (int)LU.getY(), (int)getCustomWidth(), (int)getCustomHeight());
	}
}
