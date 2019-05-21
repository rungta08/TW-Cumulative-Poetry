package cumulative.poetry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EchoTest {

	private Echo echo;
	List<String> tale = new ArrayList<String>();
	
	
	@BeforeEach
	public void setUp() {
		tale.add("TestTale1");
		tale.add("TestTale2");
	}
	
	
	@Test
	@DisplayName("Test to echo given tale")
	public void shouldEchoTale() {
		echo = new Echo(tale, 1);
		List<String> actual = echo.getEchoTale();
		List<String> expected = new ArrayList<String>();
		expected.add("TestTale1");
		expected.add("TestTale1");
		expected.add("TestTale2");
		expected.add("TestTale2");
		assertThat(actual, is(expected));
	}
	
	@Test
	@DisplayName("Test to check echo twice gives same result")
	public void shouldAlwaysEchoTaleWithSameResult() {
		echo = new Echo(tale, 1);
		List<String> firstEcho = echo.getEchoTale();
		List<String> secondEcho = echo.getEchoTale();
		assertThat(secondEcho, is(firstEcho));
	}

}
