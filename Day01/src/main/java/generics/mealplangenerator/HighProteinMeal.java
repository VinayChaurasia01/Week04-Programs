package generics.mealplangenerator;

// High Protein Meal Plan
public class HighProteinMeal implements MealPlan {
    private int proteinGrams;

    public HighProteinMeal(int proteinGrams) {
        this.proteinGrams = proteinGrams;
    }

    @Override
    public String getMealDetails() {
        return "🍗 High-Protein Meal - " + proteinGrams + "g protein";
    }
}
