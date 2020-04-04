package kg;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {
    @Test
    public void checkTriangleArea(){
        int h = 5;
        int base = 10;
        int result = Problem2.getTriangleArea(h, base);
        assertEquals(25, result);
    }
    @Test
    public void checkTriangleAreaHeightNegative(){
        int h = -5;
        int base = 10;
        int result = Problem2.getTriangleArea(h, base);
        assertEquals(0, result);
    }
    @Test
    public void checkCircleArea(){
        int r = 5;
        double result = Problem2.getCircleArea(r);
        assertEquals(78.53981633974483, result,0.001 );
    }

    @Test
    public void checkIsPrime1(){
        boolean result = Problem2.isPrime(5);
        assertTrue(result);
    }
    @Test
    public void checkIsPrime2(){
        boolean result = Problem2.isPrime(2);
        assertTrue(result);
    }
    @Test
    public void checkIsPrime3(){
        boolean result = Problem2.isPrime(10);
        assertTrue(!result);
        assertFalse(result);
    }

    @Test
    public void checkIsPrime4(){
        boolean result = Problem2.isPrime(100);
        assertTrue(!result);
        assertFalse(result);
    }
    @Test
    public void checkIsPrimeNegaitve(){
        boolean result = Problem2.isPrime(-100);
        assertFalse(result);
    }
}
