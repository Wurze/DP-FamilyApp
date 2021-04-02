package model;

import controller.List;
import controller.Task;

public class PrivateList extends List {
    @Override
    public void addTask(Task task) {
        this.tasks.add(task);
    }
}
