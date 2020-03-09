package decorator_pattern;

/**
 * @author yeobi Created 2020-03-09
 */
public class DecoratorPatternTest {

    public static void main(String[] args) {
        // 데코레이터 추가하지 않은 에스프레소
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 데코레이터 추가한 다크 로스트 커피
        Beverage beverage2 = new DarkRoast();
        // 데코레이터
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        // 데코레이터 추가한 하우스 블렌드 커피
        Beverage beverage3 = new HouseBlend();
        // 데코레이터
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }

}
