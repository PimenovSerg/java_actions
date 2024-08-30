package dev.pimenov.ci;

import java.nio.file.Path;

public class Math {
    public int addSum(int a, int b) {
        if (a < 0) {
            throw new RuntimeException("a must be > 0");
        }
        if (b < 0) {
            throw new RuntimeException("b must be > 0");
        }
        if ((long) a + (long) b > Integer.MAX_VALUE) {
            throw new RuntimeException("overloading");
        }
        return a + b;
    }
}
