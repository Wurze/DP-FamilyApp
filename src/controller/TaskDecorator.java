package controller;

public class TaskDecorator implements Task {

    private Task task;
    private double cost;
    private String text;

    public TaskDecorator(Task task,String text) {
        this.task = task;
        this.text = text;
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
        return this.text;
    }

    @Override
    public void setTaskText(String text) {
    this.text = text;
    }
}
