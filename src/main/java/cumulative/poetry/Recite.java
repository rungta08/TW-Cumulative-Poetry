package cumulative.poetry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recite {
	
	public static final String PREFIX = "This is ";
	public static final String SUFFIX = ".";
	public static final String PREFIX_RECITE_PER_DAY = "Day ";
	public static final String SEPEARTOR_DAY_TALE = "\n\n";
	
	List<String> poem;
	Reveal revealForDay;
	Echo echo;
	
	
	Recite(List<String> poem){
		this.poem = poem;
	}
	
	public String reciteForDay(int day, int echoTimes) {
		revealForDay = new Reveal(poem);
		String taleForDay;
		
		List<String> dayTale = new ArrayList<String>();
		dayTale = revealForDay.getTaleForDay(day); 
		
		echo = new Echo(dayTale, echoTimes);
		dayTale = echo.getEchoTale();
		
		String[] dayTaleArray = new String[dayTale.size()];
		for(int i = 0;i < dayTale.size();i++) {
			dayTaleArray[i] = dayTale.get(i);
		}
		
		String dayTaleString = Arrays.deepToString(dayTaleArray);
		dayTaleString = dayTaleString.substring(1, dayTaleString.length()-1).replace(", ", "\n");
		
		taleForDay = PREFIX + dayTaleString + SUFFIX;
		
		
		return taleForDay;
	}
	
	public String recitePoem(int echoTimes) {
		
		String taleFinal = "";
		
		for(int i = 1;i < poem.size();i++) {
			taleFinal = taleFinal + PREFIX_RECITE_PER_DAY + i + "\n" +this.reciteForDay(i, echoTimes) + SEPEARTOR_DAY_TALE;
		}
		taleFinal = taleFinal + PREFIX_RECITE_PER_DAY + poem.size() + "\n" +this.reciteForDay(poem.size(), echoTimes);
		
		return taleFinal;
	}
	
	

}
