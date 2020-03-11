package strategyPattern;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public int executeOpertaion(int a,int b){
        return strategy.doOperation(a,b);
    }
}
