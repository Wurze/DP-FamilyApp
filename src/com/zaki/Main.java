package com.zaki;

import controller.Task;
import model.*;

public class Main {
    public static void main(String[] args) {

        Senior senior = new Senior();
        Adult adult = new Adult();
        Teen teen = new Teen();
        GradeSchooler gradeSchooler = new GradeSchooler();

        Task basicTask = new BasicTask();
        System.out.println("The basic task provides " + basicTask.getCost());


        Task freeTask = new FreeTask(basicTask);
        freeTask.setTaskText("Take the garbage out");

        Task payableTask = new PayableTask(basicTask);
        payableTask.setCost(11);
        payableTask.setTaskText("Buy this ikea furniture");

        Task volunteerTask = new VolunteerTask(basicTask);
        volunteerTask.setCost(5);
        volunteerTask.setTaskText("Volunteer to help mother clean basement");

        System.out.println(freeTask.getCost());

        PublicList publicList = new PublicList();

        publicList.addTask(freeTask);
        publicList.addTask(payableTask);
        publicList.addTask(volunteerTask);

        adult.addList(publicList);
        senior.addList(publicList);
        gradeSchooler.addList(publicList);
        teen.addList(publicList);

        System.out.println("The amount due for the senior member is " + senior.calculateDueToPay(publicList));

    }
}
