package com.itd.tdd;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Demo for tdd framework util AssertJ
 * Benefits:
 * - fluent
 * - one import
 * use org.assertj.core.api.Java6Assertions.assertThat(.isEqualTo)(.hasSize)(.containsExactlyInAnyOrder)(.containsExactly)
 */
public class TicTacToeGameRoundAssertJTest {
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
        assertThat(round.getId()).isEqualTo(id).isNotEqualTo(4711);
    }

    // check x is set after instantiation
    public void whenInstantiatedThenXIsSet() {
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
