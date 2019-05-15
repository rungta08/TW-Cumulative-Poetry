package cumulative.poetry;

import java.util.List;

//Class Port to recite poem day wise and all together
public class Poet {
	
	Recit recit;
	
	
	//Initialise Poem and give options to poet 
	Poet(List<String> tale){
		recit = new Recit(tale);
	}
	
	//Method to return recite day 
	public String reciteEachDay(int day, int echoTimes) {
		return recit.reciteForDay(day, echoTimes);
	}
	
	//method to recite poem according to options
	public String recite(int echoTimes) {
		return recit.recitePoem(echoTimes);
	}
}
