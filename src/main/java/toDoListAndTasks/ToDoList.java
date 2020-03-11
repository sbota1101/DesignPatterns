package toDoListAndTasks;


import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private String name;
    private List<Task> tasks=new ArrayList<>();

    public ToDoList(String name, List<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public void add(Task task){
        tasks.add(task);
    }
    public void remove(Task task){
        tasks.add(task);
    }
    public void getFinishTask(){

    }
    public void print1(){
        System.out.println("Nume"+name);
        for(Task task:tasks){
            print(task,0);
        }
    }
    public void print(Task basetask,int level){
        for (int i = 0; i <level ; i++) {
            System.out.println(" ");
        }

    }
}
