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
		String str = "";
		RectDrawer rd = new RectDrawer();

		//readFile
		try{

			str = (ReadFile.readFile(args[0]));
			ReadFile.setSequence(args[1]);

		}catch(Exception e)
		{
			System.out.println("File Name Error");
		}

		GroupList gl = new GroupList(Parser.makeMachine(str), ReadFile.getSequence());

		ArrayList<Section> sections = SectionDivider.make(gl);
		
		Factory factory = new Factory();

		try{
		for(Section s : sections)
		{
			factory.addSection(s);
			System.out.println("Section " + s.getIndex() + " inserted");
			}
		}	
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("fatal error : factory is full");
		}
		factory.build();

		for(Section s : factory.getAllSections())
			rd.addRect(s.toRect(Color.WHITE, RandomColor.get()));

		new CustomFrame().size(1000, 1000).adds(rd).start();
		
	}
}

