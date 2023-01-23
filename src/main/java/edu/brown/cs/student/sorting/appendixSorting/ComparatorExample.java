package edu.brown.cs.student.sorting.appendixSorting;

import edu.brown.cs.student.sorting.appendixSorting.comparators.SortByNameAToZ;
import java.util.ArrayList;
import java.util.List;

public class ComparatorExample {

  public ComparatorExample() {

    List<Person> people = new ArrayList<>();
    people.add(new Person("Dave", 20));
    people.add(new Person("Jeff", 30));
    people.add(new Person("David The Destroyer of Worlds", 900));
    people.add(new Person("That Dude", 18));
    people.add(new Person("Inconspicuous Person", 25));

    // How can we sort this list?
    // Do we sort by Name or Age, Ascending or Descending?
    // Go to SortByNameAToZ in the comparators package

    people.sort(new SortByNameAToZ());
    // How does this show/implement the Strategy Pattern?

    // Prints person objects
    for (Person person : people) {
      System.out.println(person);
    }
  }
}
