package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class BinOpsTest {
    BinOps binOps = new BinOps();
    @org.junit.jupiter.api.Test
    void sum() {
        String expect = "101";
        String result = binOps.sum("11", "10");
        Assertions.assertEquals(expect, result);
    }

    @org.junit.jupiter.api.Test
    void mult() {
        String expect = "110";
        String result = binOps.mult("11", "10");
        Assertions.assertEquals(expect, result);
    }
}