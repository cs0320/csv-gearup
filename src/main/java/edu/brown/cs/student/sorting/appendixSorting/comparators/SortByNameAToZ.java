package edu.brown.cs.student.sorting.appendixSorting.comparators;

import edu.brown.cs.student.sorting.appendixSorting.Person;
import java.util.Comparator;

public class SortByNameAToZ implements Comparator<Person> {
  // The <Object> here defines what type is being compared

  // return -1 if p1 is less than p2, 0 if they're equal, and 1 if p2 > p1
  // Integer.compare(x, y) returns the same as  above but for Integers specifically
  // You can also do Double.compare(x,y), and compareTo for Strings
  @Override
  public int compare(Person p1, Person p2) {
    String name1 = p1.getName();
    String name2 = p2.getName();

    return name1.compareTo(name2);
  }
}
