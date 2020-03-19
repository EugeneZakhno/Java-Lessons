import org.junit.Test;

public  class NetworkUtilsTest {

    @Test(timeout = 1501)
    public void getConnectionShouldReturnFasterThenOneSecond() {
        NetworkUtils.getConnection();

    }
}