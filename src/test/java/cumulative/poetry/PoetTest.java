package cumulative.poetry;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class PoetTest {
	
	List<String> testTale = new ArrayList<String>();
	private Poet poet;
	String actual;
	String expected;
	
	@Before
	public void setUp() {
		testTale.add("TestTale1");
		testTale.add("TestTale2");
		testTale.add("TestTale3");
		testTale.add("TestTale4");
		testTale.add("TestTale5");
		testTale.add("TestTale6");
		poet = new Poet(testTale);
	}
	
	@Test
	public void shouldReciteEachDay() {
		int dayToRecite = 1;
		int timesToEcho = 1;
		actual = poet.reciteEachDay(dayToRecite, timesToEcho);
		expected = "This is TestTale6\n" + 
				"TestTale6.";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void shouldRecite() {
		int timeToEcho = 0;
		actual = poet.recite(timeToEcho);
		expected = "Day 1\n" + 
				"This is TestTale6.\n" + 
				"\n" + 
				"Day 2\n" + 
				"This is TestTale5\n" + 
				"TestTale6.\n" + 
				"\n" + 
				"Day 3\n" + 
				"This is TestTale4\n" + 
				"TestTale5\n" + 
				"TestTale6.\n" + 
				"\n" + 
				"Day 4\n" + 
				"This is TestTale3\n" + 
				"TestTale4\n" + 
				"TestTale5\n" + 
				"TestTale6.\n" + 
				"\n" + 
				"Day 5\n" + 
				"This is TestTale2\n" + 
				"TestTale3\n" + 
				"TestTale4\n" + 
				"TestTale5\n" + 
				"TestTale6.\n" + 
				"\n" + 
				"Day 6\n" + 
				"This is TestTale1\n" + 
				"TestTale2\n" + 
				"TestTale3\n" + 
				"TestTale4\n" + 
				"TestTale5\n" + 
				"TestTale6.";
				
	}
	
}
