package org.example;

public class RE implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new Exception("E");
    }
}