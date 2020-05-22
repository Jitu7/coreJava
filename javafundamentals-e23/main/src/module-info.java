import hello.HelloWorld;

module main {

//    requires static hello;
    requires static hello;


    requires example;

    uses HelloWorld; // we would like to use the implementations of the HW interface

}