package mg.gui;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class RandomColor
{
	public static Color get()
	{
		Random rd = new Random();

		return new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
	}
}
