import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    Calculations calculations=new Calculations();
    @Test
    public void TestAdd(){
        assertEquals(5,calculations.Addition(2,3));
    }

    @Test
    public void TestSub(){
        assertEquals(-1,calculations.Subtraction(2,3));
    }

    @Test
    public void TestMul(){
        assertEquals(6,calculations.Multiplication(2,3));
    }

    @Test
    public void TestDiv(){
        assertEquals(0,calculations.Division(2,3));
    }

}
