package com.frankbahar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();
        

        addInOrder(placeToVisit,"New York");
        addInOrder(placeToVisit,"New Jersey");
        addInOrder(placeToVisit,"Boston");
        addInOrder(placeToVisit,"Maine");
        addInOrder(placeToVisit,"Virgina");
        addInOrder(placeToVisit,"Dallas");
        addInOrder(placeToVisit,"California");
        addInOrder(placeToVisit,"North Caroline");
        printList(placeToVisit);
        addInOrder(placeToVisit,"Miami");
        addInOrder(placeToVisit,"Maine");
        printList(placeToVisit);
        visit(placeToVisit);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i=linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("================================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> strListIterator = linkedList.listIterator();
        while (strListIterator.hasNext()){
            int comparison = strListIterator.next().compareTo(newCity);
            if (comparison == 0){
                //equal do not add
                System.out.println(newCity + " already included as a destination");
                return false;
            }
            else if (comparison > 0){
                //new City should appear before this one
                //Boston ->Maine
                strListIterator.previous();
                strListIterator.add(newCity);
                return true;
            } else if (comparison <0) {
                //move on next city
            }
        }
        strListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting" + listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward=true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting" + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward=false;
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward=false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting" + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward=true;
                    }
                    break;
                case 3:
                    printMenu() ;
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                           "1 - to go to next city\n" +
                           "2 - to go to previous city\n" +
                           "3 - to see available actions");
    }
}
