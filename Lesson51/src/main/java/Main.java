import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set set = new TreeSet(new PersonComparator());
        set.add(new Person(4));
        set.add(new Person(5));
        set.add(new Person(6));
        set.add(new Person(8));
        for (Object o : set){
            System.out.println(o);
        }
    }
}
