package cumulative.poetry;

import java.util.ArrayList;
import java.util.List;

public class RandomOrder implements Order{
	
	final List<String> list;
	final int seed;
	
	RandomOrder(List<String> list, int seed){
		this.list = list;
		this.seed = seed;
	}
	
	public List<String> getList() {
		List<String> randomTale = new ArrayList<String>(); 
        randomTale = randomize(Utility.randomValueGenerator(seed, list.size(), list.size()), list);
		return randomTale;
	}
	
	private List<String> randomize(int[] randomArray, List<String> list){
		List<String> randomTale = new ArrayList<String>();
		
		for(int i = 0;i < randomArray.length;i++) {
			if(randomArray[i] != list.size() - 1)
				randomTale.add(list.get(randomArray[i]));
		}
		randomTale.add(list.get(list.size() - 1));
		
		return randomTale;
	}
}
