package mg.gui;

import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame
{
	public CustomFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	


	public CustomFrame size(int x, int y)
	{
		this.setSize(x,y);	
		
		return this;
	}

	public CustomFrame adds(Component com)
	{
		this.add(com);
	
		return this;
	}

	public void start()
	{
		repaint();
		this.setVisible(true);
	}
}
