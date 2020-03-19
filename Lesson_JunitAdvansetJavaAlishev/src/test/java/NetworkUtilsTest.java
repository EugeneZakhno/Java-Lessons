import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public  class NetworkUtilsTest {

    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThenOneSecond() {
        NetworkUtils.getConnection();

    }
}