package cumulative.poetry;

import java.util.List;

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
}
