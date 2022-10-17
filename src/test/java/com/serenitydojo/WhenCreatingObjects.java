package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido","Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void creating_a_cat(){
        Cat kitty = new Cat("kitty", "Laser Light", 4);
        Assert.assertEquals(kitty.getName(), "kitty");
        Assert.assertEquals(kitty.getFavoriteToy(),"Laser Light");
        Assert.assertEquals(kitty.getAge(), 4);
    }
    @Test
    public void creating_a_hamster () {
        Hamster hazel = new Hamster("Hazel", "Wheel", 1);
        Assert.assertEquals(hazel.getName(), "Hazel");
        Assert.assertEquals(hazel.getFavoriteGame(), "Wheel");
        Assert.assertEquals(hazel.getAge(), 1);
    }

    @Test
    public void cat_makeNoise( ){
        Cat kitty = new Cat("Kitty", "String", 4);

        String catSound = "";
        catSound = kitty.makeNoise();

        Assert.assertEquals(catSound, "Meow");

//        System.out.println("Cat goes " + spot.makeNoise());

    }
    @Test
    public void whenADogBarks() {
        Dog fido = new Dog("Fido","Bone", 5);

        String dogSound = "";
        // TODO: implement a method in the Dog sound called makeNoise() that returns the sound a dog makes: "Woof", e.g.
        dogSound = fido.makeNoise();

        Assert.assertEquals(dogSound, "Woof");
    }

    @Test
    public void hamster_makeNoise(){
        Hamster hazel = new Hamster("Hazel", "Wheel", 1);
        String  hamsterSound = "";
        hamsterSound = hazel.makeNoise();

//        System.out.println(" Hamster goes " + hazel.makeNoise());

    }

    @Test
    public void whenADogGetsFed() {
        Dog fido = new Dog("Fido","Bone", 5);

        // TODO: implement a method in the Dog sound called feed() that sets the isFed variable to true:
         fido.feed();

        Assert.assertTrue(fido.isFed());

    }

    @Test
    public void whenAnimalsPlay() {
// TODO: Uncomment me
//
          Pet fido = new Dog("Fido","Bone", 5);
          Pet kitty = new Cat("Kitty","String", 4);
          Pet hazel = new Hamster("Hazel", "Wheel", 1);


//        assertThat(fido.play(), equalTo("Play with Bone"));
//        assertThat(kitty.play(), equalTo("Play with String"));
//        assertThat(hazel.play(), equalTo("Play with Wheel"));
    }

    @Test
    public void dog_play(){
        Dog fido = new Dog("Fido", "Bone", 5);
        String dogGame = "";
        dogGame = fido.play();

    }

    @Test
    public void cat_play() {
        Cat kitty = new Cat("Kitty", "String", 4);
        String catGame = "";
        catGame = kitty.play();
    }

    @Test
    public void hamster_play() {
        Hamster hazel = new Hamster("Hazel", "Wheel", 1);
        String hamsterGame = "";
        hamsterGame = hazel.play();
    }
}
