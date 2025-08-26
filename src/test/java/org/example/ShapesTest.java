package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {
    @Test
    void ShapesTest(){
        Shapes obj = new Shapes();
        double result=obj.compute(5);
        assertEquals(25,result);

    }


    @Test
    void ShapesTest1(){
        Shapes obj = new Shapes();
        double result=obj.compute(4);
        assertEquals(16,result);

    }

}