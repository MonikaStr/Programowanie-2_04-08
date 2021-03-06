package Immutability;

import java.util.*;

public class Person {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

 /*   public void setName(String name) {
        this.name = name;
    }
*/
    public String getSurname() {
        return surname;
    }

/*    public void setSurname(String surname) {
        this.surname = surname;
    }*/

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    //Napisz funkcję, która przyjmuje listę obiektów typu Person i zwróci listę osób bez duplikatów.

    public static List<Person> listWithoutDuplicates(List<Person> listOfPeople) {
        List<Person> listOfPeople2 = new ArrayList<>();
        for (int i = 0; i < listOfPeople.size(); i++) {
            if (!listOfPeople2.contains(listOfPeople.get(i))) {
                listOfPeople2.add(listOfPeople.get(i));
            }
        }
        return listOfPeople2;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
