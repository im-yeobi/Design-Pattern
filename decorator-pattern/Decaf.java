package decorator_pattern;

/**
 * @author yeobi Created 2020-03-09
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "디카페인";
    }

    @Override
    public double cost() {
        return 1.05;
    }

}
