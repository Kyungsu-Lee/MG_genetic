package mg.algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {
		static String[] m_name = new String[401];
		static String[] m_l_margin = new String[401];
		static String[] m_r_margin = new String[401];
		static String[] m_b_margin = new String[401];
		static String[] m_depth = new String[401];
		static String[] m_width = new String[401];
		static String[] m_group_index = new String[401];
	
		public void read(){
			String csvFile = "/Users/Hyo RIM Kim/Documents/한동대학교/Hong S-LAB/Honglab/data2.csv";
			String line = "";
			String cvsSplitBy = ",";
			int lineNum = 0;
		
			
			
			try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
				while((line = br.readLine())!=null){
					
					if(lineNum == 0){
						m_name = line.split(cvsSplitBy);
					}else if(lineNum == 1){
						m_l_margin = line.split(cvsSplitBy);
					}
					else if(lineNum == 2){
						m_r_margin = line.split(cvsSplitBy);
					}
					else if(lineNum == 3){
						m_b_margin = line.split(cvsSplitBy);
					}
					else if(lineNum == 4){
						m_depth= line.split(cvsSplitBy);
					}
					else if(lineNum == 5){
						m_width = line.split(cvsSplitBy);
					}else if(lineNum == 6){
						m_group_index = line.split(cvsSplitBy);
					}
					lineNum++;
				}
				for(int i=1; i < m_width.length;i++)
					System.out.println(m_group_index[i]);
			}
			catch (IOException e){
				e.printStackTrace();
			}
		}
}
