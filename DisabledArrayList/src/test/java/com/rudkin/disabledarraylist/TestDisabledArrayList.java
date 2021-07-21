package test.java.com.rudkin.disabledarraylist;

import main.java.com.rudkin.disabledarraylist.DisabledArrayList;

public class TestDisabledArrayList {
    public static void main(String[] args) {
        DisabledArrayList<Integer> intList = new DisabledArrayList<>();

        intList.add(10);
        intList.add(15);
intList.remove(0);

        System.out.println(intList);
    }
}
