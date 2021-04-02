package model;

import controller.Task;
import controller.TaskDecorator;

public class FreeTask extends TaskDecorator {
    public FreeTask(Task task) {
        super(task);
    }

    @Override
    public double rewardPoints() {
        return super.rewardPoints();
    }
}
