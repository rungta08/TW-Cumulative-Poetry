package cumulative.poetry;

import java.util.ArrayList;
import java.util.List;

public class Echo {
	
	List<String> tale = new ArrayList<String>();
	int times;
	List<String> echoTale = new ArrayList<String>();
	
	Echo(List<String> tale, int times){
		this.tale = tale;
		this.times = times;
	}
	
	public List<String> getEchoTale() {
		
		for(int i = 0;i < tale.size();i++) {
			for(int j = 0;j <= times;j++) {
				echoTale.add(tale.get(i));
			}
		}
		return echoTale;
	}

}
