package edu.brown.cs.student.main;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

/** Tests for Java's sort. FOR DEMOING. */
public class SortDemoTest {
  public void testNotInOrder() {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(31);
    numbers.add(50);
    numbers.add(5);
    List<Integer> expected = List.of(5, 31, 50);
    Collections.sort(numbers);
    assertEquals(numbers, expected);
  }

  @Test
  public void testAlphabet() {
    List<String> letters = new ArrayList<>();
    letters.add("l");
    letters.add("m");
    letters.add("b");
    List<String> expected = List.of("b", "l", "m");
    Collections.sort(letters);
    assertEquals(letters, expected);
  }
}
