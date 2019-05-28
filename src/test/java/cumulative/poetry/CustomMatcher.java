package cumulative.poetry;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class CustomMatcher extends TypeSafeDiagnosingMatcher<Map<String, Integer>> {
    private Map<String, Integer> m_expected;

    public CustomMatcher(Map<String, Integer> expected) {
        m_expected = expected;
    }

    public static CustomMatcher mapEquivalent(Map<String, Integer> expected) {
        return new CustomMatcher(expected);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Maps are equivalent");
    }

    @Override
    protected boolean matchesSafely(Map<String, Integer> actual, Description description) {
        boolean matched = true;

        Set<String> keys = new HashSet<>();
        keys.addAll(actual.keySet());
        keys.addAll(m_expected.keySet());

        for (String key: keys) {
            int expectedValue = m_expected.get(key);
            int actualValue = actual.get(key);

            if (actualValue != expectedValue) {
                matched = false;
                description
                    .appendText("\n\t\tValues differ: ")
                    .appendText("actual={").appendValue(key).appendText(": ").appendValue(actualValue).appendText("}")
                    .appendText(", expected={").appendValue(key).appendText(": ").appendValue(expectedValue).appendText("}");

            }
        }

        return matched;
    }
}
