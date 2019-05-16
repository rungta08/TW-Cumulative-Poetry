package cumulative.poetry;

import java.util.ArrayList;
import java.util.List;

public class Utility {
	
	public static List<List<String>> zip(List<List<String>> listOfTales) {
		List<List<String>> zipped = new ArrayList<List<String>>();
	    for (List<String> list : listOfTales) {
	        for (int i = 0, listSize = list.size(); i < listSize; i++) {
	            List<String> list2;
	            if (i >= zipped.size())
	                zipped.add(list2 = new ArrayList<String>());
	            else
	                list2 = zipped.get(i);
	            list2.add(list.get(i));
	        }
	    }
	    return zipped;
		
	}
	
	public static List<String> flattened(List<List<String>> listOfList) {
		List<String> flattenedList = new ArrayList<String>();
		
		listOfList.forEach(flattenedList::addAll);
		
		return flattenedList;
	}
	
}


