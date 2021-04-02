package controller;

public class TaskDecorator implements Task {

    private Task task;
    private double cost;
    private String text;

    public TaskDecorator(Task task) {
        this.task = task;
    }

    @Override
    public double getCost() {
        return this.task.getCost();
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String getTaskText() {
        return null;
    }

    @Override
    public void setTaskText(String text) {

    }
}
