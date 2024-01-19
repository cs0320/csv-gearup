package edu.brown.cs.student.mixer;

import edu.brown.cs.student.mixer.attachments.DoughHook;
import edu.brown.cs.student.mixer.attachments.WireWhip;
import edu.brown.cs.student.mixer.outputs.Cream;
import edu.brown.cs.student.mixer.outputs.Dough;

public class MixerExample {

  /**
   * Example that demonstrates generics and the strategy pattern working in conjunction. We inject
   * the generic mixer with an attachment parameterized by the output it produces.
   */
  public MixerExample() {
    Mixer<Dough> doughMixer = new Mixer<>(new DoughHook());
    Dough dough = doughMixer.getMixture();
    System.out.println(dough.knead());

    Mixer<Cream> creamMixer = new Mixer<>(new WireWhip());
    Cream cream = creamMixer.getMixture();
    System.out.println(cream.whip());
  }
}
