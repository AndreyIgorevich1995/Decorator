package org.example;

public class BinOps {
    public String sum(String a, String b) {
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        return Integer.toBinaryString(x + y);
    }

    public String mult(String a, String b) {
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        return Integer.toBinaryString(x * y);
    }
}