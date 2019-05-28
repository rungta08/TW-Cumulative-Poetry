package cumulative.poetry;

import java.util.ArrayList;
import java.util.List;

//Class to defaultEcho any given tale
public class DefaultEcho implements Echo{

	int times;

	DefaultEcho(int times){
		this.times = times;
	}

	
	//method returning defaultEcho tale
	public List<String> echoList(List<String> list) {
		List<String> echoList;
		List<List<String>> listOfEchoList = new ArrayList<List<String>>();

		listOfEchoList = Utility.listOfListGenerator(list, times);
		
		echoList = Utility.flattened(Utility.zip(listOfEchoList));
		
		return echoList;
	}

}


