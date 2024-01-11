package edu.brown.cs.student.generics.attachments;

import edu.brown.cs.student.generics.outputs.Cream;

public class WireWhip implements GenericAttachment<Cream> {
    @Override
    public Cream mix() {
        return new Cream();
    }
}
