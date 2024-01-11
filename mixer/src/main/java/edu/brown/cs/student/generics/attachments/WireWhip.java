package edu.brown.cs.student.generics.attachments;

import edu.brown.cs.student.generics.outputs.Cream;

/**
 * Example of a generic attachment that produces cream (parameterized by the Cream object)
 */
public class WireWhip implements GenericAttachment<Cream> {
    @Override
    public Cream mix() {
        return new Cream();
    }
}
