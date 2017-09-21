package mg;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import mg.gui.*;

class Main
{
	public static void main(String[] args)
	{

		new CustomFrame().
			size(1000, 1000).
			adds(Shaper.makeRect(new MyPoint(0, 0), new MyPoint(100, 100))).
			start();
	}
}

