package mg.gui;

import java.util.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RectDrawer  extends JPanel
{	
	private double scale = 5;

	private ArrayList<Rect> rects = new ArrayList<Rect>();

	public RectDrawer()
	{
		
	}

	public RectDrawer addRect(Rect rect) 
	{ 
		this.rects.add(rect); 
	
		return this;
	}

	public RectDrawer addRects(ArrayList<Rect> rects)
	{
		for(Rect rect : rects)
			this.rects.add(rect);

		return this;
	}

	public RectDrawer addRect(Rect rect, Color borderColor)
	{
		this.rects.add(rect.setBorderColor(borderColor));
	
		return this;
	}

	public RectDrawer addRect(Rect rect, Color borderColor, Color innerColor)
	{
		this.rects.add(rect.setBorderColor(borderColor).setInnerColor(innerColor));
	
		return this;
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		for(Rect r : rects)
		{
			g.setColor(r.getInnerColor());
			g.fillRect(
				(int)(r.getLU().getX() * scale), 
				(int)(r.getLU().getY() * scale), 
				(int)(r.getWidth() * scale), 
				(int)(r.getHeight() * scale)
			);
			g.setColor(r.getBorderColor());
			g.drawRect(
				(int)(r.getLU().getX() * scale), 
				(int)(r.getLU().getY() * scale), 
				(int)(r.getWidth() * scale), 
				(int)(r.getHeight() * scale)
			);
		}
	}

	public RectDrawer build() 
	{ 
		repaint(); 
		
		return this;
	}
}
