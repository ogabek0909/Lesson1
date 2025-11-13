package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercise4Test {
    @Test
    public void testDivide() {
        Exercise4 ex = new Exercise4();
        assertEquals(2, ex.divide(10, 5));
        assertThrows(IllegalArgumentException.class, () -> ex.divide(10, 0));
    }
}
