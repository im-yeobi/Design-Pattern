package strategy_pattern;

/**
 * @author yeobi Created 2020-02-11
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("못 울어");
    }

}
