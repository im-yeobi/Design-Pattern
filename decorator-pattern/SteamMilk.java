package decorator_pattern;

/**
 * @author yeobi Created 2020-03-09
 * 첨가물 - 스팀 밀크
 */
public class SteamMilk extends CondimentDecorator {

    private Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 스팀 밀크";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

}
