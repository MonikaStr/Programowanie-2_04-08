package Immutability;

import java.util.*;

public class RunnerImmutability {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(-5);
        intList.add(-4);
        intList.add(-3);

        System.out.println(Immutability.sum(intList));

        Immutability.calculateAbsoluteValues(intList);
        System.out.println(intList);

        System.out.println(Immutability.sumAbsoluteValues(intList));

        System.out.println(Immutability.sumAbsoluteValues(Collections.unmodifiableList(intList)));

        //////////////////////////////////////////////////////////////

        Person p1 = new Person("Jan", "Kowalski");

        Set<Person> setWithPeople = new HashSet<>();
        setWithPeople.add(new Person("Kinga", "Zalewska"));
        setWithPeople.add(new Person("Zygmunt", "Barski"));
        setWithPeople.add(new Person("Jagoda", "Żonkil"));
        setWithPeople.add(new Person("Wiesław", "Czesiński"));
        setWithPeople.add(new Person("Kinga", "Zalewska"));
        setWithPeople.add(p1);
        p1.setSurname("Nowak");

        System.out.println("Czy na liście jest Kinga Zalewska? " + setWithPeople.contains(new Person("Kinga", "Zalewska")));
        System.out.println("Czy na liście jest p1? " + setWithPeople.contains(p1));
        System.out.println("Czy na liście jest Jan Kowalski? " + setWithPeople.contains(new Person("Jan", "Kowalski")));
        System.out.println("Czy na liście jest Jan Nowak? " + setWithPeople.contains(new Person("Jan", "Nowak")));

    }
}
