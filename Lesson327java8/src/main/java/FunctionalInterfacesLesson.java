import java.util.function.*;

public class FunctionalInterfacesLesson {
    public static void main(String[] args) {
        // Вопрос: Для чего нужны @FunctionalInterfaces

        // Ответ: Любой интерфейс с одним методом называется функциональный.
        // Никаких дополнительных преимуществ или отличий у них нет. Так называются они потому, что представляют функцию

        // это интерфейсы из пакета java.util.function.*;
        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(predicate.test(10));
        Consumer<Integer> consumer = x -> System.out.println(x);
        Function<Integer, String> function = x -> x.toString();
        Supplier<Integer> supplier = () -> new Integer(5);
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        BinaryOperator<Integer> binaryOperator = (x, y) -> x * y;

        // а это написанный мной функциональный интерфейс
        MyPredicate<Integer> myPredicate = x-> System.out.println(x);
        myPredicate.apply(5);
    }

    interface  MyPredicate<T>{
        void apply(T t);
    }
}
