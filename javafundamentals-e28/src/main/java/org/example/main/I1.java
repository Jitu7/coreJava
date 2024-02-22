package org.example.main;


import org.example.exceptions.MyRuntimeException;

public interface I1 {

    void m() throws MyRuntimeException;
    // sometimes you throw runtime exception for document purposes
}