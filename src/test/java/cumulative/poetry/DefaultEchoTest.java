package cumulative.poetry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DefaultEchoTest {

	private DefaultEcho defaultEcho;
	List<String> tale = new ArrayList<String>();
	
	
	@BeforeEach
	public void setUp() {
		tale.add("TestTale1");
		tale.add("TestTale2");
	}
	
	
	@Test
	@DisplayName("Test to defaultEcho given tale")
	public void shouldEchoTale() {
		defaultEcho = new DefaultEcho(1);
		List<String> actual = defaultEcho.echoList(tale);
		List<String> expected = new ArrayList<String>();
		expected.add("TestTale1");
		expected.add("TestTale1");
		expected.add("TestTale2");
		expected.add("TestTale2");
		assertThat(actual, is(expected));
	}
	
	@Test
	@DisplayName("Test to check defaultEcho twice gives same result")
	public void shouldAlwaysEchoTaleWithSameResult() {
		defaultEcho = new DefaultEcho(1);
		List<String> firstEcho = defaultEcho.echoList(tale);
		List<String> secondEcho = defaultEcho.echoList(tale);
		assertThat(secondEcho, is(firstEcho));
	}
}
