package edu.brown.cs.student.sorting.appendixSorting.comparators;

import edu.brown.cs.student.sorting.appendixSorting.Person;
import java.util.Comparator;

// TODO Student: This Still Sorts A to Z, how can we make it Sort Z to A?
public class SortByNameZToA implements Comparator<Person> {

  @Override
  public int compare(Person p1, Person p2) {
    String name1 = p1.getName();
    String name2 = p2.getName();

    // HINT: Look Here and think about what compareTo returns
    return name1.compareTo(name2);
  }
}
