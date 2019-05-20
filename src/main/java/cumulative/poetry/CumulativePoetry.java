package cumulative.poetry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CumulativePoetry {

	public static final String OPTION_ECHO = "--echo";
	public static final String OPTION_REVEAL_FOR_DAY = "--reveal-for-day";
	public static final String OPTION_RECITE = "--recite";
	public static final String OPTION_RANDOM = "--random";
	public static final String OPTION_SEED = "--seed";
	public static final int DEFAULT_SEED = 123;
	public static final int ZERO = 0; 
	
	public static void main(String[] args) {
		//poem initialised
		List<String> tale = new ArrayList<String>();
						tale.add("the horse and the hound and the horn that belonged to");
						tale.add("the farmer sowing his corn that kept"); 
						tale.add("the rooster that crowed in the morn that woke"); 
						tale.add("the priest all shaven and shorn that married");
						tale.add("the man all tattered and torn that kissed");
						tale.add("the maiden all forlorn that milked");
						tale.add("that cow with the crumpled horn that tossed");
						tale.add("the dog that worried"); 
						tale.add("the cat that killed");
						tale.add("the rat that ate");
						tale.add("the malth that lay in");
						tale.add("the house that Jack built");
		try {

			Poet poet;
			Order taleOrder;
						
			Options option = new Options(args);
			HashMap<String, Integer> options = option.getOptions();//retrieving available options to work on
			
			if(options.containsKey(OPTION_RANDOM)) {
				
				if(options.containsKey(OPTION_SEED)) {
					taleOrder = new RandomOrder(tale, options.get(OPTION_SEED));
					
				}
				else {
					taleOrder = new RandomOrder(tale, DEFAULT_SEED);
				}
			}
			else {
				taleOrder = new DefaultOrder(tale);
			}
			poet = new Poet(taleOrder.orderedList());
			String poemForDay;
			if(options.containsKey(OPTION_REVEAL_FOR_DAY) && options.containsKey(OPTION_RECITE)) {
				
				throw new Exception();
				
			}
			
			else if(options.containsKey(OPTION_REVEAL_FOR_DAY)){
				
				if(options.containsKey(OPTION_ECHO)) {
					poemForDay = poet.reciteEachDay(options.get(OPTION_REVEAL_FOR_DAY), options.get(OPTION_ECHO));
				}
				else {
					poemForDay = poet.reciteEachDay(options.get(OPTION_REVEAL_FOR_DAY), ZERO);
				}
				
				System.out.println(poemForDay);
				
				
			}
			else if(options.containsKey(OPTION_RECITE)) {
				if(options.containsKey(OPTION_ECHO)) {
					poemForDay = poet.recite(options.get(OPTION_ECHO));
				}
				else {
					poemForDay = poet.recite(ZERO);
				}
				
				System.out.println(poemForDay);
				
			}
			else {

				throw new Exception();
				
			}
			
		}
		catch(Exception e) {
			System.out.println("Error1");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		 Poet poet;
//		 String poem = "";
//		 if(args[0].equals(ECHO_OPTION)) {
//			 switch(args[1]) {
//			 	//Option Reveal for day with Echo
//			 	case REVEAL_OPTION:
//			 		poem = poet.revealForDayEcho(Integer.parseInt(args[2])); 
//			 		break;
//			 		
//			 	//Option Recite with Echo
//			 	case RECITE_OPTION:
//			 		poem = poet.reciteEcho();
//			 		break;
//			 		
//			 	//Invalid Option
//			 	default:
//			 		poem = "Invalid Option";
//			 }
//			 System.out.println(poem);
//		 }
//		 else {
//			 switch(args[0]) {
//			 	//Option Reveal for day
//			 	case REVEAL_OPTION:
//			 		poem = poet.revealForDay(Integer.parseInt(args[1])); 
//			 		break;
//			 		
//			 	//Option Recite
//			 	case RECITE_OPTION:
//			 		poem = poet.recite();
//			 		break;
//			 	
//			 	//Invalid Option
//			 	default:
//			 		poem = "Invalid Option";
//			 }
//			 System.out.println(poem);	
//		 }
	 }
}
