package model;

import controller.Task;
import controller.TaskDecorator;

public class VolunteerTask extends TaskDecorator {

    public VolunteerTask(Task task) {
        super(task);
    }

    @Override
    public double rewardPoints() {
        return 5 + super.rewardPoints();
    }
}
