package mg;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main
{
	private static class MyFrame extends JFrame
	{
		MyFrame()
		{
			MyPanel panel = new MyPanel();
			this.add(panel);
			this.setSize(300, 200);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
		}
	}

	private static class MyPanel extends JPanel
	{
		protected void paintComponent(Graphics g)
		{
			g.drawString("hello", 10, 10);
			g.drawLine(10, 20, 110, 20);
			g.drawRect(10, 30, 100, 100);
		}
	}

	public static void main(String[] args)
	{
		MyFrame my = new MyFrame();
	}
}

