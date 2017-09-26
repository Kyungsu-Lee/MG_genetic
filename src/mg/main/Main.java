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


		//readFile
		try{

			str = (ReadFile.readFile(args[0]));
			ReadFile.setSequence(args[1]);

		}catch(Exception e)
		{
			System.out.println("File Name Error");
		}

		GroupList gl = new GroupList(Parser.makeMachine(str), ReadFile.getSequence());

		ArrayList<Section> sections = new ArrayList<Section>();
	
		int index = 0;

		try{
			Section current = new Section(index, gl.get().get(0).getGroupIndex());
			sections.add(current);

			for(Machine m : gl.get().get(0).get())
			{
				if(current.addMachine(m))
				{
				}
				else
				{
					current = new Section(++index, gl.get().get(0).getGroupIndex());
					sections.add(current);
					current.addMachine(m);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

		for(Section s : sections)
		{
			System.out.println("l : " + s.getLSize() + "\tr : " + s.getRSize());
			System.out.println(s);
			System.out.println("\n\n====================================");
		}
	}
}

