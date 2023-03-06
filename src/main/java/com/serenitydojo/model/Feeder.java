package com.serenitydojo.model;

public class Feeder {
    public FoodType feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {
            return (isPremium) ? FoodType.SALMON : FoodType.TUNA;
        } else if (animal.equals("Dog")) {
            return FoodType.DOG_FOOD;
        }
        return FoodType.CABBAGE;
    }
}
