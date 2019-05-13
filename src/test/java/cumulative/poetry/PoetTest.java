package cumulative.poetry;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PoetTest {
	
	private Poet poet;
	
	//Will be running before every test 
	@Before
	public void  setUp() {
		poet = new Poet();
	}
	
	//Should be giving some output
    @Test 
    public void shouldSaySomething() {
        assertFalse("Poet should say something, but said nothing",poet.recite().isEmpty());
    }
    
    //Should be reciting whole poem day wise
    @Test 
    public void shouldSayPoem() {
    	String actual = poet.recite();
		assertEquals(
				"Day 1 - \nThis is the house that Jack built.\n\nDay 2 - \nThis is the malth that lay in\nthe house that Jack built.\n\nDay 3 - \nThis is the rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 4 - \nThis is the cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 5 - \nThis is the dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 6 - \nThis is that cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 7 - \nThis is the maiden all forlorn that milked\nthat cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 8 - \nThis is the man all tattered and torn that kissed\nthe maiden all forlorn that milked\nthat cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 9 - \nThis is the priest all shaven and shorn that married\nthe man all tattered and torn that kissed\nthe maiden all forlorn that milked\nthat cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 10 - \nThis is the rooster that crowed in the morn that woke\nthe priest all shaven and shorn that married\nthe man all tattered and torn that kissed\nthe maiden all forlorn that milked\nthat cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 11 - \nThis is the farmer sowing his corn that kept\nthe rooster that crowed in the morn that woke\nthe priest all shaven and shorn that married\nthe man all tattered and torn that kissed\nthe maiden all forlorn that milked\nthat cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 12 - \nThis is the horse and the hound and the horn that belonged to\nthe farmer sowing his corn that kept\nthe rooster that crowed in the morn that woke\nthe priest all shaven and shorn that married\nthe man all tattered and torn that kissed\nthe maiden all forlorn that milked\nthat cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built."
					 , 
					 actual);
    	
    }
    
    //Should Reveal poem Day wise
    @Test 
    public void shouldRevealForDay() {
    	String actual = poet.revealforday(2);
		assertEquals("This is the malth that lay in\nthe house that Jack built.", actual);
    }
    
    //Should be reciting whole poem day wise with echo
    @Test
    public void shouldSayPoemWithEcho() {
    	String actual = poet.recite_echo();
    	String expected = "Day 1 - \n" + 
    			"This is the house that Jack built\n" + 
    			"the house that Jack built.\n" + 
    			"\n" + 
    			"Day 2 - \n" + 
    			"This is the malth that lay in\n" + 
    			"the malth that lay in\n" + 
    			"the house that Jack built\n" + 
    			"the house that Jack built.\n" + 
    			"\n" + 
    			"Day 3 - \n" + 
    			"This is the rat that ate\n" + 
    			"the rat that ate\n" + 
    			"the malth that lay in\n" + 
    			"the malth that lay in\n" + 
    			"the house that Jack built\n" + 
    			"the house that Jack built.\n" + 
    			"\n" + 
    			"Day 4 - \n" + 
    			"This is the cat that killed\n" + 
    			"the cat that killed\n" + 
    			"the rat that ate\n" + 
    			"the rat that ate\n" + 
    			"the malth that lay in\n" + 
    			"the malth that lay in\n" + 
    			"the house that Jack built\n" + 
    			"the house that Jack built.\n" + 
    			"\n" + 
    			"Day 5 - \n" + 
    			"This is the dog that worried\n" + 
    			"the dog that worried\n" + 
    			"the cat that killed\n" + 
    			"the cat that killed\n" + 
    			"the rat that ate\n" + 
    			"the rat that ate\n" + 
    			"the malth that lay in\n" + 
    			"the malth that lay in\n" + 
    			"the house that Jack built\n" + 
    			"the house that Jack built.\n" + 
    			"\n" + 
    			"Day 6 - \n" + 
    			"This is that cow with the crumpled horn that tossed\n" + 
    			"that cow with the crumpled horn that tossed\n" + 
    			"the dog that worried\n" + 
    			"the dog that worried\n" + 
    			"the cat that killed\n" + 
    			"the cat that killed\n" + 
    			"the rat that ate\n" + 
    			"the rat that ate\n" + 
    			"the malth that lay in\n" + 
    			"the malth that lay in\n" + 
    			"the house that Jack built\n" + 
    			"the house that Jack built.\n" + 
    			"\n" + 
    			"Day 7 - \n" + 
    			"This is the maiden all forlorn that milked\n" + 
    			"the maiden all forlorn that milked\n" + 
    			"that cow with the crumpled horn that tossed\n" + 
    			"that cow with the crumpled horn that tossed\n" + 
    			"the dog that worried\n" + 
    			"the dog that worried\n" + 
    			"the cat that killed\n" + 
    			"the cat that killed\n" + 
    			"the rat that ate\n" + 
    			"the rat that ate\n" + 
    			"the malth that lay in\n" + 
    			"the malth that lay in\n" + 
    			"the house that Jack built\n" + 
    			"the house that Jack built.\n" + 
    			"\n" + 
    			"Day 8 - \n" + 
    			"This is the man all tattered and torn that kissed\n" + 
    			"the man all tattered and torn that kissed\n" + 
    			"the maiden all forlorn that milked\n" + 
    			"the maiden all forlorn that milked\n" + 
    			"that cow with the crumpled horn that tossed\n" + 
    			"that cow with the crumpled horn that tossed\n" + 
    			"the dog that worried\n" + 
    			"the dog that worried\n" + 
    			"the cat that killed\n" + 
    			"the cat that killed\n" + 
    			"the rat that ate\n" + 
    			"the rat that ate\n" + 
    			"the malth that lay in\n" + 
    			"the malth that lay in\n" + 
    			"the house that Jack built\n" + 
    			"the house that Jack built.\n" + 
    			"\n" + 
    			"Day 9 - \n" + 
    			"This is the priest all shaven and shorn that married\n" + 
    			"the priest all shaven and shorn that married\n" + 
    			"the man all tattered and torn that kissed\n" + 
    			"the man all tattered and torn that kissed\n" + 
    			"the maiden all forlorn that milked\n" + 
    			"the maiden all forlorn that milked\n" + 
    			"that cow with the crumpled horn that tossed\n" + 
    			"that cow with the crumpled horn that tossed\n" + 
    			"the dog that worried\n" + 
    			"the dog that worried\n" + 
    			"the cat that killed\n" + 
    			"the cat that killed\n" + 
    			"the rat that ate\n" + 
    			"the rat that ate\n" + 
    			"the malth that lay in\n" + 
    			"the malth that lay in\n" + 
    			"the house that Jack built\n" + 
    			"the house that Jack built.\n" + 
    			"\n" + 
    			"Day 10 - \n" + 
    			"This is the rooster that crowed in the morn that woke\n" + 
    			"the rooster that crowed in the morn that woke\n" + 
    			"the priest all shaven and shorn that married\n" + 
    			"the priest all shaven and shorn that married\n" + 
    			"the man all tattered and torn that kissed\n" + 
    			"the man all tattered and torn that kissed\n" + 
    			"the maiden all forlorn that milked\n" + 
    			"the maiden all forlorn that milked\n" + 
    			"that cow with the crumpled horn that tossed\n" + 
    			"that cow with the crumpled horn that tossed\n" + 
    			"the dog that worried\n" + 
    			"the dog that worried\n" + 
    			"the cat that killed\n" + 
    			"the cat that killed\n" + 
    			"the rat that ate\n" + 
    			"the rat that ate\n" + 
    			"the malth that lay in\n" + 
    			"the malth that lay in\n" + 
    			"the house that Jack built\n" + 
    			"the house that Jack built.\n" + 
    			"\n" + 
    			"Day 11 - \n" + 
    			"This is the farmer sowing his corn that kept\n" + 
    			"the farmer sowing his corn that kept\n" + 
    			"the rooster that crowed in the morn that woke\n" + 
    			"the rooster that crowed in the morn that woke\n" + 
    			"the priest all shaven and shorn that married\n" + 
    			"the priest all shaven and shorn that married\n" + 
    			"the man all tattered and torn that kissed\n" + 
    			"the man all tattered and torn that kissed\n" + 
    			"the maiden all forlorn that milked\n" + 
    			"the maiden all forlorn that milked\n" + 
    			"that cow with the crumpled horn that tossed\n" + 
    			"that cow with the crumpled horn that tossed\n" + 
    			"the dog that worried\n" + 
    			"the dog that worried\n" + 
    			"the cat that killed\n" + 
    			"the cat that killed\n" + 
    			"the rat that ate\n" + 
    			"the rat that ate\n" + 
    			"the malth that lay in\n" + 
    			"the malth that lay in\n" + 
    			"the house that Jack built\n" + 
    			"the house that Jack built.\n" + 
    			"\n" + 
    			"Day 12 - \n" + 
    			"This is the horse and the hound and the horn that belonged to\n" + 
    			"the horse and the hound and the horn that belonged to\n" + 
    			"the farmer sowing his corn that kept\n" + 
    			"the farmer sowing his corn that kept\n" + 
    			"the rooster that crowed in the morn that woke\n" + 
    			"the rooster that crowed in the morn that woke\n" + 
    			"the priest all shaven and shorn that married\n" + 
    			"the priest all shaven and shorn that married\n" + 
    			"the man all tattered and torn that kissed\n" + 
    			"the man all tattered and torn that kissed\n" + 
    			"the maiden all forlorn that milked\n" + 
    			"the maiden all forlorn that milked\n" + 
    			"that cow with the crumpled horn that tossed\n" + 
    			"that cow with the crumpled horn that tossed\n" + 
    			"the dog that worried\n" + 
    			"the dog that worried\n" + 
    			"the cat that killed\n" + 
    			"the cat that killed\n" + 
    			"the rat that ate\n" + 
    			"the rat that ate\n" + 
    			"the malth that lay in\n" + 
    			"the malth that lay in\n" + 
    			"the house that Jack built\n" + 
    			"the house that Jack built.";
    	assertEquals(expected, actual);
    }
    
    //Should Reveal poem Day Wise with Echo
    @Test
    public void shouldRevealForDayWithEcho() {
    	String actual = poet.revealforday_echo(2);
    	String expected = "This is the malth that lay in\nthe malth that lay in\nthe house that Jack built\nthe house that Jack built.";
    	assertEquals(expected, actual);
    }
}
