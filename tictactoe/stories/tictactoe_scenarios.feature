
Feature: tictactoe game
  As a game member, I want to play TicTacToe, So that I can win

  Scenario: TicTacToe play first round
    Given user browses to http://localhost:8080/tictactoe-full/
    When user enters 1 in input field:x and 1 in input field:y
    When user clicks button field:play
    Then content of field field:history is X (1,1) - In progress