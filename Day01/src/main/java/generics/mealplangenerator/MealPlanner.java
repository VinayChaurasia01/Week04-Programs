package generics.mealplangenerator;

import java.util.ArrayList;
import java.util.List;

// Meal Planner Class (Manages Meal Plans)
public class MealPlanner {
    private List<Meal<? extends MealPlan>> mealPlans = new ArrayList<>();

    // Add a Meal to the Planner
    public void addMeal(Meal<? extends MealPlan> meal) {
        if (validateMeal(meal)) {
            mealPlans.add(meal);
            System.out.println(" Meal Added: " + meal);
        } else {
            System.out.println(" Invalid Meal Plan: " + meal);
        }
    }

    // Validate Meal (Ensures Non-Null Meal)
    public <T extends MealPlan> boolean validateMeal(Meal<T> meal) {
        return meal != null && meal.getMealType() != null;
    }

    // Display All Meals in the Planner
    public void displayMeals() {
        System.out.println("\n Meal Plan List:");
        for (Meal<? extends MealPlan> meal : mealPlans) {
            System.out.println( meal);
        }
    }
}
