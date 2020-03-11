package callByValueExample;

public class Main {
    public static void main(String[] args) {
        int a=2;//a ref si are val 2
        System.out.println(a);
        //ultima data e tot 2 nu 10 pt ca a iara e 2
        doSomething(a);
        System.out.println(a);


        Person person=new Person("Pablo");
        System.out.println(person.getName());
        doSomething(person);
        //tot Sorina apare pt ca cu get si set e reasignat la aceiasi val si din aia pare tot Sorina
        System.out.println(person.getName());
        Person a1=new Person("b");
        Person b1=a1;
        b1.setName("pablo");
        System.out.println(a1.getName());
    }
    public static void doSomething(int a){
        a=10;
        System.out.println("doSomething"+" "+a);
    }
    public  static void doSomething(Person p){
        p.setName("Sorina");
        System.out.println(p.getName());
    }
}
