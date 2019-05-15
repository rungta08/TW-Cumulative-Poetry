package cumulative.poetry;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

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
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Test to check echo twice gives same result")
	public void shouldAlwaysEchoTaleWithSameResult() {
		echo = new Echo(tale, 1);
		List<String> firstEcho = echo.getEchoTale();
		List<String> secondEcho = echo.getEchoTale();
		assertEquals(firstEcho, secondEcho);
	}

}
