package cumulative.poetry;

import java.util.ArrayList;
import java.util.List;

//Class to echo any given tale
public class Repeat {
	
	List<String> tale = new ArrayList<String>();
	int times;
	List<String> echoTale = new ArrayList<String>();
	
	//initialise tale to be echo and no of times
	Repeat(List<String> tale, int times){
		this.tale = tale;
		this.times = times;
	}
	
	//method returning echo tale
	public List<String> getEchoTale() {
		
		for(int i = 0;i < tale.size();i++) {
			for(int j = 0;j <= times;j++) {
				echoTale.add(tale.get(i));
			}
		}
		return echoTale;
	}

}
