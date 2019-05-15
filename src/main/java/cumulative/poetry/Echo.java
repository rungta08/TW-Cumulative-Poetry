package cumulative.poetry;

import java.util.ArrayList;
import java.util.List;

//Class to echo any given tale
public class Echo {
	
	final List<String> tale;
	final int times;
	
	//initialise tale to be echo and no of times
	Echo(List<String> tale, int times){
		this.tale = tale;
		this.times = times;
	}
	
	//method returning echo tale
	public List<String> getEchoTale() {
		List<String> echoTale = new ArrayList<String>();
		
		for(int i = 0;i < tale.size();i++) {
			for(int j = 0;j <= times;j++) {
				echoTale.add(tale.get(i));
			}
		}
		return echoTale;
	}

}

