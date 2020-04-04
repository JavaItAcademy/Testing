package kg;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void checkEvenIndices()
    {
        int[] array = App.testingArray();
        boolean result = true;
        for(int  i = 0; i< array.length; i++) {
            if (i%2 == 0 && array[i] %2 != 0){
                result = false;
                break;
            }
        }
        assertTrue(result);
    }

    @Test
    public void checkArray()
    {
        int[] array = App.testingArray();

        assertTrue(array.length > 0);
    }

    @Test
    public void checkOddIndices()
    {
        int[] array = App.testingArray();
        boolean result = true;
        for(int  i = 0; i< array.length; i++) {
            if (i%2 != 0 && array[i] % 2 == 0){
                result = false;
                break;
            }
        }
        assertTrue(result);
    }

    @Test
    public void checkOrder()
    {
        int[] array = App.testingArray();
        boolean result = true;
        for(int i = 1; i < array.length; i++) {
            if (array[i-1] >= array[i]){
                result = false;
                break;
            }
        }
        assertTrue(result);
    }

    @Test
    public void checkSum()
    {
        int[] array = App.testingArray();
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) sumEven += array[i];
            else sumOdd += array[i];
        }
        assertTrue(sumOdd*2 <= sumEven);
    }
    @Test
    public void checkSumLessThan()
    {
        int Y = 10;
        int[] array = App.testingArray();
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        assertTrue(sum < Y);
    }




}
