package edu.brown.cs.student.mixer.attachments;

public interface Attachment<T> {
  /**
   * Mixes.
   *
   * @return Object of parameterized type T, output of the mixture yielded by attachment
   */
  T mix();
}
