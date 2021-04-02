package controller;

import java.util.HashSet;

public class Member {
    public MemberAlgorithmBase algorithmBase;


    public void showDueToPay(List list, double multiplier)
    {
        System.out.println((algorithmBase.calculateDueToPay(list,multiplier)));
    }
}
