package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testSum() {
        int result = App.sum(2, 3);
        assertEquals(5, result, "2 + 3 = 5");
    }
}