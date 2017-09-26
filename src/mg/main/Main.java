package mg.main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

import mg.gui.*;
import mg.machine.*;

class Main
{
	public static void main(String[] args)
	{
/*
		String str = "";


		//readFile
		try{

			str = (ReadFile.readFile(args[0]));
			ReadFile.setSequence(args[1]);

		}catch(Exception e)
		{
			System.out.println("File Name Error");
		}
*/
		RectDrawer rd = new RectDrawer()
					.addRect(new Rect(100, 100, 200, 200).setInnerColor(Color.RED))
					.addRect(new Rect(150, 150, 500, 500).setInnerColor(Color.BLUE))
					.build();

		new CustomFrame().size(500, 600).adds(rd).start();
	}
}

