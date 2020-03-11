package compositePattern;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee1=new Employee("Mircea","PD",20000);
        Employee employee2=new Employee("Alex","PD",15000);
        Employee employee3=new Employee("Ana","PD",10000);
        Employee employee4=new Employee("Zoli","PD",500);
        employee1.add(employee2);
        employee1.add(employee3);
        employee3.add(employee4);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
