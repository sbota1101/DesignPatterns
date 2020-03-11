package strategyPattern;

public class StrategyMain {
    public static void main(String[] args) {
        Context context=new Context(new OperationAdd());
        System.out.println(context.executeOpertaion(10,10));
        Context context2=new Context(new OperationSub());
        System.out.println(context2.executeOpertaion(10,10));
        Context context3=new Context(new OperationMultiply());
        System.out.println(context3.executeOpertaion(10,10));
    }
}
