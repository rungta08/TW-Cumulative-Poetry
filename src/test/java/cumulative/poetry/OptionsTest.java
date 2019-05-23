package cumulative.poetry;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.hamcrest.MatcherAssert.assertThat;

class OptionsTest {
	
	private Options options;
	
	
	String[] optionsArray = {"--echo","2","--recite"};

	@Test
	@DisplayName("Test to check creation of options")
	void test() {
		options = new Options(optionsArray);
		HashMap<String, Integer> actual = options.getOptions();
		HashMap<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("--echo", 2);
		expected.put("--recite", 1);
		assertThat(actual, CustomMatcher.mapEquivalent(expected));
	}

}
