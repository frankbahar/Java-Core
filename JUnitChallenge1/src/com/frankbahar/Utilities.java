package com.frankbahar;

public class Utilities  {

    public Utilities() {
    }

    //Returns a char array containing every nth char. When sourceArray.lenght < n, returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n){
        if(sourceArray == null || sourceArray.length < n){
            return sourceArray;
        }

        int returnLength = sourceArray.length/n;
        char[] result = new char[returnLength];
        int index=0;
        for(int i = n; i< sourceArray.length;i+=n) {
            result[index++]=sourceArray[i-1];
        }
        return result;
    }

    //Removes pairs of the same character that are next to each other, by removing on e occurance of the character.
    // "ABCDEEF" -> "ABCDEF"
    // "ABCBDEEF" -> "ABCDEF"(the two B's aren't next to each other, so they aren't removed.
    public String removePairs(String source){
        //if length is less than 2 there won't be pairs
        if(source == null || source.length()<2){
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();
        for(int i = 0; i < string.length-1;i++) {
            if(string[i] != string[i+1]){
                sb.append(string[i]);
            }
        }
        //add the final characer which is always safe
        sb.append(string[string.length-1]);
        return sb.toString();
    }

    //perform a conversion based on some internal business rule.
    public int converter(int a, int b){
        return (a/b) + (a * 30) -2;
    }

    public String nullifOddLength(String source){
        if(source.length() %2 == 0) {
            return source;
        }
        return null;
    }
}
