package edu.brown.cs.student.sorting.appendixSorting;

import static org.junit.Assert.assertEquals;

import edu.brown.cs.student.sorting.appendixSorting.comparators.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class SortByAgeTest {

  // In general you probably want more tests than this, some I can think of are
  // Checking error cases with integers (like how decimals, negatives, and large numbers are
  // handled)
  // Testing on a known solution is a good idea (our comparator vs a known working sorting algo)
  // You can also randomly generate test cases and test them with the method above to help find edge
  // cases
  // i.e. randomly generated 300 Person lists and seeing how they get sorted

  List<Person> people = new ArrayList<>();

  Person p1 = new Person("p1", 34);
  Person p2 = new Person("p2", 50);
  Person p3 = new Person("p3", 10);

  Person pEqualAge1 = new Person("DifferentName", 20);
  Person pEqualAge2 = new Person("AnotherDifferentName", 20);

  @Test
  public void basicFunctionality() {
    List<Person> unsorted = new ArrayList<>();
    unsorted.add(p1);
    unsorted.add(p2);
    unsorted.add(p3);

    List<Person> sorted = new ArrayList<>();
    sorted.add(p3);
    sorted.add(p1);
    sorted.add(p2);

    unsorted.sort(new SortByAge());

    assertEquals(unsorted, sorted);
  }

  @Test
  public void differentNameSameAgeTest() {

    List<Person> people = new ArrayList<>();
    people.add(p3);
    people.add(pEqualAge1);
    people.add(pEqualAge2);

    people.sort(new SortByAge());

    // because we overrided equals() in Person, this method will use our new one
    assertEquals(people.get(0), p3);
    assertEquals(people.get(1).getAge(), 20);
    assertEquals(people.get(2).getAge(), 20);
  }

  // Compare with default sort

  // Other ways to test that I'm not going to go over now but can be useful
  // Creating a Random Generator for your data type and testing that the output
  // of your code matches a known solution (i.e. in this case our comparator against a known sorting
  // algo)
  // its fine to copy/paste a known solution as long as you give it credit (Check with HTA)

}
