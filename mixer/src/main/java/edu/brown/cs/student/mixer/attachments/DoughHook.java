package edu.brown.cs.student.mixer.attachments;

import edu.brown.cs.student.mixer.outputs.Dough;

/** Example of a generic attachment that produces dough (parameterized by the Dough object) */
public class DoughHook implements Attachment<Dough> {
  @Override
  public Dough mix() {
    return new Dough();
  }
}
