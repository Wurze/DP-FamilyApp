package controller;

import java.util.HashSet;

public abstract class MemberAlgorithmBase {
    protected final HashSet<List> lists;

    public MemberAlgorithmBase() {
        this.lists = new HashSet<>();
    }

    public abstract void addList(List list);

    public abstract double calculateDueToPay();
}
