package com.company;

public class BoardGame {

    private int price, minNumberOfPlayers, maxNumberOfPlayers, score;
    private String title;

    public BoardGame(int price, int minNumberOfPlayers, int maxNumberOfPlayers, String title, int score) throws IllegalArgumentException {
        if (price <= 0) throw new IllegalArgumentException("price can't be lower than 0$");
        if (minNumberOfPlayers <=0) throw new IllegalArgumentException("min number of players can't be lower than 0");
        if (maxNumberOfPlayers < minNumberOfPlayers) throw new IllegalArgumentException("min number of players can't be greater than max");
        if (0 > score || score > 10 ) throw new IllegalArgumentException("score must be in range <0,10>");

        this.price = price;
        this.minNumberOfPlayers = minNumberOfPlayers;
        this.maxNumberOfPlayers = maxNumberOfPlayers;
        this.title = title;
        this.score = score;
    }

    @Override
    public String toString() {
        return "BoardGame {" +
                "price=" + price +
                ", minNumberOfPlayers=" + minNumberOfPlayers +
                ", maxNumberOfPlayers=" + maxNumberOfPlayers +
                ", score=" + score +
                ", title='" + title + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMinNumberOfPlayers() {
        return minNumberOfPlayers;
    }

    public void setMinNumberOfPlayers(int minNumberOfPlayers) {
        this.minNumberOfPlayers = minNumberOfPlayers;
    }

    public int getMaxNumberOfPlayers() {
        return maxNumberOfPlayers;
    }

    public void setMaxNumberOfPlayers(int maxNumberOfPlayers) {
        this.maxNumberOfPlayers = maxNumberOfPlayers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
