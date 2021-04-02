package model;

import controller.Task;

public class BasicTask implements Task {

    public BasicTask() {
        System.out.println("Creating a basic Task");
    }

    @Override
    public double rewardPoints() {
        return 1;
    }
}
