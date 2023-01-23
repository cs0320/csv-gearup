package edu.brown.cs.student.sorting.appendixSorting;

import static org.junit.Assert.assertEquals;

import edu.brown.cs.student.sorting.appendixSorting.Person;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import edu.brown.cs.student.sorting.appendixSorting.comparators.*;

public class SortByNameTest {

  Person p1 = new Person("p1", 34);
  Person p2 = new Person("p2", 50);
  Person p3 = new Person("p3", 10);

  Person pEqualAge1 = new Person("DifferentName", 20);
  Person pEqualAge2 = new Person("AnotherDifferentName", 20);

  @Test
  public void sortsAToZ() {
    List<Person> unsorted = new ArrayList<>();
    unsorted.add(p1);
    unsorted.add(p3);
    unsorted.add(p2);

    List<Person> sorted = new ArrayList<>();
    sorted.add(p1);
    sorted.add(p2);
    sorted.add(p3);

    unsorted.sort(new SortByNameAToZ());

    assertEquals(unsorted, sorted);
  }

  @Test
  public void sortsZToA() {
    List<Person> unsorted = new ArrayList<>();
    unsorted.add(p1);
    unsorted.add(p3);
    unsorted.add(p2);

    List<Person> sorted = new ArrayList<>();
    sorted.add(p3);
    sorted.add(p2);
    sorted.add(p1);

    unsorted.sort(new SortByNameAToZ());

    assertEquals(unsorted, sorted);
  }

  @Test
  public void differentNameSameAgeTest() {

    List<Person> people = new ArrayList<>();
    people.add(p1);
    people.add(pEqualAge1);
    people.add(pEqualAge2);

    people.sort(new SortByNameAToZ());

    assertEquals(people.get(0), pEqualAge2);
    assertEquals(people.get(1), pEqualAge1);
    assertEquals(people.get(2), p1);
  }
}
