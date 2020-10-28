package strategypattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        // 实例化对象的位置再调用处
        Context context = new Context(new OpreationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
