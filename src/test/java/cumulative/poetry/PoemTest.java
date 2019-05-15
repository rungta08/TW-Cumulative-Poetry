package cumulative.poetry;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PoemTest {

	private Poem poem;
	List<String> testTale = new ArrayList<String>();
	
	@Before
	public void setUp() {
		testTale.add("TestTale1");
		testTale.add("TestTale2");
		testTale.add("TestTale3");
		testTale.add("TestTale4");
		testTale.add("TestTale5");
		testTale.add("TestTale6");
	}
	
	@Test
	public void shouldGiveRandomTale() {
		poem = new Poem();
		poem.setTale(testTale);
		List<String> actual = poem.getRandomTale(123);
		List<String> expected = new ArrayList<String>();
		expected.add("TestTale3");
		expected.add("TestTale6");
		expected.add("TestTale4");
		expected.add("TestTale1");
		expected.add("TestTale2");
		expected.add("TestTale5");
		assertEquals(expected,actual);
	}
	

}
