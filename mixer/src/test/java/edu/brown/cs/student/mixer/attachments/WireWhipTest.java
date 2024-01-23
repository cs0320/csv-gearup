package edu.brown.cs.student.mixer.attachments;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** Tests for the wire whip. */
public class WireWhipTest {

  @Before
  public void setup() {}

  @After
  public void tearDown() {}

  @Test
  public void test() {
    WireWhip wireWhip = new WireWhip();
    assertEquals("Whipping cream!", wireWhip.mix().whip());
  }
}
