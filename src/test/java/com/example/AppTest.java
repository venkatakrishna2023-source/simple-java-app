package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAdd() {
        App obj = new App();
        assertEquals(8, obj.add(5, 3));
    }
}