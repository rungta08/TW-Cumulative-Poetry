package cumulative.poetry;

import java.util.HashMap;

//Class to determine options and their value
public class Options {
	
	//constants
	public static final int OPTION_PRESENT_VALUE_DEFAULT = 1;
	public static final int OPTION_ABSENT_VALUE_DEFAULT = 0;
	
	HashMap<String, Integer> options = new HashMap<String, Integer>();
	
	//initialise options with their values
	Options(String[] args) {
		for(int i = 0;i < args.length;i++) {
			if(args[i].startsWith("--")) {
				boolean flag = true;
				try {			
					Integer.parseInt(args[i+1]);	
				}
				catch(Exception e){
					flag = false;
				}
				if(flag) { 
					options.put(args[i], Integer.parseInt(args[i+1])); 
				} 
				else {
					options.put(args[i], OPTION_PRESENT_VALUE_DEFAULT);
				}
			}
		}
	}
	
	//returning options
	public HashMap<String, Integer> getOptions(){
		return options;
	}
	
	//method to return value of options
	public int getOptionValue(String option) {
		int value;
		
		if(options.containsKey(option)) {
			value = options.get(option);
		}
		else {
			value = OPTION_ABSENT_VALUE_DEFAULT;
		}
		
		return value;
	}

}
