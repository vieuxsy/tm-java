package com.itd.web;

import com.itd.tdd.TicTacToeGame;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.net.UnknownHostException;

@SessionScoped
@Named
public class TicTacToeGameUiController
	implements Serializable {

	/****************************************************************************************
	 * R7: create a web UI to input x, y and call play. The played rounds should be tracked
	 ****************************************************************************************/

	private int x = -1;
	private int y = -1;

	private TicTacToeGame game;
	private String gameHistory = "";

	@PostConstruct
	private void init() {
		try {
			// initialize game
		} catch (Exception e) {
			System.out.print("Error: " + e.getMessage());
		}
	}

	public String play() {
		String result = "";
		try {
			// set result
		} catch (Exception e) {
			result = "Error: " + e.getMessage();
		}
		//gameHistory += String.format("\n%s (%s,%s) - %s", game.getLastPlayer(), x, y, result);
		return "tictactoegameui";
	}

	public int getX() {
		return x;
	}

	public void setX(final int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(final int y) {
		this.y = y;
	}

	public String getGameHistory() {
		return gameHistory;
	}

	public void setGameHistory(String gameHistory) {
		this.gameHistory = gameHistory;
	}

}
