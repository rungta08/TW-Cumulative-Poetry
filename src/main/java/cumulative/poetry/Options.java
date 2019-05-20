package cumulative.poetry;

import java.util.HashMap;

//Class to determine options and their value
public class Options {
	
	//constants
	public static final int OPTION_PRESENT_VALUE_DEFAULT = 1;
	public static final String REGEX_TO_CHECK_NUMBER = "^[0-9]+?";
	
	HashMap<String, Integer> options = new HashMap<String, Integer>();
	
	//initialise options with their values
	Options(String[] args) {
		for(int option_index = 0;option_index < args.length; option_index++) {
			if(args[option_index].startsWith("--")) {
				if(option_index + 1 < args.length && args[option_index+1].matches(REGEX_TO_CHECK_NUMBER)) { 
					options.put(args[option_index], Integer.parseInt(args[option_index+1])); 
				} 
				else {
					options.put(args[option_index], OPTION_PRESENT_VALUE_DEFAULT);
				}
			}
		}
	}
	
	//returning options
	public HashMap<String, Integer> getOptions(){
		return options;
	}
	
	

}
