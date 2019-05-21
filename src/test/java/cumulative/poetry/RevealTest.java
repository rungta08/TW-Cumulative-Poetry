package cumulative.poetry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RevealTest {

	private Reveal reveal;
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
	@DisplayName("Test to get Tale for given day")
	public void shouldRevealTale() {
		reveal = new Reveal(tale);
		List<String> actual = reveal.getTaleForDay(2);
		List<String> expected = new ArrayList<String>();
		expected.add("TestTale4");
		expected.add("TestTale5");
		assertThat(actual, is(expected));
	}

}
