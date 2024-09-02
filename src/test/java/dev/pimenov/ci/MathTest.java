package dev.pimenov.ci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {
    private Math math;

    @BeforeEach
    void setMath() {
        math = new Math();
    }

    @Test
    void addSum() {
        assertThrows(RuntimeException.class, () -> math.addSum(1, -3));
    }

    @Test
    void assertEqualsThanExceptTrueActual() {
        int excepted = 10;
        int actual = math.addSum(4, 6);
        assertEquals(excepted, actual);
    }

    @Test
    void  minus(){
        int ex = 10;
        int ac = math.minusTwoDigits(12,3);
        assertEquals(ex,ac);
    }



}