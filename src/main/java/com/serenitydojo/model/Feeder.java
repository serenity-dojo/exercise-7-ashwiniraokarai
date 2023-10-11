package com.serenitydojo.model;

public class Feeder {
    public FoodType feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {
            return (isPremium) ? FoodType.SALMON : FoodType.TUNA;
        } else if (animal.equals("Dog")) {
            return (isPremium) ? FoodType.DELUXE_DOG_FOOD : FoodType.DOG_FOOD;
        } else if (animal.equals("hamster")) {
            return (isPremium) ? FoodType.LETTUCE : FoodType.CABBAGE;
        } else
        return FoodType.CABBAGE;
    }

//    Use this code block instead if you wanted to return a String converted version of the enum
//       public String feeds(String animal, boolean isPremium) {
//        if (animal.equals("Cat")) {
//            return (isPremium) ? FoodType.SALMON.label : FoodType.TUNA.label;
//        } else if (animal.equals("Dog")) {
//            return FoodType.DOG_FOOD.label;
//        }
//
//        return FoodType.CABBAGE.label;
//    }
}
