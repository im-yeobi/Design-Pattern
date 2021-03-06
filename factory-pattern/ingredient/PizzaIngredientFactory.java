package factory_pattern.ingredient;

/**
 * @author yeobi Created 2020-03-12
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClams();

}
