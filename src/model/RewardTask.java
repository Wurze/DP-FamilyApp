package model;

import controller.Task;
import controller.TaskDecorator;

public class RewardTask extends TaskDecorator {
    public RewardTask(Task task) {
        super(task);
    }

    @Override
    public double rewardPoints() {
        return 10;
    }
}
