package cumulative.poetry;

import java.util.ArrayList;
import java.util.List;

public class Utility {
	
	public static List<String> zip(List<String> list, int times) {
		List<String> zippedList = new ArrayList<String>();
		for(int i = 0;i < list.size();i++) {
			for(int j = 0;j <= times;j++) {
				zippedList.add(list.get(i));
			}
		}
		return zippedList;
		
	}

}
