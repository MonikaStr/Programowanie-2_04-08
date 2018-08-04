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
        return sum;
    }

    public static void calculateAbsoluteValues(List<Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
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
/*
3.	Napisz funkcję (wykorzystując powyższe), która sumuje wartości bezwzględne z listy integerów.
4.	Stwórz listę z liczbami całkowitymi. Następnie wywołaj funkcję liczącą sumę wartości bezwzględnych, a potem funkcję liczącą sumę. Co się stało?
5.	Podczas wywołania funkcji liczącej sumę wartości bezwzględnych podaj do niej swoją listę, ale zapakuj ją w metodę Collections.unmodifiableList . Czyli np. zamiast absoluteSum(list), będziemy mieli absoluteSum(Collections.unmodifiableList(list)) . Co się wtedy dzieje?

 */