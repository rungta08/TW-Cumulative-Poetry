package cumulative.poetry;

import java.util.ArrayList;
import java.util.List;

//Class to reveal poem for given day
public class Reveal {
	
	
	final List<String> tale;
	final int noOFDays;
	
	//initialise poem
	Reveal(List<String> tale){
		this.tale = tale;
		this.noOFDays = tale.size();
	}
	
	//method to get tale for given day
	public List<String> getTaleForDay(int day){
		List<String> dayTale = new ArrayList<String>();
		dayTale = tale.subList(noOFDays-day, noOFDays);
		return dayTale;
	}
	
	
	
}
