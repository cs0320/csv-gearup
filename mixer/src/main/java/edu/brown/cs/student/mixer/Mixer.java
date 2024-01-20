package edu.brown.cs.student.mixer;

import edu.brown.cs.student.mixer.attachments.Attachment;

/**
 * Class that mixes an output of a parameterized type T using an attachment that produces objects of
 * type T
 *
 * @param <T> The output mixture of the mixer
 */
public class Mixer<T> {

  Attachment<T> attachment;

  /**
   * Constructor for mixer.
   *
   * @param attachment an attachment (parameterized by T) that produces objects of type T
   */
  public Mixer(Attachment<T> attachment) {
    this.attachment = attachment;
  }

  /**
   * @return the output mixture that the attachment produces upon mixing (type T)
   */
  public T getMixture() {
    return this.attachment.mix();
  }
}
