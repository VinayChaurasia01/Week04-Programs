package generics.mealplangenerator;

// Keto Meal Plan
public class KetoMeal implements MealPlan {
    private int fatPercentage;

    public KetoMeal(int fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    @Override
    public String getMealDetails() {
        return " Keto Meal - Fat: " + fatPercentage + "%";
    }
}
