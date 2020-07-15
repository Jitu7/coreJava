package example3;

import java.util.Comparator;
import java.util.TreeSet;

/*
In case of Set we should always override hashcode() n equals()
 */
public class Example3 {

    public static void main(String[] args) {
        /*
        Comparable<Dog>  ->  int compareTo(Dog d)
        Comparator<Dog>  ->  int compare(Dog d1, Dog d2)
         */

        Comparator<Dog> c1 = (o1, o2) -> o1.getAge() - o2.getAge();
        Comparator<Dog> c2 = (o1, o2) -> o1.getName().compareTo(o2.getName());

        var set1 = new TreeSet<>(c1); // TreeSet --> Black Red Tree
        set1.add(new Dog("A", 4));
        set1.add(new Dog("B", 1));
        set1.add(new Dog("C", 6));
        set1.add(new Dog("D", 2));

        set1.forEach(System.out::println);

        System.out.println("**********************");
        System.out.println("******COMPARATOR******");
        System.out.println("**********************");

        var set2 = new TreeSet<>(c2); // TreeSet --> Black Red Tree
        set2.add(new Dog("A", 4));
        set2.add(new Dog("B", 1));
        set2.add(new Dog("C", 6));
        set2.add(new Dog("D", 2));

        set2.forEach(System.out::println);
    }

}
