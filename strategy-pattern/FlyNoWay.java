package strategy_pattern;

/**
 * @author yeobi Created 2020-02-11
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("못 날아");
    }

}
