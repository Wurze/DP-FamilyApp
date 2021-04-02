package model;

import controller.List;
import controller.Task;

public class PublicList extends List {


    @Override
    public void addTask(Task task)
        {
            this.tasks.add(task);
        }

}
