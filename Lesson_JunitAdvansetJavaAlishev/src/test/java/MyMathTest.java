import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {

    @Test
   public void zeroDenominatorShouldThrowException() {
        MyMath.devide(1,0);
    }
}