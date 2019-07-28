package com.frankbahar;

import java.util.*;

public class Main {
    private static ArrayList<Album> myAlbums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album1 = new Album("Aynali Kemer","Baris");
        album1.addNewSong("Aynali Kemer", 3);
        album1.addNewSong("Daglar Daglar", 2);
        album1.addNewSong("Halil Ibrahim Sofrasi", 4);
        myAlbums.add(album1);

        Album album2 = new Album("Iman"," Hocaefendi");
        album2.addNewSong("Hey Gidi Gunler", 30);
        album2.addNewSong("Iman", 10);
        album2.addNewSong("Namaz", 5);
        myAlbums.add(album2);

        Album album3 = new Album("Rahman","Sudais");
        album3.addNewSong("Rahman", 9);
        album3.addNewSong("Bakara", 100);
        album3.addNewSong("Namaz", 5);
        myAlbums.add(album3);

        LinkedList<Song> playList = new LinkedList<Song>();
        myAlbums.get(0).addToPlayList("Aynali Kemer",playList);
        myAlbums.get(1).addToPlayList("Hey Gidi Gunler",playList);
        myAlbums.get(0).addToPlayList("Aglama Bebek",playList); // does not have
        myAlbums.get(0).addToPlayList(3,playList); // does not have
        myAlbums.get(1).addToPlayList(3,playList);
        myAlbums.get(2).addToPlayList(1,playList); // d
        play(playList);
    }
    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }

    private static void play(LinkedList<Song> playList) {
        boolean quit = false;
        boolean goingForward = true;
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.isEmpty()) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing" + listIterator.next().toString());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("PlayList complete");
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
                        System.out.println("Now playing" + listIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of the playlist");
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
                        System.out.println("Now playing" + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        goingForward=true;
                    }
                    break;
                case 3:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous());
                            goingForward=false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next());
                            goingForward=true;
                        } else {
                            System.out.println("We have reached end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious())
                            System.out.println("Now playing " + listIterator.next());
                    }
                    break;
                case 6:
                    printMenu() ;
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - to forward\n" +
                "2 - to backward\n" +
                "3 - to replay\n" +
                "4 - to list of song in playlist\n" +
                "5 - to remove curret song from the playlist\n" +
                "6 - to see available actions");
    }
}
