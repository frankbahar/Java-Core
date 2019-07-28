package com.frankbahar;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore;

        finalScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + finalScore);
        score = 10_000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + finalScore);
        displayHighScorePosition("Player 1", calculateHighScorePosition(1000));
        displayHighScorePosition("Player 2", calculateHighScorePosition(900));
        displayHighScorePosition("Player 3", calculateHighScorePosition(400));
        displayHighScorePosition("Player 4", calculateHighScorePosition(50));
    }
    public static int calculateScore(boolean gameOver, int score,int levelCompleted, int bonus){
        int finalScore=0;
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else
            return -1;

    }
    public static void displayHighScorePosition ( String playersName, int position){
        System.out.println(playersName+" managed to get into " + position  );
    }
    public static int calculateHighScorePosition(int score){
//     if (score >= 1000)
//         return 1;
//     else if (score >= 500)
//              return 2;
//          else if (score >= 100)
//                  return 3;
//      return 4;
        int position=4; // assuming position 4 will be returned
        if (score >= 1000)
         position = 1;
        else if (score >= 500)
             position = 2;
          else if (score >= 100);
        {
            position = 3;
        }
        return position;
    }
}
