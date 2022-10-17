package com.serenitydojo;

public class Hamster extends Pet{

      private String favoriteGame;
      private int age;

    public static final String HAMSTER_NOISE = "Squeak";

    public static final String HAMSTER_GAME = "Wheel";

    public Hamster(String name, String favouriteGame, int age) {
        super(name);
        this.favoriteGame = favouriteGame;
        this.age = age;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public int getAge(){
        return age;
    }

    public String makeNoise(){
        return HAMSTER_NOISE;
    }

    public String play() {
        return HAMSTER_GAME;
    }
}
