package factory_pattern;

import factory_pattern.pizza.Pizza;
import factory_pattern.pizzaStore.ChicagoPizzaStore;
import factory_pattern.pizzaStore.NYPizzaStore;
import factory_pattern.pizzaStore.PizzaStore;

/**
 * @author yeobi Created 2020-03-12
 */
public class FactoryPatternTest {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyPizza = nyPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println(nyPizza);

        System.out.println();

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println(chicagoPizza);
    }

}
