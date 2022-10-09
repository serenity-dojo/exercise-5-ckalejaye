package com.serenitydojo;

public class Hamster extends Pet{

      private String favouriteGame;

    public Hamster(String name, String favouriteGame) {
        super(name);
        this.favouriteGame = favouriteGame;
    }

    public String getFavouriteGame() {
        return favouriteGame;
    }

}
