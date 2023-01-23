package edu.brown.cs.student.mixer;

import edu.brown.cs.student.mixer.attachments.DoughHook;
import edu.brown.cs.student.mixer.attachments.WireWhip;

/** Example for the Mixer strategy pattern exercise. */
public class MixerExample {

  /** Constructs the example. */
  public MixerExample() {
    Mixer mixer = new Mixer(new DoughHook());
    mixer.useAttachment();

    mixer.setAttachment(new WireWhip());
    mixer.useAttachment();

    /*
     * The important part of all of this is that interfaces allowed us to keep the same
     * Mixer class, and continually add new functionality in the form of new
     * Attachments without any changes to the class itself!
     *
     * During the sprints you will be making "Attachments" to already
     * existing classes in the Java ecosystem (Ex: Comparators)
     **/
  }
}
