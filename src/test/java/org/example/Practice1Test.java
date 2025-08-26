package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Practice1Test {
@Test
    public void Practice1OneTest() {
    Practice1 obj = new Practice1();

    int result = obj.divide(16, 2);
    int expectedResult = (8);
    assertEquals(expectedResult, result);

}

    @Test
    public void Practice1AnotherTest() {
        Practice1 obj = new Practice1();

        int result = obj.divide(100, 2);
        int expectedResult = (50);
        assertEquals(expectedResult, result);
    }

    @Test
    public void Practice1DecimalTest() {
        Practice1 obj = new Practice1();

        RuntimeException exception= assertThrows(RuntimeException.class ,()->{
            obj.divide(100,0);
        });
        assertEquals("Error!", exception.getMessage());
    }
}