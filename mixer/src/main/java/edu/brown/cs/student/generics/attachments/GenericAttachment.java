package edu.brown.cs.student.generics.attachments;

public interface GenericAttachment<T> {
  /**
   * Mixes.
   *
   * @return Object of parameterized type T, output of the mixture yielded by attachment
   */
  T mix();
}
