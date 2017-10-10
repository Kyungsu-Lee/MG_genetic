package mg.main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

import mg.gui.*;
import mg.machine.*;

class Main
{
    private static double sizeProperty = 1;
    private static double bayStartX = 0*sizeProperty;
    private static double bayStartY = 40*sizeProperty;
    private static double bayEndX = 2*sizeProperty;
    private static double bayEndY = 42*sizeProperty;

	public static void main(String[] args)
	{
		String str = "";
		RectDrawer rd = new RectDrawer();

		Color m_r = new Color(255, 0, 120, 150);
		Color m_l = new Color(150, 255, 150, 150);

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

		Color[] color = new Color[9];
		for(int i=0; i < color.length; i++)
			color[i] = RandomColor.get();

        rd.addRect( new Rect( bayStartX, bayStartY, factory.getWidth(), bayEndY ) ) ;

		for(Section s : factory.getAllSections())
		{
			rd.addRect(s.toRect(Color.BLACK, color[s.getGroupIndex()]));

            if( s.getGlobalFlag() == "UP" ) {
                rd.addRect( new Rect( s.getBayStart(), 0, ( s.getBayStart() + 2.00 ), 40  )
                .setBorderColor(Color.BLACK).setInnerColor(color[s.getGroupIndex()] ) ) ;
            }
            else{
                rd.addRect( new Rect( s.getBayStart(), 42, ( s.getBayStart() + 2.00 ), 82  )
                .setBorderColor(Color.BLACK).setInnerColor(color[s.getGroupIndex()] ) ) ;               
            }

			int i = 0;
	
			for(Machine m : s.getAllMachines()){                            //
				if (i%2==0)                                                     //
					rd.addRect(m.toMRect(Color.BLACK, m_r));        //
				else
					rd.addRect(m.toMRect(Color.BLACK, m_l));        //
				i++;
			}

			for(Machine m : s.getAllMachines())
				rd.addRect(m.toRect(Color.BLACK, color[m.get_index()]));
		}
		new CustomFrame().size(2000, 1500).adds(rd).start();
		
	}
}

