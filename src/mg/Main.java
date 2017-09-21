package mg;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import mg.gui.*;

class Main
{
	public static void main(String[] args)
	{

		Rect r = Shaper.makeRect(new MyPoint(0, 0), new MyPoint(100, 100));
		Rect r2 = Shaper.makeRect(new MyPoint(300, 0), new MyPoint(100, 100));

		new CustomFrame().
			size(1000, 1000).
			adds(r).
			adds(r).
			start();

		System.out.println(r.getBackground());
	}
}

