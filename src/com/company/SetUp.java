package com.company;

import java.util.ArrayList;

public class SetUp {

    public ArrayList<BoardGame> settingUpArrayList() {

        ArrayList<BoardGame> boardGames = new ArrayList<>();

        BoardGame carcassone = new BoardGame(80,2,6,"Carcassone", 8);
        BoardGame talisman = new BoardGame(120,3,6,"Talisman", 6);
        BoardGame crows = new BoardGame(25,2,8,"Crows", 7);
        BoardGame dreams = new BoardGame(35,4,8,"Dreams", 5);
        BoardGame thorn = new BoardGame(45,4,6,"Thorns", 9);
        BoardGame wind = new BoardGame(50,3,5,"North Wind", 7);

        boardGames.add(thorn);
        boardGames.add(wind);
        boardGames.add(dreams);
        boardGames.add(crows);
        boardGames.add(talisman);
        boardGames.add(carcassone);

        return boardGames;
    }

}
