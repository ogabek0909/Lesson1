package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise2Test {
    @Test
    public void testSubtract() {
        Exercise2 ex = new Exercise2();
        assertEquals(4, ex.subtract(10, 6));
    }
}
