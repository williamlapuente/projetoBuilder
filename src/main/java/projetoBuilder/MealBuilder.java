package projetoBuilder;

public class MealBuilder {
    public Meal prepereVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurguer());
        meal.addItem(new Coke());
        meal.addItem(new AguaComGas());
        return meal;
    }
    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurguer());
        meal.addItem(new Pepsi());
        meal.addItem(new HamburguerCarne());
        meal.addItem(new HamburguerMisto());
        return meal;
    }
}
