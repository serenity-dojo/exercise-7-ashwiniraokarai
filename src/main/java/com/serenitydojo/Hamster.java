package com.serenitydojo;

public class Hamster extends Pet {
    private String favoriteToy;
    private String favoriteGame;

    public Hamster(String name,  int age, String favoriteToy){
        super(name, age);
//        this.name = name;
        this.favoriteToy = favoriteToy;
//        this.age = age;
    }
    public String play(){
        return "runs in wheel";
    }

}
