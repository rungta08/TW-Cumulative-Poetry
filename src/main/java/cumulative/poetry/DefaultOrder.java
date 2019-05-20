package cumulative.poetry;

import java.util.List;

public class DefaultOrder implements Order{
	
	final List<String> list;
	final int seed;
	
	DefaultOrder(List<String> list){
		this.list = list;
		this.seed = 0;
	}
	
	public List<String> orderedList() {
		return list;
	}

}
