package cumulative.poetry;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

//Poem defined day wise
public class Poem {
	
	
	final List<String> tale;
	
	Poem(List<String> tale){
		this.tale = tale;
	}
	
	//method to get poem
	public List<String> getTale() {
		return tale;
	}
	
	public List<String> getRandomTale(int seed){
		List<String> randomTale = new ArrayList<String>(); 
        randomTale = randomize(Utility.randomValueGenerator(seed, tale.size(), tale.size()));
		return randomTale;
	}
	
	public List<String> randomize(int[] randomArray){
		List<String> randomTale = new ArrayList<String>();
		
		for(int i = 0;i < randomArray.length;i++) {
			if(randomArray[i] != this.tale.size() - 1)
				randomTale.add(this.tale.get(randomArray[i]));
		}
		randomTale.add(this.tale.get(this.tale.size() - 1));
		
		return randomTale;
	}
}
