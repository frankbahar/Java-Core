package com.frankbahar;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();

    public static void main(String[] args) throws  IOException {

//        //        try(FileWriter locFile = new FileWriter("locations.txt");
//        //           FileWriter dirFile = new FileWriter("directions.txt")){
//        try (BufferedWriter bufferedFileWriter = new BufferedWriter(new FileWriter("locations.txt"));
//             BufferedWriter bufferedDirWriter = new BufferedWriter(new FileWriter("directions.txt"))) {
//            for (Location location : locations.values()) {
//               // locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
//                 bufferedFileWriter.write(location.getLocationID() + "," + location.getDescription() + "\n");
//                for (String direction : location.getExits().keySet()) {
//                    if (!direction.equalsIgnoreCase("Q")) {
//                        //   dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) + "\n");
//                        bufferedDirWriter.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) + "\n");
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
////        FileWriter locFile = null;
////        try {
////            locFile = new FileWriter("locations.txt");
////            for (Location location : locations.values()) {
////                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
////            }
////        } finally {
////            System.out.println("in finally block");
////            if (locFile != null) {
////               System.out.println("Attempting to close locfile");
////                locFile.close();
////            }
////        }
//        }
//
//        try (DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))) {
//            for(Location location : locations.values()){
//                locFile.writeInt(location.getLocationID());
//                locFile.writeUTF(location.getDescription());
//                System.out.println("Writing location " + location.getLocationID() + " : " + location.getDescription());
//                System.out.println("Writing " + (location.getExits().size()-1) + " exits.");
//                locFile.writeInt(location.getExits().size()-1);
//                for(String direction : location.getExits().keySet()){
//                    if(!direction.equalsIgnoreCase("Q")){
//                        System.out.println("\t\t" + direction + "," + location.getExits().get(direction));
//                        locFile.writeUTF(direction);
//                        locFile.writeInt(location.getExits().get(direction));
//                    }
//                }
//            }
//        }
        try (ObjectOutputStream locFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))) {
            for(Location location : locations.values()){
                locFile.writeObject(location);

            }
        }
    }

    // 1. The First four byte will contain the number of locations (bytes 0-3)
    // 2. The next four bytes will contain the start offset of the locations section (bytes 4-7)
    // 3. the next section of the file will contain the index (the index is 1692 bytes long. it will start  at byte 8 and end at byte 1699
    // 4. the final section of the file will contain the location records (the data). it will start at byte 1700
    static {
        try(ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))){
            boolean eof= false;
            while (!eof){
                try {
                    Location location = (Location) locFile.readObject();
                    System.out.println("Read location " + location.getLocationID() + " : " + location.getDescription());
                    System.out.println("Found " + location.getExits().size() + " exits" );
                    locations.put(location.getLocationID(),location);
                } catch (EOFException e) {
                    eof = true;
                }
            }

//            while (!eof){
//                try {
//                    Map<String, Integer> exits = new LinkedHashMap<>();
//                    int locID = locFile.readInt();
//                    String description = locFile.readUTF();
//                    int numExits = locFile.readInt();
//                    System.out.println("Read location " + locID + " : " + description);
//                    System.out.println("Found " + numExits + " exits" );
//                    for(int i=0;i<numExits; i++){
//                        String direction = locFile.readUTF();
//                        int destination = locFile.readInt();
//                        exits.put(direction,destination);
//                        System.out.println("\t\t" + direction + "," + destination);
//                    }
//                    locations.put(locID,new Location(locID,description,exits));
//                } catch (EOFException e){
//                    eof = true;
//                }
//            }
        } catch(InvalidClassException e) {
            System.out.println("InvalidClassException " + e.getMessage());
        } catch (IOException io) {
            System.out.println("IO Exception " + io.getMessage());
        } catch(ClassNotFoundException e) {
            System.out.println("ClassNotFoundException " + e.getMessage());
        }

//          try ( Scanner scanner = new Scanner(new BufferedReader(new FileReader("locations_big.txt")))){
//      //          Scanner scanner = new Scanner(fileReader)){
//              scanner.useDelimiter(",")
//
//    //      try ( FileReader fileReader = new FileReader("locations_big.txt");
//      //          Scanner scanner = new Scanner(fileReader)){
//              ;
//   //       try {
//     //         scanner = new Scanner(new FileReader("locations_big.txt"));
//  //            String input;
//   //           while ((input = bufferedReader.readLine()) != null) {
//              while (scanner.hasNextLine()){
////                  String [] data = input.split(",");
////                  int loc = Integer.parseInt(data[0]);
////                  String description = data[1];
//
//
//
//                  int loc = scanner.nextInt();
//                  scanner.skip(scanner.delimiter());
//                  String description = scanner.nextLine();
//                  System.out.println("Importer loc: " + loc + ": " +  description);
//                  Map<String, Integer> tempExit = new HashMap<String, Integer>();
//                  locations.put(loc, new Location(loc,description,tempExit));
//              }
//
//          } catch (IOException e) {
//              e.printStackTrace();
////          } finally {
////              if (scanner != null)
////                  scanner.close();
//          }
//
//          // Now read the exits
//        try (FileReader fileReader = new FileReader("directions_big.txt");
//             BufferedReader bufferedReader = new BufferedReader(fileReader)){
//         //    Scanner scanner = new Scanner(bufferedReader)) {
//
////        try {
////            scanner = new Scanner(new BufferedReader(new FileReader("directions_big.txt")));
//        //    scanner.useDelimiter(",");
//              String input;
//              while ((input = bufferedReader.readLine()) != null) {
//   //         while (scanner.hasNextLine()) {
//////                int loc = scanner.nextInt();
//////                scanner.skip(scanner.delimiter());
////                String direction = scanner.next();
////                scanner.skip(scanner.delimiter());
////                String dest = scanner.nextLine();
////                int destination = Integer.parseInt(dest);
//           //     String input = scanner.nextLine();
//                String [] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String direction = data[1];
//                int destination = Integer.parseInt(data[2]);
//                System.out.println(loc + ": " + direction + ": " + destination);
//
//                Location location = locations.get(loc);
//                location.addExit(direction, destination);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
////        } finally {
////            if (scanner!= null)
////                scanner.close();
//        }
////        Map<String, Integer> tempExit = new HashMap<String, Integer>();
////        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));
////
////        tempExit = new HashMap<String, Integer>();
////        tempExit.put("W", 2);
////        tempExit.put("E", 3);
////        tempExit.put("S", 4);
////        tempExit.put("N", 5);
////        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));
////
////        tempExit = new HashMap<String, Integer>();
////        tempExit.put("N", 5);
////        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));
////
////        tempExit = new HashMap<String, Integer>();
////        tempExit.put("W", 1);
////        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));
////
////        tempExit = new HashMap<String, Integer>();
////        tempExit.put("N", 1);
////        tempExit.put("W", 2);
////        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));
////
////        tempExit = new HashMap<String, Integer>();
////        tempExit.put("S", 1);
////        tempExit.put("W", 2);
////        locations.put(5, new Location(5, "You are in the forest",tempExit));
////
    }
    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
