package kg;

import static org.junit.Assert.*;
import org.junit.Test;
public class Problem4Test {
    @Test
    public void checkTriangleArea(){
        int[] array = Problem4.generateCorrectArray();
        String result = Problem4.checkMoney(array);
        assertEquals("OK", result);
    }

}
