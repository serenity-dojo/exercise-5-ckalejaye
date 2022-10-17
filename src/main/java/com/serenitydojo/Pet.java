package com.serenitydojo;

public class Pet {

    private String name;
    private String game;
    private int age;
    private String favoriteGame;


    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteGame(){
        return favoriteGame;
    }

    public int getAge(){
        return age;
    }
 //   public String play() {
 //       return game;
 //   }
}
