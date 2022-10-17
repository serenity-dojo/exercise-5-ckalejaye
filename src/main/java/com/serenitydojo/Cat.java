package com.serenitydojo;

public class Cat extends Pet{
    private String favoriteToy;
    private int age;

    public static final String CAT_NOISE = "Meow";
    public static final String CAT_GAME = "String";

    public Cat(String name, String favoriteToy, int age) {
        super(name);
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String makeNoise() {
        return CAT_NOISE;
    }

    public String play() {
        return CAT_GAME;
    }
}
