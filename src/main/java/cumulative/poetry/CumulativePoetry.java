package cumulative.poetry;


public class CumulativePoetry {
	public static void main(String[] args) {
		 Poet poet = new Poet();
		 String poem = "";
		 switch(args[0]) {
		 	//Option Reveal for day
		 	case "--reveal-for-day":
		 		poem = poet.revealforday(Integer.parseInt(args[1])); 
		 		break;
		 		
		 	//Option Recite
		 	case "--recite":
		 		poem = poet.recite();
		 		break;
		 	
		 	//Invalid Option
		 	default:
		 		poem = "Invalid Option";
		 }
		 System.out.println(poem);
	 }
}
