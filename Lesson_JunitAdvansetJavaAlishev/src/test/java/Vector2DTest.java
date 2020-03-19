import org.junit.Assert;
import org.junit.Test;

public class Vector2DTest {

    @Test
    public void newVectorShouldHaveZeroLength() {
        Vector2D v1 = new Vector2D();  // action
        // Let's make am assertion. We need understand that expected result equals with actual.
        //1e-9 == 0,0000000001
        Assert.assertEquals(0, v1.length(),1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroX(){
        Vector2D v1 = new Vector2D();  // action
        Assert.assertEquals(0, v1.getX(),1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroY(){
        Vector2D v1 = new Vector2D();  // action
        Assert.assertEquals(0, v1.getY(),1e-9);
    }






}