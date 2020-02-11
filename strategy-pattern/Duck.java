package strategy_pattern;

/**
 * @author yeobi Created 2020-02-11
 */
public abstract class Duck {

    public FlyBehavior flyBehavior;    // 나는 행동
    public QuackBehavior quackBehavior;    // 우는 행동

    public abstract void display(); // 모양
    public void swim() {    // 헤엄
        System.out.println("헤엄치기");
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

}
