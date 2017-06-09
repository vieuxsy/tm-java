package com.itd.tdd;

import java.net.UnknownHostException;

public class TicTacToeGame {
    private int round = 0;
    private static final int SIZE = 3;
    public static final char UNOCCUPIED = '\0';
    public static final String RESULT_IN_PROGRESS = "In progress";
    public static final String RESULT_DRAW = "Draw";
    public static final String RESULT_WINNER = "Winner is %s";
    private Character[][] board = {
        {UNOCCUPIED, UNOCCUPIED, UNOCCUPIED}
        , {UNOCCUPIED, UNOCCUPIED, UNOCCUPIED}
        , {UNOCCUPIED, UNOCCUPIED, UNOCCUPIED}
    };

    private char lastPlayer = UNOCCUPIED;
    public char getLastPlayer() {
        return lastPlayer;
    }
    private TicTacToeGameState state;
    public TicTacToeGameState getState() {
        return state;
    }

    public TicTacToeGame() {

    }
	
	protected TicTacToeGame(TicTacToeGameState state) {
        this.state = state;
    }

    public void play(int x, int y) {

    }

    public void nextPlayer() {
		
    }

    private void checkCoordinate(int coordinate) {

    }

    private void setField(TicTacToeGameRound round) {

    }

    // 'X'=88 * 3 = 264 => X wins, 'O'=79 * 3 = 237 => O wins
    private boolean isWin(int x, int y) {
        int playerTotal = lastPlayer * SIZE;
        char horizontal = UNOCCUPIED;
        char vertical = UNOCCUPIED;
        char diagonal1 = UNOCCUPIED;
        char diagonal2 = UNOCCUPIED;
        for (int i = 0; i < SIZE; i++) {
            horizontal += board[i][y - 1];
            vertical += board[x - 1][i];
            diagonal1 += board[i][i];
            diagonal2 += board[i][SIZE - i - 1];
        }
        return horizontal == playerTotal
                //|| vertical == playerTotal
                //|| diagonal1 == playerTotal
                //|| diagonal2 == playerTotal
				;
    }

    // if one field is UNOCCUPIED false, else true
    private boolean isDraw() {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                if (board[x][y] == UNOCCUPIED) {
                    return false;
                }
            }
        }
        return true;
    }
}
