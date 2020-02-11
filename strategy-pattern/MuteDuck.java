package strategy_pattern;

/**
 * @author yeobi Created 2020-02-11
 */
public class MuteDuck extends Duck {

    public MuteDuck() {
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("[말없는 오리]");
    }

}
