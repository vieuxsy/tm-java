package com.itd.tdd;

import com.mongodb.MongoException;
import org.jongo.MongoCollection;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.UnknownHostException;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

/**
 * Demo for mocking framework Mockito
 * - spy (partial mocking): real object using real methods, unless specified otherwise
 */
@RunWith(MockitoJUnitRunner.class) // creates required mocks and inject them in the test class
@Ignore
public class TicTacToeGameStateTest {
    /*****************************************************************************************
     * R5: use MongoDB as persistent storage for the game state.
     ****************************************************************************************/

    /**
     * R5.1: implement java bean for storage representation. TicTacToeGameRound
     */

    private TicTacToeGameState state;
    private MongoCollection mongoCollection;
    private TicTacToeGameRound round;

    @Before
    public void setUp() throws UnknownHostException {
        round = new TicTacToeGameRound(3, 'X', 2, 1);

        // use method spy() to partial mock class to test
//        state = ...

        // use method mock(Class) to mock db dependency mongoCollection (all methods are shallow).
//        mongoCollection = ...
    }

    /**
     * R5.2: specify DB-Name
     */
    @Test
    public void whenInstantiatedThenMongoHasDbName() throws Exception {
        assertThat(state.getMongoCollection().getDBCollection().getDB().getName(), is(equalTo(TicTacToeGameState.DB_NAME)));
    }

    /**
     * R5.2: specify the mongo collection-name
     */
    @Test
    public void whenInstantiatedThenMongoCollectionHasName() throws Exception {
        assertThat(state.getMongoCollection().getDBCollection().getName(), is(equalTo(TicTacToeGameState.COLLECTION_NAME)));
    }

    /**
     * R5.3: save data to mongo-db and return true
     * use doReturn(mockObj).when(classToMock).methodToMock(), verify()
     */
    @Test
    public void whenSaveThenInvokeMongoCollectionSaveAndReturnTrue() throws Exception {
        doReturn(mongoCollection).when(state).getMongoCollection();
        assertThat(state.save(round), is(equalTo(true)));
        verify(mongoCollection, times(1)).save(round);
    }

    /**
     * R5.4: return false if MongoException occurs while saving
     * use doReturn, doThrow
     */
    @Test
    public void givenMongoExceptionWhenSaveThenReturnFalse() {
        doReturn(mongoCollection).when(state).getMongoCollection();
        doThrow(new MongoException("failed")).when(mongoCollection).save(any(TicTacToeGameRound.class));
        assertThat(state.save(round), is(equalTo(false)));
    }

    /**
     * R5.5: specify droping data
     */
    @Test
    public void whenClearThenInvokeMongoCollectionDrop() {
        doReturn(mongoCollection).when(state).getMongoCollection();
//        assertThat(...
//        verify(...
    }

    /**
     * R5.6: return false if MongoException occurs while dropping
     * use doReturn, doThrow
     */
    // check when exception occurs during clear, then clear returns false
    @Test
    public void givenMongoExceptionWhenClearThenReturnFalse() {
//        doReturn(...
//        doThrow(...
//        assertThat(...
    }
}