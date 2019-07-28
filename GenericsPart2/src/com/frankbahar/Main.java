package com.frankbahar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
		FootballPlayer joe = new FootballPlayer("Joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckhan = new SoccerPlayer("Beckham");

		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		adelaideCrows.addPlayer(joe);
		// adelaideCrows.addPlayer(pat);
		// adelaideCrows.addPlayer(beckhan);

		System.out.println(adelaideCrows.numPlayers());

		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
		baseballTeam.addPlayer(pat);

		Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
		brokenTeam.addPlayer(beckhan);

		Team<FootballPlayer> melbourne = new Team<>("Melbourne");
		FootballPlayer banks = new FootballPlayer("Gordon");
		melbourne.addPlayer(banks);

		Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
		Team<FootballPlayer> fremantle = new Team<>("Fremantle");

		hawthorn.matchResult(fremantle, 1, 0);
		hawthorn.matchResult(adelaideCrows, 3, 8);

		adelaideCrows.matchResult(fremantle, 2, 1);
		//	adelaideCrows.matchResult(baseballTeam,1,1);

		System.out.println("Rankings");
		System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
		System.out.println(melbourne.getName() + ": " + melbourne.ranking());
		System.out.println(fremantle.getName() + ": " + fremantle.ranking());
		System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

		System.out.println(adelaideCrows.compareTo(melbourne));
		System.out.println(adelaideCrows.compareTo(hawthorn));
		System.out.println(fremantle.compareTo(hawthorn));
		System.out.println(fremantle.compareTo(melbourne));
		League<Team<FootballPlayer>> superLeague = new League<>("Super League");
		superLeague.addTeam(adelaideCrows);
		//superLeague.addTeam(baseballTeam);
		superLeague.addTeam(melbourne);
		superLeague.addTeam(fremantle);
		superLeague.addTeam(hawthorn);
		superLeague.addTeam(hawthorn);
		superLeague.printTeams();
	}
}
