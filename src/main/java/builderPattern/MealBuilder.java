package builderPattern;

public class MealBuilder {
    public Meal createVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Water());
        return meal;
    }
    public Meal createNonVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Beer());
        return meal;
    }
}
