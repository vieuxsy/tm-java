package com.itd.tdd;

import org.junit.Test;

import java.net.UnknownHostException;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * Demo for integration test
 * - tests should run fast. Therefore test only what is not yet unit tested
 * - Requires MongoDB running at default port 27017.
 *  Therefore open cmd in folder containing Vagrantfile and run "vagrant up"
 */
public class TicTacToeGameIntTest {
    /****************************************************************************************
     * BP2: integrate real MongoDb.
     ****************************************************************************************/

    private final int id = 1;
    private final int x = 1;
    private final int y = 1;

    /**
     * 1: interface to MongoDb (drop and save) should work
     */
//    @Test
    public void givenMongoDbIsUpWhenPlayThenDropAndSaveWork() throws UnknownHostException {
        TicTacToeGame game = new TicTacToeGame();
        game.play(x, y);
        // create expected round
        // get persisted round using state.findById
        // assert that persistedRound is expectedRound
    }
}
