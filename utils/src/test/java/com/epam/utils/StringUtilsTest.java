package com.epam.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    @Test
    void TF(){
        Assertions.assertFalse(StringUtils.isPositiveNumber("-2"));
    }
}
