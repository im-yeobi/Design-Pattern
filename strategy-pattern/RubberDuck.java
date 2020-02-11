package strategy_pattern;

/**
 * @author yeobi Created 2020-02-11
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("[고무오리]");
    }

}
