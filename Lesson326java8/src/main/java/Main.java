import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Main{
    public static void main(String[] args) {

        // Самое простое лямбда выражение будет выглядеть,
        // без параметров
  //      () -> System.out.println("Hello0");

        // С одним параметром:
  //      x -> System.out.println("Hello1");

        // С двумя параметрами:
  //     (x, y) -> System.out.println("Hello2");
        // Своего рода безымянная функция, т.е у нее нет имени

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello 2");
            }
        };
        //  вот так запишем анонимный класс с лямбдой
        Runnable runnable1 = () -> {System.out.println("hello");};
        System.out.println("after");

        final String s = "hello ";

        ActionListener actionListener1 = (ActionEvent event) -> System.out.println(s);

        // Лямбда это просто выражения вот такого вида
        // (x, y) -> {};


    }
}