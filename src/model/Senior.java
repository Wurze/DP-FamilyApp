package model;
import controller.List;
import controller.MemberAlgorithmBase;

public class Senior extends MemberAlgorithmBase {
    @Override
    public void addList(List list) {
        this.lists.add(list);
    }

    @Override
    public double calculateDueToPay(List list, double multiplier) {
        double dueToPay = 0;
        multiplier = 1;
        for(List lists: this.lists)
        {
            dueToPay = list.getTaskCost() * multiplier;
        }
        return dueToPay;
    }


}
