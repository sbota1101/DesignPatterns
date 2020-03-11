package openClosePrinciple;

public class MainSingleton {
    public static void main(String[] args) {
        MySingleton s1=MySingleton.createInstance();
        MySingleton s2=MySingleton.createInstance();
        MySingleton s3=MySingleton.createInstance();
        MySingleton s4=MySingleton.createInstance();
    }
}
