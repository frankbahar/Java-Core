package com.frankbahar;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//	    if (score < 5000 && score > 1000)
//	        System.out.println("Your score was less than 5000 but greated than 1000");
//	    else if (score < 1000)
//	    	System.out.println("Your score was less than 1000");
//	    else
//	    	System.out.println("You got here");
        if (gameOver){
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score was " + finalScore );
        }
        boolean newGameover=true;
        int secondScore = 10_000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;
        if (newGameover){
            int finalScore = secondScore + (secondLevelCompleted*secondBonus);
            System.out.println("Your final score was " + finalScore );
        }
    }
}
