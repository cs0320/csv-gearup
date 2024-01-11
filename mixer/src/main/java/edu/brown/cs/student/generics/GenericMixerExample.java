package edu.brown.cs.student.generics;

import edu.brown.cs.student.generics.attachments.DoughHook;
import edu.brown.cs.student.generics.attachments.WireWhip;
import edu.brown.cs.student.generics.outputs.Cream;
import edu.brown.cs.student.generics.outputs.Dough;

public class GenericMixerExample {

    public GenericMixerExample() {
        GenericMixer<Dough> doughMixer = new GenericMixer<>(new DoughHook());
        Dough dough = doughMixer.getMixedOutput();
        dough.knead();

        GenericMixer<Cream> creamMixer = new GenericMixer<>(new WireWhip());
        Cream cream = creamMixer.getMixedOutput();
        cream.whip();
    }
}
