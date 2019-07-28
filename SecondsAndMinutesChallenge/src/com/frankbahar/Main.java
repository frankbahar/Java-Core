package com.frankbahar;

public class Main {
    private static final  String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
	System.out.println(getDurationString(700, 25));
	System.out.println(getDurationString(3945));
        }
    public static String getDurationString(int minutes, int seconds){
        String myString;
        if (minutes < 0 || seconds < 0 || seconds > 59)
            return  INVALID_VALUE_MESSAGE;
        int hours=minutes/60;
        String hoursString;
        if (hours > 10 )
            hoursString = hours + "h ";
        else
            hoursString = "0"+ hours + "h ";
        String minutesString;
        minutes = minutes % 60;
        if (minutes > 10 )
            minutesString = minutes + "m ";
        else
            minutesString = "0"+ minutes + "m ";
        String secondsString;
        if (seconds > 10 )
            secondsString = seconds + "s ";
        else
            secondsString = "0"+ seconds + "s ";
        myString = hoursString + minutesString + secondsString;
        return myString;
    }
    public static String getDurationString( int seconds){
        String myString;
        if (seconds < 0 )
            return  INVALID_VALUE_MESSAGE;
        int minutes = seconds/60;
        return  getDurationString(minutes, seconds % 60);
    }
}
