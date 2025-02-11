package generics.mealplangenerator;

// Vegetarian Meal Plan
public class VegetarianMeal implements MealPlan {
    private String mainIngredient;

    public VegetarianMeal(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    @Override
    public String getMealDetails() {
        return "Vegetarian Meal - Main Ingredient: " + mainIngredient;
    }
}
