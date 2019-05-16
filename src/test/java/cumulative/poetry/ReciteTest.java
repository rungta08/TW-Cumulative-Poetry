package cumulative.poetry;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReciteTest {

	private Recit recite;
	List<String> tale = new ArrayList<String>();
	
	
	@BeforeEach
	public void setUp() {
		tale.add("TestTale1");
		tale.add("TestTale2");
		tale.add("TestTale3");
		tale.add("TestTale4");
		tale.add("TestTale5");
		
	}
	
	
	
	@Test
	@DisplayName("Test for getting tale in Strign form and Echoed for given Day")
	public void shouldRevealTalePerDay() {
		recite = new Recit(tale);
		String actual = recite.reciteForDay(2, 1);
		String expected = "This is TestTale4\nTestTale4\nTestTale5\nTestTale5.";
		assertThat(actual, is(expected));
	}
	
	@Test 
	@DisplayName("Test for getting tale in Strign form and Echoed")
	public void shouldRevealTaleDayWise() {
		recite = new Recit(tale);
		String actual = recite.recitePoem(1);
		String expected = "Day 1\nThis is TestTale5\nTestTale5.\n\nDay 2\nThis is TestTale4\nTestTale4\nTestTale5\nTestTale5.\n\nDay 3\nThis is TestTale3\nTestTale3\nTestTale4\nTestTale4\nTestTale5\nTestTale5.\n\nDay 4\nThis is TestTale2\nTestTale2\nTestTale3\nTestTale3\nTestTale4\nTestTale4\nTestTale5\nTestTale5.\n\nDay 5\nThis is TestTale1\nTestTale1\nTestTale2\nTestTale2\nTestTale3\nTestTale3\nTestTale4\nTestTale4\nTestTale5\nTestTale5.";
		assertThat(actual, is(expected));
	}
	

}
