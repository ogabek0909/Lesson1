package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise3Test {
    @Test
    public void testMultiply() {
        Exercise3 ex = new Exercise3();
        assertEquals(12, ex.multiply(3, 4));
    }
}
