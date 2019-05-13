package cumulative.poetry;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PoetTest {
	
	private Poet poet;
	
	@Before
	public void  setUp() {
		poet = new Poet();
	}
	
    @Test 
    public void shouldSaySomething() {
        assertFalse("Poet should say something, but said nothing",poet.recite().isEmpty());
    }
    
    @Test 
    public void shouldSayPoem() {
    	String actual = poet.recite();
		assertEquals(
				"Day 1 - \nThis is the house that Jack built.\n\nDay 2 - \nThis is the malth that lay in\nthe house that Jack built.\n\nDay 3 - \nThis is the rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 4 - \nThis is the cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 5 - \nThis is the dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 6 - \nThis is that cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 7 - \nThis is the maiden all forlorn that milked\nthat cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 8 - \nThis is the man all tattered and torn that kissed\nthe maiden all forlorn that milked\nthat cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 9 - \nThis is the priest all shaven and shorn that married\nthe man all tattered and torn that kissed\nthe maiden all forlorn that milked\nthat cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 10 - \nThis is the rooster that crowed in the morn that woke\nthe priest all shaven and shorn that married\nthe man all tattered and torn that kissed\nthe maiden all forlorn that milked\nthat cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 11 - \nThis is the farmer sowing his corn that kept\nthe rooster that crowed in the morn that woke\nthe priest all shaven and shorn that married\nthe man all tattered and torn that kissed\nthe maiden all forlorn that milked\nthat cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built.\n\nDay 12 - \nThis is the horse and the hound and the horn that belonged to\nthe farmer sowing his corn that kept\nthe rooster that crowed in the morn that woke\nthe priest all shaven and shorn that married\nthe man all tattered and torn that kissed\nthe maiden all forlorn that milked\nthat cow with the crumpled horn that tossed\nthe dog that worried\nthe cat that killed\nthe rat that ate\nthe malth that lay in\nthe house that Jack built."
					 , 
					 actual);
    	
    }
    
    @Test 
    public void shouldRevealForDay() {
    	String actual = poet.revealforday(2);
		assertEquals("This is the malth that lay in\nthe house that Jack built.", actual);
    }
}
