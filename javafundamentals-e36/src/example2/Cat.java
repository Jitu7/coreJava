package example2;

import java.util.Objects;

/*
Comparable --> Natural Ordering
 */
public class Cat implements Comparable<Cat> {

    private int age;

    public Cat(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Cat o) {
        // < 0 if this < o
        // 0 if this == o
        // > 0 if this > o
        /*if (this.age < o.age) {
            return -1;
        } else if (this.age > o.age) {
            return 1;
        }
        return 0;*/

        return this.age - o.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
