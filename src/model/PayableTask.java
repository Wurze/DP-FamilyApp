package model;

import controller.Task;
import controller.TaskDecorator;

public class PayableTask extends TaskDecorator {
    private double cost;
    private String text;
    public PayableTask(Task task) {
        super(task);
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
        super.setTaskText(text);
    }
}
