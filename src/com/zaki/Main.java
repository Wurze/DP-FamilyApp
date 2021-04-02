package com.zaki;

import controller.Task;
import model.BasicTask;
import model.FreeTask;
import model.PublicList;

public class Main {
    public static void main(String[] args) {



        Task basicTask = new BasicTask();
        System.out.println("The basic task provides " + basicTask.getCost());


        Task freeTask = new FreeTask(basicTask);
        System.out.println(freeTask.getCost());

        PublicList publicList = new PublicList();

        publicList.addTask(freeTask);

    }
}
