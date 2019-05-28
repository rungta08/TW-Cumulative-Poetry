package cumulative.poetry;

import java.util.Arrays;
import java.util.List;

//Class to Recite Poem For Each Day
public class Recit {
	
	
	//Constants
	public static final String PREFIX = "This is ";
	public static final String SUFFIX = ".";
	public static final String PREFIX_RECITE_PER_DAY = "Day ";
	public static final String SEPEARTOR_DAY_TALE = "\n\n";
	
	final List<String> poem;
	
	//Initialise poem Tale
	Recit(List<String> poem){
		this.poem = poem;
	}
	
	//method to recite poem for a Day and defaultEcho given no of times
	public String reciteForDay(int day, Echo echo) {
		Reveal revealForDay = new Reveal(poem);


		List<String> dayTale = revealForDay.getTaleForDay(day);
		
		//get defaultEcho tale
		dayTale = echo.echoList(dayTale);
		
		//Converting list to array
		String[] dayTaleArray = new String[dayTale.size()];
		for(int i = 0;i < dayTale.size();i++) {
			dayTaleArray[i] = dayTale.get(i);
		}
		
		//converting array to String
		String taleForDay;
		String dayTaleString = Arrays.deepToString(dayTaleArray);
		dayTaleString = dayTaleString.substring(1, dayTaleString.length()-1).replace(", ", "\n");
		
		//adding prefixes and suffixes
		taleForDay = PREFIX + dayTaleString + SUFFIX;
		
		
		return taleForDay;
	}
	
	//method to recite whole poem day wise with given defaultEcho times
	public String recitePoem(Echo echo) {
		
		String taleFinal = "";
		
		//Concatenate each day poem
		for(int i = 1;i < poem.size();i++) {
			taleFinal = taleFinal + PREFIX_RECITE_PER_DAY + i + "\n" +this.reciteForDay(i, echo) + SEPEARTOR_DAY_TALE;
		}
		taleFinal = taleFinal + PREFIX_RECITE_PER_DAY + poem.size() + "\n" +this.reciteForDay(poem.size(), echo);
		
		return taleFinal;
	}
	
	

}
