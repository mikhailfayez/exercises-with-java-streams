package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        SetUp setUp = new SetUp();
        ArrayList<BoardGame> boardGames = setUp.settingUpArrayList();

        System.out.println("games that cost less than 60$:");
        boardGames.stream()
                .filter(boardGame -> boardGame.getPrice() < 60)
                .sorted(Comparator.comparing(BoardGame::getPrice))
                .map(boardGame -> boardGame.getTitle() + " costs " + boardGame.getPrice() + "$")
                .forEach(System.out::println);

        System.out.println();
        System.out.println("games for less than 4 people:");
        boardGames.stream()
                .filter(boardGame -> boardGame.getMinNumberOfPlayers() < 4)
                .sorted(Comparator.comparing(BoardGame::getMinNumberOfPlayers))
                .map(boardGame -> boardGame.getTitle() + " (min. players: " + boardGame.getMinNumberOfPlayers() +")")
                .forEach(System.out::println);

        System.out.println();
        System.out.println("games for 6 people, that cost more than 50$:");
        boardGames.stream()
                .filter(boardGame -> boardGame.getMaxNumberOfPlayers() >= 6 && boardGame.getPrice() > 50)
                .sorted(Comparator.comparing(BoardGame::getTitle))
                .map(boardGame -> boardGame.getTitle() + ", which costs " + boardGame.getPrice() + "$")
                .forEach(System.out::println);

        System.out.println();
        System.out.println("cheapest game for 3 players:");
        boardGames.stream()
                .filter(boardGame -> boardGame.getMinNumberOfPlayers() < 4)
                .min(Comparator.comparing(BoardGame::getPrice))
                .map(boardGame -> boardGame.getTitle() + ", which costs " + boardGame.getPrice() + "$")
                .ifPresent(System.out::println);

        System.out.println();
        System.out.print("sum of prices of all games: ");
        boardGames.stream()
                .map(BoardGame::getPrice)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        System.out.println();
        System.out.println("list of available games in store: ");
        boardGames.stream()
                .sorted(Comparator.comparing(BoardGame::getTitle))
                .map(BoardGame::getTitle)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("3 cheapest games with at least 7 point score: ");
        boardGames.stream()
                .filter(boardGame -> boardGame.getScore() > 6)
                .sorted(Comparator.comparing(BoardGame::getPrice))
                .map(boardGame -> boardGame.getTitle() + ", which costs "
                                + boardGame.getPrice() + "$, and have "
                                + boardGame.getScore() + " point score")
                .limit(3).forEach(System.out::println);

    }
}
