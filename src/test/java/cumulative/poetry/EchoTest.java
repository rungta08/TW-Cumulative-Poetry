package cumulative.poetry;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class EchoTest {

	private Echo echo;
	List<String> tale = new ArrayList<String>();
	
	
	@Before
	public void setUp() {
		tale.add("TestTale1");
		tale.add("TestTale2");
	}
	
	
	
	@Test
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

}
