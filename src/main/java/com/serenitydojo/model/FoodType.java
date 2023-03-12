package com.serenitydojo.model;

public enum FoodType {
    TUNA("Tuna"), CABBAGE("Cabbage"), LETTUCE("Lettuce"), SALMON("Salmon"), DOG_FOOD("Dog Food"), DELUXE_DOG_FOOD("Deluxe Dog Food"), UNKNOWN("Unknown");

    public final String label;

    //"Constructor" that lets you access the label of the enum item
    //Not currently used in the consuming code (Feeder.java) but can be used if you wanted they String version of the enum
    private FoodType(String label){
        this.label = label;
    }
}
