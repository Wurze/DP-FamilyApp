package model;

import controller.Task;
import controller.TaskDecorator;

public class FreeTask extends TaskDecorator {
    private String text;
    public FreeTask(Task task,String text) {
        super(task,text);
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public String getTaskText() {
        return super.getTaskText();
    }

    @Override
    public void setTaskText(String text) {
        this.text = text;
    }
}
