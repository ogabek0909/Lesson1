package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise1Test {
    @Test
    public void testAdd() {
        Exercise1 ex = new Exercise1();
        assertEquals(5, ex.add(2, 3));
    }
}
