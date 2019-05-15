package cumulative.poetry;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class TestRandom {
	public static final int SET_SIZE_REQUIRED = 12;
	public static final int NUMBER_RANGE = 12;

	public static void main(String[] args) {
		
		List<String> tale = new ArrayList<String>();
		tale.add("Hi");
		tale.add("Good");
		tale.add("Good1");
		tale.add("Goo2");
		tale.add("Goo3");
		tale.add("Goo4");
		
		Reveal reveal = new Reveal(tale);
		System.out.println(reveal.getTaleForDay(6));
		
		
		
		
		
		
//		String[] args1 = {"--ech"};
//		
//		Options options = new Options(args1);
//		
//		System.out.println(options.getOptionValue("--echo"));
		
		
		
		
		
		
		
		
		
		
		
		
//		Random random = new Random(10);	 
//        Set<Integer> set = new LinkedHashSet<Integer>(SET_SIZE_REQUIRED);
//
//        while(set.size()< SET_SIZE_REQUIRED) {
//            while (set.add(random.nextInt(NUMBER_RANGE)) != true)
//                ;
//            System.out.println(set);
//        }
//        System.out.println(set);
	}
}
