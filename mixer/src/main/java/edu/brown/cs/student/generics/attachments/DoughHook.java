package edu.brown.cs.student.generics.attachments;

import edu.brown.cs.student.generics.outputs.Dough;

/** Example of a generic attachment that produces dough (parameterized by the Dough object) */
public class DoughHook implements GenericAttachment<Dough> {
  @Override
  public Dough mix() {
    return new Dough();
  }
}
