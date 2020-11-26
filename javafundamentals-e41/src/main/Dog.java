package main;

import java.util.Objects;

public class Dog implements Comparable<Dog> {

  private int age;

  public Dog(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dog cat = (Dog) o;
    return age == cat.age;
  }

  @Override
  public int hashCode() {
    return Objects.hash(age);
  }

  @Override
  public String toString() {
    return "Dog{" +
      "age=" + age +
      '}';
  }

  @Override
  public int compareTo(Dog o) {
    return this.getAge() - o.getAge();
  }
}
