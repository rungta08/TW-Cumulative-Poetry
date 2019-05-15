package cumulative.poetry;

import java.util.List;

//Class to echo any given tale
public class Echo {
	
	Utility utility = new Utility();
	
	final List<String> tale;
	final int times;
	
	//initialise tale to be echo and no of times
	Echo(List<String> tale, int times){
		this.tale = tale;
		this.times = times;
	}
	
	//method returning echo tale
	public List<String> getEchoTale() {
		List<String> echoTale;
		
		echoTale = Utility.zip(tale, times);
		
		return echoTale;
	}

}

