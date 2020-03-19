import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Vector2DTest {
    private final double EPS = 1e-9;
    private Vector2D v1;

    @Before
    public void createNewVector(){
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        // Let's make am assertion. We need understand that expected result equals with actual.
        //1e-9 == 0,0000000001
        Assert.assertEquals(0, v1.length(),EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX(){
        Assert.assertEquals(0, v1.getX(),EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY(){
        Assert.assertEquals(0, v1.getY(),EPS);
    }






}