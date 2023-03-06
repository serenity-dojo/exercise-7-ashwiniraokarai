package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {
            return (isPremium) ? FoodType.SALMON.label : FoodType.TUNA.label;
        } else if (animal.equals("Dog")) {
            return FoodType.DOG_FOOD.label;
        }

        return FoodType.CABBAGE.label;
    }
}
