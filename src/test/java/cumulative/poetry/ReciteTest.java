package cumulative.poetry;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ReciteTest {

	private Recit recite;
	List<String> tale = new ArrayList<String>();
	
	
	@Before
	public void setUp() {
		tale.add("TestTale1");
		tale.add("TestTale2");
		tale.add("TestTale3");
		tale.add("TestTale4");
		tale.add("TestTale5");
		
	}
	
	
	
	@Test
	public void shouldRevealTalePerDay() {
		recite = new Recit(tale);
		String actual = recite.reciteForDay(2, 1);
		String expected = "This is TestTale4\nTestTale4\nTestTale5\nTestTale5.";
		assertEquals(expected, actual);
	}
	
	@Test 
	public void shouldRevealTaleDayWise() {
		recite = new Recit(tale);
		String actual = recite.recitePoem(1);
		String expected = "Day 1\nThis is TestTale5\nTestTale5.\n\nDay 2\nThis is TestTale4\nTestTale4\nTestTale5\nTestTale5.\n\nDay 3\nThis is TestTale3\nTestTale3\nTestTale4\nTestTale4\nTestTale5\nTestTale5.\n\nDay 4\nThis is TestTale2\nTestTale2\nTestTale3\nTestTale3\nTestTale4\nTestTale4\nTestTale5\nTestTale5.\n\nDay 5\nThis is TestTale1\nTestTale1\nTestTale2\nTestTale2\nTestTale3\nTestTale3\nTestTale4\nTestTale4\nTestTale5\nTestTale5.";
		assertEquals(expected,actual);
	}
	

}
