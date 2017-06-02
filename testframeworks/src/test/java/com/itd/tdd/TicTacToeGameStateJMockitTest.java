package com.itd.tdd;

import com.mongodb.MongoException;
import mockit.Deencapsulation;
import mockit.Expectations;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.jongo.MongoCollection;
import org.junit.Before;
import org.junit.Test;

import java.net.UnknownHostException;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * Demo for mocking framework JMockit
 */
public class TicTacToeGameStateJMockitTest {

    private TicTacToeGameState state;

    @Mocked
    private MongoCollection mongoCollection;

    private TicTacToeGameRound round;

    @Before
    public void setUp() throws UnknownHostException {
        // initiate round

        // instantiate class to test

        // use Deencapsulation to set private field mongoCollection
        Deencapsulation.setField(state, "mongoCollection", mongoCollection);
    }

    // check save invocation.
    // use NonStrictExpectations and times to mock mongoCollection.save
    @Test
    public void whenSaveThenInvokeMongoCollectionSaveAndReturnTrue() throws Exception {
        new NonStrictExpectations() {
            {
                mongoCollection.save(any);
                times = 1;
            }
        };
        assertThat(state.save(round), is(equalTo(true)));
    }

    // check when exception occurs during save, then save returns false
    // use Expectations and result to mock mongoCollection.save
    @Test
    public void givenMongoExceptionWhenSaveThenReturnFalse() {
        new Expectations() {
            {
                mongoCollection.save(any);
                result = new MongoException("failed");
            }
        };
        assertThat(state.save(round), is(equalTo(false)));
    }

    // check clear invocation
    // use Expectations to mock mongoCollection.drop()
    @Test
    public void whenClearThenInvokeMongoCollectionDrop() {
    }

    // check when exception occurs during clear, then clear returns false
    // use Expectations and result to mock mongoCollection.drop
    @Test
    public void givenMongoExceptionWhenClearThenReturnFalse() {
    }
}
