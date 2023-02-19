package com.epam.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class UtilsTest {
    @Test
    void testFunction(){
        boolean result = Utils.isAllPositiveNumbers(Arrays.asList("-1", "2"));
        Assertions.assertFalse(result);
    }
}
