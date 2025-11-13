package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercise5Test {
    @Test
    public void testModulo() {
        Exercise5 ex = new Exercise5();
        assertEquals(1, ex.modulo(10, 3));
        assertThrows(IllegalArgumentException.class, () -> ex.modulo(10, 0));
    }
}
