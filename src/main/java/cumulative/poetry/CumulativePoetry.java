package cumulative.poetry;


public class CumulativePoetry {
	public static void main(String[] args) {
		 Poet poet = new Poet();
		 String poem = "";
		 switch("--recite") {

//		 	case "--reveal-for-day":
//		 		poem = poet.revealforday(Integer.parseInt(args[1])); 
//				
//		 		break;

		 	case "--recite":
		 		poem = poet.recite();
		 		break;

		 	default:
		 		poem = "Invalid Option";
		 }
		 System.out.println(poem);
	 }
}
