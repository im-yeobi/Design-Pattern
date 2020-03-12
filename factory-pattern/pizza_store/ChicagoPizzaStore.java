package factory_pattern.pizzaStore;

import factory_pattern.PizzaType;
import factory_pattern.ingredient.ChicagoPizzaIngredientFactory;
import factory_pattern.ingredient.PizzaIngredientFactory;
import factory_pattern.pizza.ChicagoStyleCheesePizza;
import factory_pattern.pizza.ChicagoStylePepperoniPizza;
import factory_pattern.pizza.Pizza;

/**
 * @author yeobi Created 2020-03-12
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type) {
            case CHEESE:
                pizza = new ChicagoStyleCheesePizza(ingredientFactory);
                break;
            case PEPPERONI:
                pizza = new ChicagoStylePepperoniPizza(ingredientFactory);
                break;
        }

        return pizza;
    }

}
