package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String departament;
    private int salary;
    private List<Employee> subordinates=new ArrayList<>();

    public Employee(String name, String departament, int salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void add(Employee employee){
        subordinates.add(employee);
    }
    public void remove(Employee employee){
        subordinates.remove(employee);
    }
    public List<Employee> setSubordinates(){
        return subordinates;
    }
    public List<Employee> getSubordinates(){
        return subordinates;
    }
    @Override
    public String toString(){
      /*  String sum=name+" : ";
        for (Employee emp:subordinates){
          sum=sum+emp.getName()+",";
            if(!emp.getSubordinates().isEmpty()){
                sum=sum+"("+emp.toString()+")";
            }
        }
        return sum;*/
      StringBuilder sb=new StringBuilder();
      sb.append(name+":" ).append(":");
        for (Employee emp:subordinates){
            sb.append(emp.getName()).append(",");
        }
        return sb.toString();
    }
}
