package cumulative.poetry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reveal {
	
	
	List<String> tale = new ArrayList<String>();
	int noOFDays;
	
	Reveal(List<String> tale){
		this.tale = tale;
		this.noOFDays = tale.size();
	}
	
	public List<String> getTaleForDay(int day){
		List<String> dayTale = new ArrayList<String>();
		dayTale = tale.subList(noOFDays-day, noOFDays);
		return dayTale;
	}
	
	
	
}
