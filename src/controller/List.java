package controller;

import java.util.HashSet;

public abstract class List {
    protected final HashSet<Task> tasks;

     protected List() {
        this.tasks = new HashSet<>();
    }

    abstract public void addTask(Task task);
    public abstract double getTaskCost();
}
