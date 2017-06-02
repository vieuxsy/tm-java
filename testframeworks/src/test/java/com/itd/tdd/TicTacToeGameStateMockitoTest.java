package com.itd.tdd;

import com.mongodb.MongoException;
import org.jongo.MongoCollection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.UnknownHostException;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

/**
 * Demo for mocking framework Mockito
 * - spy (partial mocking): real object using real methods, unless specified otherwise
 */
@RunWith(MockitoJUnitRunner.class) // creates required mocks and inject them in the test class
public class TicTacToeGameStateMockitoTest {
    private TicTacToeGameState state;
    private MongoCollection mongoCollection;
    private TicTacToeGameRound round;

    @Before
    public void setUp() throws UnknownHostException {
        round = new TicTacToeGameRound(3, 'X', 2, 1);

        // use method spy() to partial mock class to test
        state = spy(new TicTacToeGameState());

        // use method mock(Class) to mock db dependency mongoCollection (all methods are shallow).
        mongoCollection = mock(MongoCollection.class);
    }

    // check DB_NAME is set after instantiation
    @Test
    public void whenInstantiatedThenMongoHasDbName() throws Exception {
    }

    // check COLLECTION_NAME is set after instantiation
    @Test
    public void whenInstantiatedThenMongoCollectionHasName() throws Exception {
    }

    // check save invocation.
    // use doReturn(mockObj).when(classToMock).methodToMock()
    // use verify
    @Test
    public void whenSaveThenInvokeMongoCollectionSaveAndReturnTrue() throws Exception {
        doReturn(mongoCollection).when(state).getMongoCollection();
        //assertThat
        verify(mongoCollection, times(1)).save(round);
    }

    // check when exception occurs during save, then save returns false
    // use doReturn, doThrow
    @Test
    public void givenMongoExceptionWhenSaveThenReturnFalse() {
        //doReturn
        doThrow(new MongoException("failed")).when(mongoCollection).save(any(TicTacToeGameRound.class));
//        assertThat
    }

    // check clear invocation
    @Test
    public void whenClearThenInvokeMongoCollectionDrop() {
//        doReturn(
//        assertThat
//        verify
    }

    // check when exception occurs during clear, then clear returns false
    @Test
    public void givenMongoExceptionWhenClearThenReturnFalse() {
//        doReturn
//        doThrow
//        assertThat
    }
}