package cumulative.poetry;


public class CumulativePoetry {
	public static void main(String[] args) {
		 Poet poet = new Poet();
		 String poem = "";
		 if(args[0] != "--echo") {
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
		 else {
			 switch(args[1]) {
			 	//Option Reveal for day with Echo
			 	case "--reveal-for-day":
			 		poem = poet.revealforday_echo(Integer.parseInt(args[2])); 
			 		break;
			 		
//			 	//Option Recite with Echo
//			 	case "--recite":
//			 		poem = poet.recite_echo();
//			 		break;
			 		
			 	//Invalid Option
			 	default:
			 		poem = "Invalid Option";
			 }
			 System.out.println(poem);
		 }
	 }
}
