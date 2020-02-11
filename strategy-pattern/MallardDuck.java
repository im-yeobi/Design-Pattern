package strategy_pattern;

/**
 * @author yeobi Created 2020-02-11
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("[청둥오리]");
    }

}
