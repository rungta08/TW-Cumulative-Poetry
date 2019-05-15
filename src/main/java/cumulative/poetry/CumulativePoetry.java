package cumulative.poetry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CumulativePoetry {

	
	
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
			
			Poem poem = new Poem();
			poem.setTale(tale);//set poem
			
			Options option = new Options(args);
			HashMap<String, Integer> options = option.getOptions();//retrieving available options to work on
			
			Poet poet = new Poet(poem, options);
			poet.recite();//Recite Poem according to Options
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
