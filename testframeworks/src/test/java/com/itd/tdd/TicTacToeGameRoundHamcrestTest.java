package com.itd.tdd;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * Demo for tdd framework util Hamcrest
 * Benefits: https://objectpartners.com/2013/09/18/the-benefits-of-using-assertthat-over-other-assert-methods-in-unit-tests/
 * - readability
 * - type safety
 * - natively supported by JUnit (org.junit.Assert)
 * - portability: combine with TestNG and JUnit
 * - custom matchers
 *
 * use org.hamcrest.MatcherAssert.assertThat and org.junit.Assert.assertThat (with and without message),
 * is, not, equalTo, hasSize, containsInAnyOrder from org.hamcrest.Matchers.
 * implement ItdMatcher.itdEqualTo and use it here
 */
public class TicTacToeGameRoundHamcrestTest {
    private TicTacToeGameRound round;
    private final int id = 3;
    private final int x = 1;
    private final int y = 1;
    private final char player = 'X';

    public void before() {
        // initiate round
    }

    // check id is set after instantiation
    public void whenInstantiatedThenIdIsSet() {
        assertThat("After instantiation id is set", round.getId(), is(equalTo(id)));
        assertThat("After instantiation id is set", round.getId(), is(not(equalTo(4711)))); // unnecessary
    }

    // check x is set after instantiation
    public void whenInstantiatedThenXIsSet() {
        org.junit.Assert.assertThat(round.getX(), is(equalTo(x)));
    }

    // check y is set after instantiation
    public void whenInstantiatedThenYIsSet() {
    }

    // check player is set after instantiation
    public void whenInstantiatedThenPlayerIsSet() {
    }

    // check allowedChars are O and X after instantiation
    public void whenInstantiatedThenAllowedCharsAreOandX() {
    }
}
