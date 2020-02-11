package strategy_pattern;

/**
 * @author yeobi Created 2020-02-11
 */
public class StrategyPatternTest {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.fly();
        mallardDuck.quack();
        System.out.println();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.fly();
        rubberDuck.quack();
        System.out.println();

        Duck muteDuck = new MuteDuck();
        muteDuck.display();
        muteDuck.swim();
        muteDuck.fly();
        muteDuck.quack();
    }

}
