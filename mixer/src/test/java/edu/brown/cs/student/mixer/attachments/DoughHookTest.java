package edu.brown.cs.student.mixer.attachments;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** Tests for the dough hook. */
public class DoughHookTest {

  @Before
  public void setup() {}

  @After
  public void tearDown() {}

  @Test
  public void test() {
    DoughHook doughHook = new DoughHook();
    assertEquals("Kneading dough!", doughHook.mix().knead());
  }
}
