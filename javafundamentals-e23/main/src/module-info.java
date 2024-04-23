import hello.HelloWorld;

module main {

//    requires static hello;
    requires hello;

    requires static example; // use static keyword to avoid validation of this module on module path by JVM
    // at starting of the application
    // might be we use this module somehow by reflection, so it might be missing at start of application

    uses HelloWorld; // we would like to use the implementations of the HW interface

}