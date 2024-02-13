package main;
/*
    IS-A relationship happens when we have inheritance
    HAS-A relationship happens when we have an aggregation or composition
 */
public class Circle extends Shape { // is-A

//    Cat cat; // has-A
    /*
    -   add new fields
    -   add new behaviour
    -   change fields -> hiding fields (avoid in real case scenario)
    -   change behaviour -> overriding
     */
    int radius;
    String area; // area from shape is hidden... we can still access using super but inside the class.

    void abc() {

    }
}
