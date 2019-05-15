package cumulative.poetry;

import java.util.List;

//Class Port to recite poem day wise and all together
public class Poet {
	
	Recite recite;
	
	
	//Initialise Poem and give options to poet 
	Poet(List<String> tale){
		recite = new Recite(tale);
	}
	
	//Method to return recite day 
	public String reciteEachDay(int day, int echoTimes) {
		return recite.reciteForDay(day, echoTimes);
	}
	
	//method to recite poem according to options
	public String recite(int day) {
		return recite.recitePoem(day);
	}
}
