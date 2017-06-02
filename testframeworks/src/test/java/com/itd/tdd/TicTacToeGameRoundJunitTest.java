package com.itd.tdd;

import org.junit.*;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;

/**
 * Demo for tdd framework JUnit
 * use assertEquals, assertTrue (with and without message
 */
public class TicTacToeGameRoundJunitTest {
    private TicTacToeGameRound round;
    private final int id = 3;
    private final int x = 1;
    private final int y = 1;
    private final char player = 'X';

    @Rule
    public final TestName name = new TestName();

    @BeforeClass
    public static void beforeClass() {
        // called once on class initialization time
    }

    @AfterClass
    public static void afterClass() {
        // called once after all methods are executed
    }

    @Before
    public void before() {
        // called before each method execution
        // initiate round
    }

    @After
    public void after() {
        // called after each method execution
    }

    // check id is set after instantiation
    @Test
    public void whenInstantiatedThenIdIsSet() {
        assertEquals("After instantiation id is set", id, round.getId());
    }

    // check x is set after instantiation
    @Test
    public void whenInstantiatedThenXIsSet() {
    }

    // check y is set after instantiation
    @Test
    public void whenInstantiatedThenYIsSet() {
    }

    // check player is set after instantiation
    @Test
    public void whenInstantiatedThenPlayerIsSet() {
    }

    // check allowedChars are O and X after instantiation
    @Test
    public void whenInstantiatedThenAllowedCharsAreOandX() {

    }

    // check Rule TestName.getMethodName
    @Test
    public void whenGetMethodNameOfTestNameRuleInvokedThenReturnNameOfThisTest() {
    }

    // optional: will be used in Module2
    // play around Rules ExpectedException and TemporaryFolder
    // https://github.com/junit-team/junit4/wiki/rules (JUnit interceptors)
}