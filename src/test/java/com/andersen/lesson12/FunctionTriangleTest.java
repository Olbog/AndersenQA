package com.andersen.lesson12;

import lesson12.FunctionTriangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionTriangleTest {

    @Test
    public void rez() {
        FunctionTriangle functionTriangle = new FunctionTriangle();
        double actual = functionTriangle.rez();
        double expected = 26.832815729997478;
        assertEquals(actual, expected, 100);

    }
}