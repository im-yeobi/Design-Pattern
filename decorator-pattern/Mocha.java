package decorator_pattern;

/**
 * @author yeobi Created 2020-03-09
 * 첨가물 - 모카
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

}
