package model;

import controller.Task;

public class BasicTask implements Task {
    private double cost;
    private String text;

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

    @Override
    public String getTaskText() {
        return this.text;
    }

    @Override
    public void setTaskText(String text) {
        this.text = text;
    }
}
