package model;

import controller.Task;

public class BasicTask implements Task {
    private double cost;
    public BasicTask() {
        System.out.println("Creating a basic Task");
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = 0;
    }
}
