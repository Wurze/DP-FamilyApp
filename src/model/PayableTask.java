package model;

import controller.Task;
import controller.TaskDecorator;

public class PayableTask extends TaskDecorator {
    private double cost;
    public PayableTask(Task task) {
        super(task);
    }

    @Override
    public double getCost() {
        System.out.println("You have to pay this amount to finish the task");
        return cost + super.getCost();
    }

    @Override
    public void setCost(double cost){
        this.cost = cost;
    }
}
