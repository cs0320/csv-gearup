package edu.brown.cs.student.generics;

import edu.brown.cs.student.generics.attachments.GenericAttachment;

/**
 * Class that mixes an output of a parameterized type T using an
 * attachment that produces objects of type T
 *
 * @param <T> The output mixture of the mixer
 */
public class GenericMixer<T> {

    GenericAttachment<T> attachment;

    /**
     * Constructor for mixer.
     * @param attachment an attachment (parameterized by T) that produces objects of type T
     */
    public GenericMixer(GenericAttachment<T> attachment) {
        this.attachment = attachment;
    }

    /**
     *
     * @return the output mixture that the attachment produces upon mixing (type T)
     */
    public T getMixedOutput() {
        return this.attachment.mix();
    }

}
