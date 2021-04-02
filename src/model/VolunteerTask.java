package model;

import controller.Task;
import controller.TaskDecorator;

public class VolunteerTask extends TaskDecorator {
    private double cost;
    private String text;
    public VolunteerTask(Task task,String text) {
        super(task,text);
        this.text = text;
    }

    @Override
    public double getCost() {
        return cost + super.getCost();
    }

    @Override
    public void setCost(double cost){
        this.cost = cost;
    }

    @Override
    public String getTaskText() {
        return super.getTaskText();
    }

    @Override
    public void setTaskText(String text) {
        this.text = text;
    }
}
