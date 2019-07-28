package com.frankbahar;

public class Main {

    public static void main(String[] args) {
        int highScorePosition = mycalculateHighScorePosition(1500);
        mydisplayHighScorePosition("Player1",highScorePosition);
        highScorePosition = mycalculateHighScorePosition(900);
        mydisplayHighScorePosition("Player1",highScorePosition);
        highScorePosition = mycalculateHighScorePosition(400);
        mydisplayHighScorePosition("Player1",highScorePosition);
        highScorePosition = mycalculateHighScorePosition(50);
        mydisplayHighScorePosition("Player1",highScorePosition);

    }
    public static void mydisplayHighScorePosition (String playerName, int highScorePosition)
    {
        System.out.println(playerName + " managed to get in to position " + highScorePosition );
    }
    public static int mycalculateHighScorePosition(int playerScore){
    int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
            } else if (playerScore >= 100) {
            position = 3;
                    }
        return position;
        }
}

