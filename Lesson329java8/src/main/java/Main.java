import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.sayHekllo();
   }
}
interface  A {

    void printMessage(String message);

   default void sayHekllo(){
        printMessage("A hello ");
    }

    static int add(int x, int y){
        return x+y;
    }
}
interface  C  extends A {
    default void seyHekllo(){
        System.out.println(" C hello");
    }
}
class  B implements A, C{
    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void seyHekllo() {
        System.out.println(" B hello ");
    }
}
