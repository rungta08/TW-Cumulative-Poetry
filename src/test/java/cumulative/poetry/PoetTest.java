package cumulative.poetry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PoetTest {
	
	List<String> testTale = new ArrayList<String>();
	private Poet poet;
	String actual;
	String expected;
	
	@BeforeEach
	public void setUp() {
		testTale.add("TestTale1");
		testTale.add("TestTale2");
		testTale.add("TestTale3");
		testTale.add("TestTale4");
		testTale.add("TestTale5");
		testTale.add("TestTale6");
		Order order = new DefaultOrder(testTale);
		Echo echo  = new DefaultEcho(0);
		poet = new Poet(echo, order);
	}
	
	@Test
	@DisplayName("Test for Each day recitation of given tale with given defaultEcho times")
	public void shouldReciteEachDay() {
		int dayToRecite = 1;
		actual = poet.reciteEachDay(dayToRecite);
		expected = "This is TestTale6.";
		
		assertThat(actual, is(expected));
	}
	
	@Test
	@DisplayName("Test for Whole poem recitation with given defaultEcho times")
	public void shouldRecite() {
		actual = poet.recite();
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
		assertThat(actual, is(expected));
				
	}
	
}
