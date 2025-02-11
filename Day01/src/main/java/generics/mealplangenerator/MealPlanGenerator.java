package generics.mealplangenerator;

// Main Class to Generate Meal Plans
public class MealPlanGenerator {
    public static void main(String[] args) {
        // Creating Meal Planner
        MealPlanner mealPlanner = new MealPlanner();

        // Creating Different Meals
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal("Broccoli"));
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal(true));
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal(70));
        Meal<HighProteinMeal> proteinMeal = new Meal<>(new HighProteinMeal(40));

        // Adding Meals to Planner
        mealPlanner.addMeal(vegMeal);
        mealPlanner.addMeal(veganMeal);
        mealPlanner.addMeal(ketoMeal);
        mealPlanner.addMeal(proteinMeal);

        // Displaying Meal Plan
        mealPlanner.displayMeals();
    }
}
