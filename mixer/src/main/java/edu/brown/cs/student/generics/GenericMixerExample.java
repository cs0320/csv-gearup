package edu.brown.cs.student.generics;

import edu.brown.cs.student.generics.attachments.DoughHook;
import edu.brown.cs.student.generics.attachments.WireWhip;
import edu.brown.cs.student.generics.outputs.Cream;
import edu.brown.cs.student.generics.outputs.Dough;

public class GenericMixerExample {

  /**
   * Example that demonstrates generics and the strategy pattern working in conjunction. We inject
   * the generic mixer with an attachment parameterized by the output it produces.
   */
  public GenericMixerExample() {
    GenericMixer<Dough> doughMixer = new GenericMixer<>(new DoughHook());
    Dough dough = doughMixer.getMixture();
    dough.knead();

    GenericMixer<Cream> creamMixer = new GenericMixer<>(new WireWhip());
    Cream cream = creamMixer.getMixture();
    cream.whip();
  }
}
