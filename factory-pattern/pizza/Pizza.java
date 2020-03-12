package factory_pattern.pizza;

import factory_pattern.ingredient.Cheese;
import factory_pattern.ingredient.Clams;
import factory_pattern.ingredient.Dough;
import factory_pattern.ingredient.Sauce;

/**
 * @author yeobi Created 2020-03-12
 * Pizza 추상 클래스
 */
public abstract class Pizza {

    protected String name;
    public Dough dough;
    public Sauce sauce;
    public Cheese cheese;
    public Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String toString() {
        return name;
    }

}
