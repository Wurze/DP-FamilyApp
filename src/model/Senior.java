package model;
import controller.List;
import controller.MemberAlgorithmBase;

public class Senior extends MemberAlgorithmBase {
    @Override
    public void addList(List list) {
        this.lists.add(list);
    }

    @Override
    public double calculateDueToPay() {
        return 0;
    }


}