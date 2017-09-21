import java.util.*;
import java.io.*;

public class MachineManager {
	
	static ArrayList<MGroup> mGroup = new ArrayList<MGroup>(); // instantiation of ArrayList of MGroups

	MachineManager(){
		for(int i=0;i<8;i++){
			MGroup m = new MGroup(i);
			mGroup.add(m);
		}
	}
	
	public static void read(String path, String encoding) {
        BufferedReader br = null;
        String line;
        String cvsSplit = ",";

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path), encoding));
        	
            //String[] temp = null;
            //temp = new String[2806];
        	String[] lMarTemp;
        	lMarTemp = new String[401];
        	String[] rMarTemp;
        	rMarTemp = new String[401];
        	String[] bMarTemp;
        	bMarTemp = new String[401];
        	String[] depthTemp;
        	depthTemp = new String[401];
        	String[] widthTemp;
        	widthTemp = new String[401];
        	String[] gIndexTemp;
        	gIndexTemp = new String[401];
        	int l=0;
        	
            while ( (line = br.readLine()) != null ) {
            	// how to make more efficient design
        		String[] temp = line.split(cvsSplit);  // how to make more efficient design
            	/*
            	if(l==0){
            		temp = line.split(cvsSplit);  // how to make more efficient design
            		System.out.println(trash[3]);
            	}
            	*/
            	if(l==1){
            		lMarTemp = temp;
            	}
            	else if(l==2)
            		rMarTemp = temp;
            	else if(l==3)
            		bMarTemp = temp;
            	else if(l==4)
            		depthTemp = temp;
            	else if(l==5)
            		widthTemp = temp;
            	else if(l==6)
            		gIndexTemp = temp;
            	
        		//System.out.println( l + temp[400] );// + field[1] + field[2] + field[3] + field[4]);
        		l++;

            }
            for(int i=1; i<401; i++)
            	System.out.print(lMarTemp[i] + "  ");// + field[1] + field[2] + field[3] + field[4]);
        	System.out.println();
            for(int i=1; i<401; i++)
            	System.out.print(rMarTemp[i] + "  ");
        	System.out.println();
            for(int i=1; i<401; i++)
            	System.out.print(bMarTemp[i] + "  ");
        	System.out.println();
            for(int i=1; i<401; i++)
            	System.out.print(depthTemp[i] + "  ");
        	System.out.println();
            for(int i=1; i<401; i++)
            	System.out.print(widthTemp[i] + "  ");
        	System.out.println();
            for(int i=1; i<401; i++)
            	System.out.print(gIndexTemp[i] + "  ");

            
            for(int i=1; i<402; i++)
            { System.out.println( Integer.parseInt(gIndexTemp[i] ));
            	switch( Integer.parseInt(gIndexTemp[i]) ){
            		case 1:
            			mGroup.get(1).addMachine( Double.parseDouble(lMarTemp[i]), 
            					Double.parseDouble(rMarTemp[i]), 
            					Double.parseDouble(bMarTemp[i]), 
            					Double.parseDouble(depthTemp[i]), 
            					Double.parseDouble(widthTemp[i]), 
            					Integer.parseInt(gIndexTemp[i]) );
            		case 2:
            			mGroup.get(2).addMachine( Double.parseDouble(lMarTemp[i]), 
            					Double.parseDouble(rMarTemp[i]), 
            					Double.parseDouble(bMarTemp[i]), 
            					Double.parseDouble(depthTemp[i]), 
            					Double.parseDouble(widthTemp[i]), 
            					Integer.parseInt(gIndexTemp[i]) );  
            		case 3:
            			mGroup.get(3).addMachine( Double.parseDouble(lMarTemp[i]), 
            					Double.parseDouble(rMarTemp[i]), 
            					Double.parseDouble(bMarTemp[i]), 
            					Double.parseDouble(depthTemp[i]), 
            					Double.parseDouble(widthTemp[i]), 
            					Integer.parseInt(gIndexTemp[i]) );
            		case 4:
            			mGroup.get(4).addMachine( Double.parseDouble(lMarTemp[i]), 
            					Double.parseDouble(rMarTemp[i]), 
            					Double.parseDouble(bMarTemp[i]), 
            					Double.parseDouble(depthTemp[i]), 
            					Double.parseDouble(widthTemp[i]), 
            					Integer.parseInt(gIndexTemp[i]) );
            		case 5:
            			mGroup.get(5).addMachine( Double.parseDouble(lMarTemp[i]), 
            					Double.parseDouble(rMarTemp[i]), 
            					Double.parseDouble(bMarTemp[i]), 
            					Double.parseDouble(depthTemp[i]), 
            					Double.parseDouble(widthTemp[i]), 
            					Integer.parseInt(gIndexTemp[i]) );
            		case 6:
            			mGroup.get(6).addMachine( Double.parseDouble(lMarTemp[i]), 
            					Double.parseDouble(rMarTemp[i]), 
            					Double.parseDouble(bMarTemp[i]), 
            					Double.parseDouble(depthTemp[i]), 
            					Double.parseDouble(widthTemp[i]), 
            					Integer.parseInt(gIndexTemp[i]) );
            		case 7:
            			mGroup.get(7).addMachine( Double.parseDouble(lMarTemp[i]), 
            					Double.parseDouble(rMarTemp[i]), 
            					Double.parseDouble(bMarTemp[i]), 
            					Double.parseDouble(depthTemp[i]), 
            					Double.parseDouble(widthTemp[i]), 
            					Integer.parseInt(gIndexTemp[i]) );
            		case 8:
            			mGroup.get(8).addMachine( Double.parseDouble(lMarTemp[i]), 
            					Double.parseDouble(rMarTemp[i]), 
            					Double.parseDouble(bMarTemp[i]), 
            					Double.parseDouble(depthTemp[i]), 
            					Double.parseDouble(widthTemp[i]), 
            					Integer.parseInt(gIndexTemp[i]) );
            	}
            	
            }
            
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
	
	public static void display( int group_index ){
		
		int numberOfMachine = (mGroup.get(group_index)).size(); 
		System.out.println("group index : " + group_index);
		
		for( int i=0 ; i < numberOfMachine ; i++ ){
			System.out.println("M" + i + " :  " + (mGroup.get(group_index)).machines.get(i).l_margin + "  " 
		+ (mGroup.get(group_index)).machines.get(i).r_margin + "  "
		+ (mGroup.get(group_index)).machines.get(i).b_margin + "  " 
		+ (mGroup.get(group_index)).machines.get(i).depth + "  " 
		+ (mGroup.get(group_index)).machines.get(i).width);
		}	
	}

	public MGroup getMGroup( int MGroupIndex ) { return mGroup.get(MGroupIndex); }
	
	public static void main(String[] args) {
		MachineManager machineManager = new MachineManager();  // create machineManager instance, instance
		
		read("/Users/IK/Documents/workspace/MachineToCSV/data1.csv", "euc-kr");
		
		for(int i=0; i<8; i++){
			display(i);
		}
	}
	
	

}

// main에서 공간 세팅을 먼저하고 - 그다음에 attribute들의 속성을 채워넣는다
	
// 목적에 따라 구체적으로 생각해보고 설계하자