package decorator_pattern;

/**
 * @author yeobi Created 2020-03-09
 */
public abstract class Beverage {

    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
