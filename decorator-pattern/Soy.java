package decorator_pattern;

/**
 * @author yeobi Created 2020-03-09
 *
 * 첨가물 - 두유
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

}
