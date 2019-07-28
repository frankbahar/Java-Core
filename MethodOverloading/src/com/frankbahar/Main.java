package com.frankbahar;

public class Main {

    public static void main(String[] args) {
	int newScore = calculateScore("Frank",500);// write your code here
    System.out.println("New score is " + newScore);
    calculateScore(75);
    calculateScore();
    double centimeter = calcFeetAndInchesToCentimeters(0,13);
    if (centimeter < 0.0 )
        System.out.println("Invalid parameters");
    System.out.println(calcFeetAndInchesToCentimeters(60));
    System.out.println(centimeter);
        }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score*1000;
    }
    public static int calculateScore( int score){
        System.out.println("Unnnamed Player " +  " scored " + score + " points");
        return score*1000;
    }
    public static int calculateScore( ){
        System.out.println("No player name no player scoress");
        return 0;
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inch){
        if (feet <0)
            return -1;
        if (inch < 0 || inch > 12)
            return -1;
        return (((feet * 12) + inch) * 2.54);
    }
    public static double calcFeetAndInchesToCentimeters(double inch){
        double feet= (int) (inch / 12);
        if (inch < 0 )
           return -1;
        return calcFeetAndInchesToCentimeters(feet, inch % 12);
    }
    public
}
