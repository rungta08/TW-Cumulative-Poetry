package cumulative.poetry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Poet {
	
	public static final String OPTION_ECHO = "--echo";
	public static final String OPTION_REVEAL_FOR_DAY = "--reveal-for-day";
	public static final String OPTION_RECITE = "--recite";
	public static final int ZERO = 0; 

	
	
	//Initialise poem 
	HashMap<String, Integer> options;
	Recite recite;
	String poemForDay;
	
	
	Poet(Poem poem, HashMap<String, Integer> options){
		recite = new Recite(poem.getTale());
		this.options = options;
	}
	
	public void recite() throws Exception {
		
		
		if(options.containsKey(OPTION_REVEAL_FOR_DAY) && options.containsKey(OPTION_RECITE)) {
			
			throw new Exception();
			
		}
		
		else if(options.containsKey(OPTION_REVEAL_FOR_DAY)){
			
			if(options.containsKey(OPTION_ECHO)) {
				poemForDay = recite.reciteForDay(options.get(OPTION_REVEAL_FOR_DAY), options.get(OPTION_ECHO));
			}
			else {
				poemForDay = recite.reciteForDay(options.get(OPTION_REVEAL_FOR_DAY), ZERO);
			}
			
			System.out.println(poemForDay);
			
			
		}
		else if(options.containsKey(OPTION_RECITE)) {

			if(options.containsKey(OPTION_ECHO)) {
				poemForDay = recite.recitePoem(options.get(OPTION_ECHO));
			}
			else {
				poemForDay = recite.recitePoem(ZERO);
			}
			
			System.out.println(poemForDay);
			
		}
		else {

			throw new Exception();
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
//	//Functionality to Reveal Poem at once day wise
//    public String recite() {
//    	String recitepoem = poem[11];
//		String result = "Day 1 - \nThis is " + recitepoem + "." + "\n\n";
//		for(int i = 1;i < 12;i++) {
//			recitepoem = poem[11 - i]+ "\n" + recitepoem;
//			int day = i + 1;
//			if(day == 12)
//				result = result + "Day "+ day +" - \nThis is " + recitepoem + ".";
//			else 
//				result = result + "Day "+ day +" - \nThis is " + recitepoem + "." + "\n\n";
//		}
//		return result;
//    }
}
