package com.itd.tdd.itdmatcher;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class ItdMatcher
	extends TypeSafeMatcher<Integer> {
    private Integer expected;

    public ItdMatcher(Integer expected) {
        this.expected = expected;
    }

    protected boolean matchesSafely(Integer actual) { // Matching logic
        // implement me
        return false;
    }

    public void describeTo(Description description) { // For error msg
        description.appendValue(expected);
    }

    public static ItdMatcher itdEqualTo(Integer expected) {
        // implement me
        return null;
    }
}
