package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;

import static telran.introduction.Calculations.*;

import org.junit.jupiter.api.Test;

public class CalculationsTest {
    @Test
    void sumTest (){
        assertEquals(4, sum(2, 2));
    }
    @Test
    void multiplyTest (){
        assertEquals(4, multiply(2, 2));
    }
    @Test
    void divideTest (){
        assertEquals(1, divide(2, 2));
    }
    @Test
    void substractTest (){
        assertEquals(0, substract(2, 2));
    }
    @Test
    void maxDigitTest (){
        assertEquals(7, maxDigit(15674));
    }
    @Test
    void sumOfDigitsTest (){
        assertEquals(21, sumOfDigits(12684));
    }
    @Test
    void isDividedOnTest (){
        assertEquals(true, isDividedOn(10,5));
    }
}
