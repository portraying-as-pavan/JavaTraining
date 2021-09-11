
import static org.junit.Assert.*;

import com.moneytap.pojo.Calculator;
import org.junit.Test;

public class CalculatorTest {
  //  Calculator cal=new Calculator(5,3);

   @Test

    public void testAdd(){

       assertEquals(9, Calculator.add(4,5));
       assertEquals(9,Calculator.add(2,7));
     //  Assert.assertEquals();
   }
  /*
   @Test

    public void testSub(){
        assertEquals(2,Calculator.sub(10,8));
        assertEquals(3,Calculator.sub(10,7));
   }
   @Test
    public void testMultiply(){
       int x=5,y=3;
      assertEquals(x*y,Calculator.multiply(x,y));
   }

   @Test
    public void  divide(){

       int x=5, y=3;
       double a=5,b=3;
      // System.out.println(Calculator.divide(a,b));
      // assertEquals(x/y,Calculator.divide(x,y));
       assertEquals(1.67,Calculator.divide(a,b),0.01);
   }

   */
    @Test
    public void exam(){
        assertTrue(false);
        assertTrue(false);
        assertTrue(false);
    }
}
