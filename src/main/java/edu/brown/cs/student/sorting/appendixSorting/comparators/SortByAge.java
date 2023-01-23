package edu.brown.cs.student.sorting.appendixSorting.comparators;

import edu.brown.cs.student.sorting.appendixSorting.Person;
import java.util.Comparator;

public class SortByAge implements Comparator<Person> {
  @Override
  public int compare(Person p1, Person p2) {

    int age1 = p1.getAge();
    int age2 = p2.getAge();

    return Integer.compare(age1, age2);
  }
}
