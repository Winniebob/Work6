package presenter;

import model.ArrayLists;
import view.View;

public class Presenter {
    private ArrayLists arrayLists;
    private View view;

    public Presenter(ArrayLists arrayLists, View view) {
        this.view = view;
        this.arrayLists = arrayLists;
    }



    public void processLists() {
        view.addNumbers(arrayLists.getList1());
        view.addNumbers(arrayLists.getList2());

        int avg1 = arrayLists.avgList1();
        int avg2 = arrayLists.avgList2();
        if (avg1 != 0 && avg2 != 0) {
            arrayLists.comparison(avg1, avg2);
        } else {
            System.out.println("Avg is 0!");
        }
    }
}
