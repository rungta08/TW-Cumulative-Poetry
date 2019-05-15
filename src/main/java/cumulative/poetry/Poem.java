package cumulative.poetry;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

//Poem defined day wise
public class Poem {
	
	private List<String> tale;
	
	//method to get poem
	public List<String> getTale() {
		return tale;
	}

	//method to set poem
	public void setTale(List<String> tale) {
		this.tale = tale;
	}
	
	public List<String> getRandomTale(int seed){
		List<String> randomTale = new ArrayList<String>();
		Random random = new Random(seed);	 
		Set<Integer> randomSet = new LinkedHashSet<Integer>(tale.size());

		while(randomSet.size()< tale.size()) {
			while (randomSet.add(random.nextInt(tale.size())) != true)
				;
		}
		
		int randomArray[] = new int[randomSet.size()]; 
		  
        int i = 0; 
        for (int x : randomSet) 
        	randomArray[i++] = x; 
        
        randomTale = randomize(randomArray);
        
		return randomTale;
	}
	
	public List<String> randomize(int[] randomArray){
		List<String> randomTale = new ArrayList<String>();
		
		for(int i = 0;i < randomArray.length;i++) {
			randomTale.add(this.tale.get(randomArray[i]));
		}
		
		return randomTale;
	}
}
