package edu.brown.cs.student.main;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

/** Tests for Java's sort. Example of what you could write for demo. */
public class SortTest {
  @Test
  public void testAlreadySorted() {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    List<Integer> expected = List.of(1, 2, 3);
    Collections.sort(list);
    assertEquals(list, expected);
  }

  @Test
  public void testReversedInput() {
    List<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(2);
    list.add(1);
    List<Integer> expected = List.of(1, 2, 3);
    Collections.sort(list);
    assertEquals(list, expected);
  }

  @Test
  public void testEmptyList() {
    List<Integer> list = new ArrayList<>();
    Collections.sort(list);
    List<Integer> expected = new ArrayList<>();
    assertEquals(list, expected);
  }

  @Test
  public void testSameNumbers() {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(3);
    List<Integer> expected = List.of(1, 2, 2, 3);
    Collections.sort(list);
    assertEquals(list, expected);
  }

  @Test
  public void testStrings() {
    List<String> list = new ArrayList<>();
    list.add("z");
    list.add("a");
    list.add("l");
    List<String> expected = List.of("a", "l", "z");
    Collections.sort(list);
    assertEquals(list, expected);
  }
}
