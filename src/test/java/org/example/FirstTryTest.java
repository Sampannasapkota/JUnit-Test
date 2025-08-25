package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FirstTryTest {
    @Test
    void numberTest(){
        FirstTry obj1= new FirstTry();
        String result= obj1.number(5);
        Assertions.assertEquals("Sampanna Sapkota is java developer",result);
    }

    @Test
    void numberExtraTest(){
        FirstTry obj1= new FirstTry();
        String result= obj1.number(2);
        Assertions.assertEquals("Sorry!",result);
    }
    @Test
    void numberNegativeTest(){
        FirstTry obj1= new FirstTry();
        String result= obj1.number(-6);
        Assertions.assertEquals("Sorry!",result);
    }

}