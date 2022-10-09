package com.serenitydojo;

public class Cat extends Pet{
    private String favoriteToy;
    private int age;

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
}
