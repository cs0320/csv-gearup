package edu.brown.cs.student.generics;

import edu.brown.cs.student.generics.attachments.GenericAttachment;

public class GenericMixer<T> {

    GenericAttachment<T> attachment;

    public GenericMixer(GenericAttachment<T> attachment) {
        this.attachment = attachment;
    }

    public T getMixedOutput() {
        return this.attachment.mix();
    }

}
