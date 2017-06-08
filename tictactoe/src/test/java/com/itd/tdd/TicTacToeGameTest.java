package com.itd.tdd;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Demo TDD. implement TicTacToeGame by first defining the spec here
 * Apply Red-Green-Refactore
 */
public class TicTacToeGameTest {

    private TicTacToeGame game;
    private TicTacToeGameState state;

    // to simulate exception use Junit Rule ExpectedException
    // https://github.com/junit-team/junit4/wiki/rules
    @Rule
    public ExpectedException exception = ExpectedException.none();


    @Before
    public final void before() {
        // mock state
        // mock state.clear default result
        // mock state.save default result
        // init game with state
    }


    /****************************************************************************************
     * R1: play one piece within a board of 3x3. Use method play()
     ****************************************************************************************/

    /**
     * R1.1: throw RuntimeException if x not valid
     */
    public void whenXOutsideBoardThenThrowRuntimeException() {

    }

    /**
     * R1.2: throw RuntimeException if y not valid
     */
    public void changeMe12() {

    }

    /**
     * R1.3: throw RuntimeException if field on x,y occupied
     */
    @Test
    public void changeMe13() {

    }

    /*****************************************************************************************
     * R2: track player switches between X and O. Use method nextPlayer()
     ****************************************************************************************/

    /**
     * R2.1: first player is X
     */
    @Test
    public void givenFirstRoundWhenNextPlayerThenX() {

    }

    /**
     * R2.2: if lastplayer was X, nextplayer is O
     */
    @Test
    public void changeMe22() {

    }

    /**
     * R2.3: if lastplayer was O, nextplayer is X
     * Usefull? false positiv
     */
    @Test
    public void changeMe23() {

    }


    /*****************************************************************************************
     * R3: player who connects a line (horizontal, vertical, or diagonal) first wins. play method should return result
     ****************************************************************************************/

    /**
     * R3.1: before line connected play is in progress
     */
    @Test
    public void whenPlayThenInProgress() {

    }

    /**
     * R3.2: player who connects whole horizontal line first wins.
     * X plays (1, 1), (2, 1), (3, 1), O plays (1, 2), (2, 2)
     */
    @Test
    public void whenPlayAndWholeHorizontalLineFilledThenWinner() {

    }

    /**
     * R3.3: player who connects whole vertical line first wins
     * X plays (2, 1), (3, 1), (2, 2), O plays (1, 1), (1, 2), (1, 3)
     */
    @Test
    public void changeMe33() {

    }

    /**
     * R3.4: player who connects whole top-bottom diagonal line first wins
     * X plays (1, 1), (2, 2), (3, 3), O plays (1, 2), (1, 3)
     */
    @Test
    public void changeMe34() {

    }

    /**
     * R3.5: player who connects bottom-top diagonal line first wins
     * X plays (1, 3), (2, 2), (3, 1); O plays (1, 1), (1, 2)
     */
    @Test
    public void changeMe35() {

    }

    /*****************************************************************************************
     * R4: play is draw if all fields set and no line connected
     * X plays (1, 1), (1, 3), (2, 3), (3, 1), (3, 2); O plays (1, 2), (2, 1), (2, 2), (3, 3)
     ****************************************************************************************/

    @Test
    public void whenAllFieldsFilledThenDraw() {

    }


    /*****************************************************************************************
     * R5: use MongoDB as persistent storage for the game state. implement TicTacToeGameStateTest
     ****************************************************************************************/


    /*****************************************************************************************
     * R6: save each round to DB and clean DB for each new game session.
     * mock TicTacToeGameState to focus on current class using mock() and doReturn()
     ****************************************************************************************/

    /**
     * R6.1: game state should be initialized at game session begin
     */
    @Test
    public void whenInstantiatedThenSetState() {

    }

    /**
     * R6.2: each game round (TicTacToeGameRound) should be saved to DB after play.
     * check if state.save has been invoked using verify()
     */
    @Test
    public void whenPlayThenSaveRoundIsInvoked() {

    }

    /**
     * R6.3: throw RuntimeException if save failed. Save should defaultly return true (mock it in before method)
     */
    @Test
    public void whenPlayAndSaveReturnsFalseThenThrowRuntimeException() {
//        doReturn(false).when(...
//        TicTacToeGameRound round = new TicTacToeGameRound(1, 'X', 1, 3);
//        exception.expect(...
//        game.play(...
    }

    /**
     * R6.4: the round should increase after each play.
     */
    @Test
    public void whenPlayMultipleTimesThenRoundIncreased() {
//        TicTacToeGameRound round1 = new TicTacToeGameRound(1, 'X', 1, 1);
//        game.play(round1.getX(), round1.getY());
//        verify(state, times(1)).save(round1);
//        TicTacToeGameRound round2 = new TicTacToeGameRound(2, 'O', 1, 2);
//        game.play(...
//        verify(...
    }

    /**
     * R6.5: game state data should be cleared at session begin
     */
    @Test
    public void whenInstantiatedThenStateCleared() {

    }

    /**
     * R6.6: throw RuntimeException if clearing state data fails. clear should defaultly return true (mock it in before method)
     */
    @Test
    public void whenInstantiatedAndClearReturnsFalseThenThrowRuntimeException() {
//        doReturn(...
//        exception.expect(...
//        new TicTacToeGame(state);
    }

    /****************************************************************************************
     * BP1: check the code coverage
     ****************************************************************************************/

    /****************************************************************************************
     * BP2: integrate real MongoDb. implement TicTacToeIntTest
     ****************************************************************************************/

    /****************************************************************************************
     * R7: create a web UI to input x, y and call play. The played rounds should be tracked
     * implement TicTacToeGameUiController
     ****************************************************************************************/

    /****************************************************************************************
     * R8: create automated systemtest using ui. implement TicTacToeGameUi
     ****************************************************************************************/

    /****************************************************************************************
     * R9: create automated acceptancetest using ui and cucumber
     ****************************************************************************************/
}
