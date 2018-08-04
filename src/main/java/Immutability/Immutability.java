package Immutability;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Immutability {

    List<Integer> intList = new ArrayList<Integer>();

    public static int sum(List<Integer> intLIst) {
        int sum = 0;
        for (int i = 0; i < intLIst.size(); i++) {
            sum = sum + intLIst.get(i);
        }
        //return intList.stream().mapToInt(x->x).sum();
        return sum;
    }

    public static void calculateAbsoluteValues(List<Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
            //intList.set(i, Math.abs(intList.get(i)));
            if (intList.get(i) < 0) {
                intList.set(i, -intList.get(i));
            }
        }
    }

    public static int sumAbsoluteValues(List<Integer> intList) {
        calculateAbsoluteValues(intList);
        return sum(intList);
    }


}