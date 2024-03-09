package org.example;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Example7 {

    public static void main(String[] args) {
        //MessageDigest.getInstance("XYZ");
        try {
            MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) { // this is a wrong implementation of the scenario,
                                              // where they have used checked exception cause, if we are foolish enough to
                                             // give an algorithm that does not exist we will get this exception
            throw new RuntimeException(e);
        }
    }
}