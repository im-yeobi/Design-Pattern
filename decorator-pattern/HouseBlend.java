package decorator_pattern;

/**
 * @author yeobi Created 2020-03-09
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
