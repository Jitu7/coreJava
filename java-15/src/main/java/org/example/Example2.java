package org.example;

public class Example2 {

    /*
    Until Java 15 we cannot declare local interfaces, enums, records
     */
    public void m() {

        interface C {

        }

        enum E {

        }

        record R() {

        }
    }
}
