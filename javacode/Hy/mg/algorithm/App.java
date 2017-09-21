package mg.algorithm;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
 
        List<String[]> data = new ArrayList<String[]>();
        String maNumber[];
              
        maNumber = new String[401];
        
        String l_margin[];
        l_margin = new String[401];

        String r_margin[];
        r_margin = new String[401];
        
        String b_margin[];
        b_margin = new String[401];
        
        String depth[];
        depth = new String[401];
        
        String width[];
        width = new String[401];
        
        String group_index[];
        group_index = new String[401];
        
        int index[] = new int[8];
        int j = 1;
        
        maNumber[0] = " ";
        l_margin[0] = "l_margin";
        r_margin[0] = "r_margin";
        b_margin[0] = "b_margin";
        depth[0] = "depth";
        width[0] = "width";
        group_index[0] = "group_index";
        
        for (int i = 0; i < 8; i++)
        {
        	
        	index[i] = j;
        	j++;
        }
        
        for(int i = 1; i <401;i++)
        {
        	maNumber[i] = "M" + i;
        }
        data.add(maNumber);	
        
        for(int i = 1; i <401;i++)
        {
        	depth[i] = Double.toString(Double.parseDouble(String.format("%.2f",Math.random()*3+3)));
        }
        
        for(int i = 1; i <401;i++)
        {
        	width[i] = Double.toString(Double.parseDouble(String.format("%.2f",Math.random()*3+3)));;
        }	

        for(int i = 1; i <401;i++)
        {
        	l_margin[i] = Double.toString(Double.parseDouble(String.format("%.2f",Math.random()*(8-Double.parseDouble(width[i])-0.5)+0.5)));
        }
        data.add(l_margin);	
        
        for(int i = 1; i <401;i++)
        {
        	r_margin[i] = Double.toString(Double.parseDouble(String.format("%.2f",Math.random()*(8-Double.parseDouble(width[i])-Double.parseDouble(l_margin[i])-0.5)+0.5)));
        }
        data.add(r_margin);	
        
        for(int i = 1; i <401;i++)
        {
        	b_margin[i] = Double.toString(Double.parseDouble(String.format("%.2f",Math.random()*(8-Double.parseDouble(depth[i]))+0.5)));
        }
        data.add(b_margin);	
        
        data.add(depth);
        data.add(width);
        
        for(int i = 1; i <401;i++)
        {
        	while(true){
        		j = (int) (Math.random() * 7) + 1;
        		index[j]++;
        		if(index[j]<=50)
        			break;
        	}
        	group_index[i] = Integer.toString(j);
        }
        data.add(group_index);	

        
        //data.add(new String[] { "2", "chris", "011-234-1231" });
        //data.add(new String[] { "4", "jack", "010-123-2341" });
 
        CSVWrite cw = new CSVWrite();
        cw.writeCsv(data);
    }
}

