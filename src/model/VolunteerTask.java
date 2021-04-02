package model;

import controller.Task;
import controller.TaskDecorator;

public class VolunteerTask extends TaskDecorator {
    private double cost;
    public VolunteerTask(Task task) {
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
}
