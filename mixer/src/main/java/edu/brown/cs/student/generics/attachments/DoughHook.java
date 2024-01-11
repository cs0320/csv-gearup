package edu.brown.cs.student.generics.attachments;

import edu.brown.cs.student.generics.outputs.Dough;

public class DoughHook implements GenericAttachment<Dough> {
    @Override
    public Dough mix() {
        return new Dough();
    }
}
