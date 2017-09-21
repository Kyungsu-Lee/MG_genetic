package mg.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Shaper extends JPanel
{	
	public static Rect makeRect(MyPoint LU, MyPoint RD)
	{
		Rect r = new Rect(LU, RD);
		r.setOpaque(true);
		r.setBackground(Color.RED);
		return r;
	}
}
