package mg.machine;

import java.util.ArrayList;
import mg.gui.MyPoint;

public class Factory
{
	public static final double WIDTH = 400;
	public static final double HEIGHT = 82;
	public static final double WIDTH_BAY = 2;

	private final ArrayList<Section> sections = new ArrayList<Section>();

	private boolean upper_full = false;
	private boolean down_full = false;

	private double upper_b = 0;
	private double down_b = 0;



	public void addSection(Section s) throws Exception
	{
		if(!upper_full)
		{
			if(upper_b + s.getDepth() > WIDTH)
			{
				upper_full = true;
				addSection(s);
			}

			if(!upper_full)
			{
				this.sections.add(s);
				s.setGlobalLocation(upper_b, true);

				upper_b += s.getDepth();
			}
		}

		else if(!down_full)
		{
			if(down_b + s.getDepth() > WIDTH)
			{
				down_full = true;
				return ;
			}

			if(!down_full){
				this.sections.add(s);
				s.setGlobalLocation(down_b, false);

				down_b += s.getDepth();
			}
		}

		else
			throw new Exception();
	}

	public Factory build()
	{
		for(Section s : sections)
		{
			if(s.getGlobalFlag().equals("UP"))
			{
				s.fixGlobalLocation(new MyPoint(s.getGlobalLocation(), 0), new MyPoint(s.getGlobalLocation() + s.getDepth(), (HEIGHT-WIDTH_BAY)/2));
			}
			else if(s.getGlobalFlag().equals("DOWN"))
			{
				s.fixGlobalLocation(new MyPoint(s.getGlobalLocation(), (HEIGHT-WIDTH_BAY)/2+WIDTH_BAY), new MyPoint(s.getDepth() + s.getGlobalLocation(), HEIGHT));
			}
		}
		return this;
	}

	public ArrayList<Section> getAllSections() { return this.sections; }
}
