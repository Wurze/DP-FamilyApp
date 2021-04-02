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


        Task freeTask = new FreeTask(basicTask,"Take the garbage out");
        System.out.println(freeTask.getTaskText());

        Task payableTask = new PayableTask(basicTask,"Buy this Ikea furniture");
        payableTask.setCost(11);
        System.out.println(payableTask.getTaskText());

        Task volunteerTask = new VolunteerTask(basicTask,"help mother clean the basement");
        volunteerTask.setCost(5);
        System.out.println(volunteerTask.getTaskText());



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
