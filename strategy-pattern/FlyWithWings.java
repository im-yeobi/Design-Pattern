package strategy_pattern;

/**
 * @author yeobi Created 2020-02-11
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("하늘을 날다");
    }

}
