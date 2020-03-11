package toDoListAndTasks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
    private List<Task>subtask=new ArrayList<>();
    private String description;
    private String titlu;
    private boolean isFinished=false;
    private Date finishDate;
    public Task(List<Task> subtask, String description, String titlu) {
        this.subtask = subtask;
        this.description = description;
        this.titlu = titlu;
    }
    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        if(isFinished) {
            finishDate=new Date();
        }
        else {
            finishDate = null;
        }
        isFinished = finished;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        if(finishDate!=null)
            isFinished=true;
        else
            isFinished=false;

        this.finishDate = finishDate;

    }



    public void add(Task task){
        subtask.add(task);
    }
    public void remove(Task task){
        subtask.add(task);
    }
}
