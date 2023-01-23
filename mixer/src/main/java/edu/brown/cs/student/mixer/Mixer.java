package edu.brown.cs.student.mixer;

import edu.brown.cs.student.mixer.attachments.Attachment;

/** A Mixer mixes. */
public class Mixer {
  private Attachment attachment;

  /** Constructor for a Mixer without an Attachment. */
  public Mixer() {}

  /**
   * Constructor for a Mixer with an Attachment.
   *
   * @param a attachment to use
   */
  public Mixer(Attachment a) {
    this.attachment = a;
  }

  /**
   * Gets the Mixer's current Attachment.
   *
   * @return Returns the Mixer's current Attachment
   */
  public Attachment getAttachment() {
    return attachment;
  }

  /**
   * Sets the Mixer's current Attachment.
   *
   * @param a new Attachment to use
   */
  public void setAttachment(Attachment a) {
    this.attachment = a;
  }

  /** Runs the mix() command for the given attachment. */
  public void useAttachment() {
    if (attachment != null) {
      System.out.println(attachment.mix());
    } else {
      System.out.println("Please give the Mixer an Attachment first");
    }
  }
}
