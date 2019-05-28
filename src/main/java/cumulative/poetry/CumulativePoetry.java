package cumulative.poetry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CumulativePoetry {

	public static final String OPTION_ECHO = "--defaultEcho";
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

			Options option = new Options(args);
			HashMap<String, Integer> options = option.getOptions();//retrieving available options to work on

			int echoTimes = options.containsKey(OPTION_ECHO)?options.get(OPTION_ECHO):ZERO;


			Echo defaultEcho = new DefaultEcho(echoTimes);


			Order taleOrder;
			if(options.containsKey(OPTION_RANDOM)) {
				int seed = options.containsKey(OPTION_SEED)?options.get(OPTION_SEED):DEFAULT_SEED;
				taleOrder = new RandomOrder(tale, seed);
			}
			else {
				taleOrder = new DefaultOrder(tale);
			}


			Poet poet = new Poet(defaultEcho, taleOrder);


			String poemForDay;
			if(options.containsKey(OPTION_REVEAL_FOR_DAY) && options.containsKey(OPTION_RECITE)) {
				throw new Exception();	
			}
			else if(options.containsKey(OPTION_REVEAL_FOR_DAY)){
				poemForDay = poet.reciteEachDay(options.get(OPTION_REVEAL_FOR_DAY));
			}
			else if(options.containsKey(OPTION_RECITE)) {
				poemForDay = poet.recite();
			}
			else {
				throw new Exception();
			}


			System.out.println(poemForDay);
			
		}
		catch(Exception e) {
			System.out.println("Error1");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		 Poet poet;
//		 String poem = "";
//		 if(args[0].equals(ECHO_OPTION)) {
//			 switch(args[1]) {
//			 	//Option Reveal for day with DefaultEcho
//			 	case REVEAL_OPTION:
//			 		poem = poet.revealForDayEcho(Integer.parseInt(args[2])); 
//			 		break;
//			 		
//			 	//Option Recite with DefaultEcho
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
