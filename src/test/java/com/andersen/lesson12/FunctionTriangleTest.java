package com.andersen.lesson12;

import lesson12.FunctionTriangle;
import static org.junit.jupiter.api.Assertions.*;



class FunctionTriangleTest {


    @org.junit.jupiter.api.Test
    void rez() {
        FunctionTriangle functionTriangle = new FunctionTriangle();
        double actual = functionTriangle.rez();
        double expected = 26.832815729997478;
        assertEquals(actual, expected, 100);
    }
}