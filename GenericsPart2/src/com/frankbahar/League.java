package com.frankbahar;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team>{
    public String name;
    private ArrayList<T> members = new ArrayList<>();
    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team){
        if (members.contains(team)){
            System.out.println(team.getName() + " is already on this league");
            return false;
        } else {
            members.add(team);
            System.out.println(team.getName() + " added to " + this.name + " league");
            return true;
        }
    }

    public int numTeams(){
        return this.members.size();
    }

    public int compareTo(Team team) {
        if (this.members.contains(team))
            return 1;
        else
            return 0;
    }

    public void printTeams(){
        Collections.sort(members);
		for(Team currentTeam : members){
            System.out.println(currentTeam.getName()+ ": " + currentTeam.ranking());
        }
    }
}
