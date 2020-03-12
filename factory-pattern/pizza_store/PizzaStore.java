package factory_pattern.pizzaStore;

import factory_pattern.PizzaType;
import factory_pattern.pizza.Pizza;

/**
 * @author yeobi Created 2020-03-12
 * PizzaStore 추상 클래스
 */
public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = this.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // 팩토리 메소드
    // 피자 인스턴스 생성을 팩토리 메소드를 직접 구현한 서브 클래스에서 관리한다.
    protected abstract Pizza createPizza(PizzaType type);

}
