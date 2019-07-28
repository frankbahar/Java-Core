package com.frankbahar;

import java.util.ArrayList;

public class GroceryList {
    private int [] mynumbers = new int [50];
    private ArrayList<String> groceryList = new ArrayList<String>();
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have "+ groceryList.size() + " items in your grocery list");
        for(int i=0;i < groceryList.size();i++)
            System.out.println((i+1)+" . " + groceryList.get(i));
    }
    private void modifyGroceryitem(int position, String item){
        groceryList.set(position,item);
        System.out.println("Grocery item " + (position+1) + "has been modified");
    }
    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }
    private int findItem(String searchItem){
    //    boolean exist = groceryList.contains(searchItem);
    //    int position = groceryList.indexOf(searchItem);
      //  if (position>=0)
        //    return groceryList.get(position);
      //  return null;
        return  groceryList.indexOf(searchItem);
    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0)
            return true;
        return false;
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position =  findItem(currentItem);
        if (position >= 0) {
            modifyGroceryitem(position,newItem);
        }
    }
    public void removeGroceryItem(String item){
        int position =  findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }
}
