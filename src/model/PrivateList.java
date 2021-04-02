package model;

import controller.List;
import controller.Task;

public class PrivateList extends List {
    @Override
    public void addTask(Task task) {
        this.tasks.add(task);
    }

    @Override
    public double getTaskCost() {
        double cost = 0;
        for(Task task: this.tasks)
        {
            cost = task.getCost();
        }
        return cost;
    }
}
