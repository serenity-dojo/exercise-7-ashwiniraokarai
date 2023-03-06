package com.serenitydojo;

public abstract class Pet {
    String name;
    int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }
    //    Moved up from child classes
    public String getName() {
        return name;
    }

    //    Moved up from child classes
    public void setName(String name) {
        this.name = name;
    }

    //    Moved up from child classes
    public int getAge() {
        return age;
    }

    //    Moved up from child classes
    public void setAge(int age) {
        this.age = age;
    }

    public abstract String play();
}

