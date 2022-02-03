import static org.junit.Assert.*;
import org.junit.*;


public class mathTest {
    

    @Test
    public void divideTest(){
        try {
            math.divide(3, 0);
            fail();
            
        } catch (ArithmeticException e) {
            //Do nothing
        }
    }
}
