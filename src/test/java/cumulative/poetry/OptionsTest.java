package cumulative.poetry;

import static org.junit.Assert.assertThat;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import cumulative.poetry.CustomMatcher;

class OptionsTest {
	
	private Options options;
	
	
	String[] optionsArray = {"--echo","1","--reveal-for-day","--random","--seed","123"};

	@Test
	@DisplayName("Test to check creation of options")
	void test() {
		options = new Options(optionsArray);
		HashMap<String, Integer> actual = options.getOptions();
		HashMap<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("--echo", 1);
		expected.put("--reveal-for-day", 1);
		expected.put("--random", 1);
		expected.put("--seed", 13);
		assertThat(actual, CustomMatcher.mapEquivalent(expected));
	}

}
