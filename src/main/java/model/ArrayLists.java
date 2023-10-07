package model;

import java.util.ArrayList;

public class ArrayLists {
    private java.util.ArrayList<Integer> list1;
    private java.util.ArrayList<Integer> list2;

    public ArrayLists() {
        this.list1 = new ArrayList<>();
        this.list2 = new ArrayList<>();
    }

    public ArrayList<Integer> getList1() {
        return list1;
    }

    public ArrayList<Integer> getList2() {
        return list2;
    }

    public void addToList1(int number) {
        list1.add(number);
    }

    public void addToList2(int number) {
        list2.add(number);
    }


    public int avgList1() {

        if (list1 != null) {
            int temp = 0;
            for (Object number : list1) {
                temp += (int) number;
            }
            int avg1 = temp / list1.size();
            System.out.println("this is the average list1: " + avg1);
            return avg1;
        } else {
            System.out.println("List is null");
            return 0;
        }

    }

    public int avgList2() {

        if (list2 != null) {
            int temp1 = 0;
            for (Object nubmer1 : list2) {
                temp1 += (int) nubmer1;
            }
            int avg2 = temp1 / list2.size();
            System.out.println("this is the average list2: " + avg2);
            return avg2;
        } else {
            System.out.println("List is null");
            return 0;
        }

    }

    public int comparison(int avg1, int avg2) {
        if (avg1 != 0 && avg2 != 0) {
            if (avg1 > avg2) {
                System.out.println("Big avg list1: " + avg1 + ">" + avg2);
                return avg1;
            }
            if (avg2 > avg1) {
                System.out.println("Big avg list2: " + avg2 + ">" + avg1);
                return avg2;
            } else {
                System.out.println("The average is equal :" + avg1 + " = " + avg2);
                return avg1;
            }
        } else {
            System.out.println("list1 or List2 is null");
            return 0;
        }
    }

}
