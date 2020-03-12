package factory_pattern.pizza;

import factory_pattern.ingredient.PizzaIngredientFactory;

/**
 * @author yeobi Created 2020-03-12
 */
public class NYStyleCheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        super.name = "New York Style Cheese Pizza";
    }

    @Override
    public void prepare() {
        super.dough = ingredientFactory.createDough();
        super.sauce = ingredientFactory.createSauce();
        super.cheese = ingredientFactory.createCheese();
        super.clam = ingredientFactory.createClams();
    }

}
