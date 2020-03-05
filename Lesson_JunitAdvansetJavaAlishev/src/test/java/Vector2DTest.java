import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {

    @org.junit.jupiter.api.Test
    public void newVectorShouldHaveZiroLength() {
            Vector2D v1 = new Vector2D();
            assertEquals(0, v1.length(), 0 );

    }
}