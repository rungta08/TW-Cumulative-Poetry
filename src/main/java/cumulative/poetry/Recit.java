package cumulative.poetry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Class to Recite Poem For Each Day
public class Recit {
	
	
	//Constants
	public static final String PREFIX = "This is ";
	public static final String SUFFIX = ".";
	public static final String PREFIX_RECITE_PER_DAY = "Day ";
	public static final String SEPEARTOR_DAY_TALE = "\n\n";
	
	List<String> poem;
	Reveal revealForDay;
	Echo echo;
	
	//Initialise poem Tale
	Recit(List<String> poem){
		this.poem = poem;
	}
	
	//method to recite poem for a Day and echo given no of times
	public String reciteForDay(int day, int echoTimes) {
		revealForDay = new Reveal(poem);
		String taleForDay;
		
		List<String> dayTale = new ArrayList<String>();
		dayTale = revealForDay.getTaleForDay(day); 
		
		//get echo tale
		echo = new Echo(dayTale, echoTimes);
		dayTale = echo.getEchoTale();
		
		//Converting list to array
		String[] dayTaleArray = new String[dayTale.size()];
		for(int i = 0;i < dayTale.size();i++) {
			dayTaleArray[i] = dayTale.get(i);
		}
		
		//converting array to String
		String dayTaleString = Arrays.deepToString(dayTaleArray);
		dayTaleString = dayTaleString.substring(1, dayTaleString.length()-1).replace(", ", "\n");
		
		//adding prefixes and suffixes
		taleForDay = PREFIX + dayTaleString + SUFFIX;
		
		
		return taleForDay;
	}
	
	//method to recite whole poem day wise with given echo times
	public String recitePoem(int echoTimes) {
		
		String taleFinal = "";
		
		//Concatenate each day poem
		for(int i = 1;i < poem.size();i++) {
			taleFinal = taleFinal + PREFIX_RECITE_PER_DAY + i + "\n" +this.reciteForDay(i, echoTimes) + SEPEARTOR_DAY_TALE;
		}
		taleFinal = taleFinal + PREFIX_RECITE_PER_DAY + poem.size() + "\n" +this.reciteForDay(poem.size(), echoTimes);
		
		return taleFinal;
	}
	
	

}
