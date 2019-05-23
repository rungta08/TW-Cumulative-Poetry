package cumulative.poetry;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

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
	
	public static List<List<String>> listOfListGenerator(List<String> list, int times) {
		List<List<String>> listOfList = new ArrayList<List<String>>();
		
		for(int i_times = 0;i_times <= times;i_times++) {
			listOfList.add(list);
		}
		
		
		return listOfList;
	}
	
	public static List<String> flattened(List<List<String>> listOfList) {
		List<String> flattenedList = new ArrayList<String>();
		
		listOfList.forEach(flattenedList::addAll);
		
		return flattenedList;
	}
	
	public static int[] randomValueGenerator(int seed, int numberRange, int sizeRequired) {
		Random random = new Random(seed);	 
		Set<Integer> randomSet = new LinkedHashSet<Integer>(sizeRequired);

		while(randomSet.size()< sizeRequired) {
			while (randomSet.add(random.nextInt(numberRange)) != true)
				;
		}

        int[] randomArray = new int[randomSet.size()];
		  
        int i = 0; 
        for (int x : randomSet) 
        	randomArray[i++] = x;
        return randomArray;
	}
		
}


