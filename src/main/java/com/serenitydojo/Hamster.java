package com.serenitydojo;

public class Hamster extends Pet{

      private String favouriteGame;
      private int age;

    public static final String HAMSTER_NOISE = "Squeak";

    public static final String HAMSTER_GAME = "Wheel";

    public Hamster(String name, String favouriteGame, int age) {
        super(name);
        this.favouriteGame = favouriteGame;
        this.age = age;
    }

    public String getFavouriteGame() {
        return favouriteGame;
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
