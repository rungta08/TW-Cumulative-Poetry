package cumulative.poetry;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OrderTest {

	private Order poem;
	List<String> testTale = new ArrayList<String>();
	
	@BeforeEach
	public void setUp() {
		testTale.add("TestTale1");
		testTale.add("TestTale2");
		testTale.add("TestTale3");
		testTale.add("TestTale4");
		testTale.add("TestTale5");
		testTale.add("TestTale6");
	}
	
	@Test
	@DisplayName("Test to generate a default tale from given tale")
	public void shouldGiveTale() {
		poem = new DefaultOrder(testTale);
		List<String> actual = poem.orderedList();
		List<String> expected = new ArrayList<String>();
		expected.add("TestTale1");
		expected.add("TestTale2");
		expected.add("TestTale3");
		expected.add("TestTale4");
		expected.add("TestTale5");
		expected.add("TestTale6");
		assertThat(actual, is(expected));
	}
	
	@Test
	@DisplayName("Test to generate a random tale from given tale")
	public void shouldGiveRandomTale() {
		poem = new RandomOrder(testTale, 123);
		List<String> actual = poem.orderedList();
		List<String> expected = new ArrayList<String>();
		expected.add("TestTale3");
		expected.add("TestTale4");
		expected.add("TestTale1");
		expected.add("TestTale2");
		expected.add("TestTale5");
		expected.add("TestTale6");
		assertThat(actual, is(expected));
	}
	

}
