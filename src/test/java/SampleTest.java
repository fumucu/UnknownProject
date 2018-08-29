import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SampleTest {

    @Test
    public void simpleTest(){
        int a = 1;
        int b = 2;
        assertTrue(a+b == 3);
    }

    @Test
    public void simpleTestToFail(){
        int a = 1;
        int b = 2;
        assertTrue(a+b == 3);
    }

}
