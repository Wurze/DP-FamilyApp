package controller;

public class TaskDecorator implements Task {

    private Task task;

    public TaskDecorator(Task task) {
        this.task = task;
    }

    @Override
    public double rewardPoints() {
        return this.task.rewardPoints();
    }
}
