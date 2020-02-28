import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            list.add(String.format("%2d", i));
        }


    }


}
