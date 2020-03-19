import org.junit.Test;


public class MyMathTest {

    @Test(expected = ArithmeticException.class)
   public void zeroDenominatorShouldThrowException() {
        MyMath.devide(1,0);
    }
}