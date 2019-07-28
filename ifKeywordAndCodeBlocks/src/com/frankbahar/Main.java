package com.frankbahar;

public class Main {

    public static void main(String[] args) {
    	int highScorePosition = calculateHighScorePosition(1500);
	    displayHighScorePosition("Player1",highScorePosition);
		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Player1",highScorePosition);
		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Player1",highScorePosition);
		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Player1",highScorePosition);

		}
    }
    public static void displayHighScorePosition (String playerName, int highScorePosition)
	{
		System.out.println(playerName + " managed to get in to position " + highScorePosition );
	}
	public static int calculateHighScorePosition(int playerScore){
		int position = 4;
		if (playerScore >= 1000) {
			//position = 1;
			return 1;
		} else if (playerScore >= 500) {
			//position = 2;
			return 2;
		} else if (playerScore >= 100) {
			//position = 3;
			return 3;
		}
		//return position;
		return 4;
	}
}

