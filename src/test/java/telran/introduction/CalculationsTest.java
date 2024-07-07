package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;

import static telran.introduction.Calculations.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculationsTest {
    PrintStream
    standartOut = System.out;
    ByteArrayOutputStream
    outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
    System.setOut(standartOut);
    }

    @Test
    void sumTest (){
        assertEquals(4, sum(2, 2));
        assertEquals(0, sum(0, 0));
        assertEquals(-2, sum(-6, 4));

    }
    @Test
    void multiplyTest (){
        assertEquals(40, multiply(20, 2));
        assertEquals(0, multiply(10, 0));
        assertEquals(0, multiply(0, 0));
        assertEquals(-4, multiply(-2, 2));
        assertEquals(4, multiply(-2, -2));

    }
    @Test
    void divideTest (){
        divide(2, 0);
        assertEquals("Dividing on zero", outputStreamCaptor.toString().trim());
        assertEquals(10, divide(20, 2));
        assertEquals(-10, divide(-20, 2));
    }
    @Test
    void substractTest (){
        assertEquals(0, substract(2, 2));
        assertEquals(-2, substract(0, 2));
        assertEquals(4, substract(6, 2));
    }
    @Test
    void maxDigitTest (){
        assertEquals(7, maxDigit(15674));
        assertEquals(9, maxDigit(-994615));
    }
    @Test
    void sumOfDigitsTest (){
        assertEquals(21, sumOfDigits(12684));
        assertEquals(32, sumOfDigits(-65984));
    }
    @Test
    void isDividedOnTest (){
        assertEquals(true, isDividedOn(10,5));
        assertEquals(true, isDividedOn(-10,5));
        assertEquals(false, isDividedOn(10,7));
        isDividedOn(10, 0);
        assertEquals("Dividing on zero", outputStreamCaptor.toString().trim());
    }
}
