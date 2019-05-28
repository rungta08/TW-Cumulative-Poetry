package cumulative.poetry;

//Class Port to recite poem day wise and all together
public class Poet {
	
	Recit recit;
	Echo echo;
	
	
	//Initialise Poem and give options to poet 
	Poet(Echo echo, Order order){
		recit = new Recit(order.orderedList());
		this.echo = echo;
	}
	
	//Method to return recite day 
	public String reciteEachDay(int day) {
		return recit.reciteForDay(day, echo);
	}
	
	//method to recite poem according to options
	public String recite() {
		return recit.recitePoem(echo);
	}
}
/*
tale.reverse()
new Poet(tale)
 */