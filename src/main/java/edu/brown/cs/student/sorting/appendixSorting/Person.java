package edu.brown.cs.student.sorting.appendixSorting;

public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return name + " : " + age;
  }

  // This was written so we can use equals for our junit tests
  // By Overriding it makes it so that internal java functions that use equals
  // will use this instead (similiar to toString())
  // https://stackoverflow.com/questions/28880263/whats-the-correct-way-to-override-equal-method-in-java
  @Override
  public boolean equals(Object ob) {
    if (!(ob instanceof Person)) {
      return false;
    }

    // During the class avoid casting, but this is the well accepted solution to this problem
    Person p = (Person) ob;
    boolean equalAge = p.getAge() == this.getAge();
    boolean equalName = p.getName().equals(this.getName());

    return equalAge && equalName;
  }
}
