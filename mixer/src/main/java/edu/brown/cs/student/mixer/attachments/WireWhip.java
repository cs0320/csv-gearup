package edu.brown.cs.student.mixer.attachments;

import edu.brown.cs.student.mixer.outputs.Cream;

/** Example of a generic attachment that produces cream (parameterized by the Cream object) */
public class WireWhip implements Attachment<Cream> {
  @Override
  public Cream mix() {
    return new Cream();
  }
}
