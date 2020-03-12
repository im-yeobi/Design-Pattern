package factory_pattern.pizzaStore;

import factory_pattern.PizzaType;
import factory_pattern.ingredient.NYPizzaIngredientFactory;
import factory_pattern.ingredient.PizzaIngredientFactory;
import factory_pattern.pizza.NYStyleCheesePizza;
import factory_pattern.pizza.NYStylePepperoniPizza;
import factory_pattern.pizza.Pizza;

/**
 * @author yeobi Created 2020-03-12
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case CHEESE:
                pizza = new NYStyleCheesePizza(ingredientFactory);
                break;
            case PEPPERONI:
                pizza = new NYStylePepperoniPizza(ingredientFactory);
                break;
        }

        return pizza;
    }

}
