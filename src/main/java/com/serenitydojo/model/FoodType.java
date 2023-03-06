package com.serenitydojo.model;

public enum FoodType {
    TUNA("Tuna"), CABBAGE("Cabbage"), LETTUCE("Lettuce"), SALMON("Salmon"), DOG_FOOD("Dog Food"), DELUXE_DOG_FOOD("Deluxe Dog Food"), UNKNOWN("Unknown");

    public final String label;

    private FoodType(String label){
        this.label = label;
    }
}
