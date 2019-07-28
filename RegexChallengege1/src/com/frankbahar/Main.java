package com.frankbahar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        //    System.out.println("Challenge1 " + challenge1.matches("^([A-Z]{1}[ ]{1}[a-z]{4}[ ]{1} [a-z]{1}[ ]{1}[a-z]{4}[\\.]{1})$"));
        System.out.println("Challenge1 " + challenge1.matches("I want a bike."));
        String challenge2 = "I want a ball";

        System.out.println("Challenge1 " + challenge1.matches("I want a \\w+."));
        System.out.println("Challenge2 " + challenge2.matches("I want a \\w+."));

        String regex = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        Matcher matcher2 = pattern.matcher(challenge2);
        System.out.println(matcher2.matches());

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("[ ]", "_"));
        System.out.println(challenge4.replaceAll("\\s", "_"));

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
        String regExp = "^[a-z?-i]+\\.\\d+$";
        String challenge7 = "abcD.135";
        System.out.println(challenge7.matches(regExp));

        String challenge8 = "abcd.135uvqz.7tzik.999";
     //   String h2GroupPattern = "(\\.)(?)(\\d*)";
        String h2GroupPattern = "[A-Za-z]+\\.(\\d+)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(challenge8);
        groupMatcher.reset();
        while (groupMatcher.find()) {
            System.out.println("Occurrence " + groupMatcher.group(1));

        }

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        //String c9Pattern = "(\\.)(?)(\\d*\\s)";
        String c9Pattern = "[A-Za-z]+\\.(\\d+)\\s";
        Pattern c9GPattern = Pattern.compile(c9Pattern);
        Matcher c9Matcher = c9GPattern.matcher(challenge9);
        while (c9Matcher.find()) {
            System.out.println("Occurrence " + c9Matcher.group(1));
            System.out.println("Occurrence "+ " : " + c9Matcher.start(1) + " to " +  (c9Matcher.end(1)-1));
        }

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        String c11Pattern = "\\{(.+?)\\}";
        Pattern c11GPattern = Pattern.compile(c11Pattern);
        Matcher c11Matcher = c11GPattern.matcher(challenge11);
        while (c11Matcher.find()) {
            System.out.println("Occurrence " + c11Matcher.group(1));
        }

        System.out.println("======================" );
        String challenge11a = "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {x, y}, {2, 4}, {11, 12}";
        String c11Patterna = "\\{(\\d+, \\d+)\\}";
        Pattern c11GPatterna = Pattern.compile(c11Patterna);
        Matcher c11Matchera = c11GPatterna.matcher(challenge11a);
        while (c11Matchera.find()) {
            System.out.println("Occurrence " + c11Matchera.group(1));
        }

        String challenge12 = "11111-0514";
        String zip = "^[0-9]{5}(-[0-9]{4})?$";
        System.out.println("Occurrence " + challenge12.matches(zip));
    }
}