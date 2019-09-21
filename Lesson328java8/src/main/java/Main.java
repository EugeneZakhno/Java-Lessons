import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");

        System.out.println("Длинный код для выводы содержимого ArrayList: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Вывод содержимого в укороченном виде через foreach:  ");
        for (String e : list) {
            System.out.println(e);
        }

        System.out.println("Вывод через Stream: ");
        Stream<String> stream = list.stream();
        stream.forEach(x -> System.out.println(x));
        // Вывод через Stream производистся только один раз, если выести второй раз
        // то будет ошибка java.lang.IllegalStateException: stream has already been operated upon or closed,
        // Поэто для вывод информации из ArrayList нужно обновить поток при помощи
        // Вызвав метод stream(); на данном  list вот так //  stream = list.stream();
        stream = list.stream();
        stream.forEach(x -> System.out.println(x));

        System.out.println("Вывод через Stream в одну строку: ");
        list.stream().forEach(x -> System.out.println(x));

        System.out.println("Вывод через Stream в одну строку еще раз: ");
        list.stream().forEach(x -> System.out.println(x));
//***********************************************************************************************************************
        //Все Streаm принимают функциональные интерфейсы:
        list.stream().filter(x -> {
            System.out.println("hello ");
            return x.equals("one");
        }).count();
        //lazy  and  eager methods//
//******************************************************************
        // Это строка преватит list в Set
        Set<String> set = list.stream().collect(Collectors.toSet());
        // Метод map(); превращает одни объекты в другие
        // из квадратов делает круги
        list.stream().map(x -> x.toUpperCase());
//******************************************************************
  //      Stream.of(asList("one ", "two ").asList("three", "four ")).flatMap(x->x.stream());
//******************************************************************************

  int value = Stream.of(1,2).min(Comparator.comparing(x->x)).get();

  int value2 = Stream.of(1,2).max(Comparator.comparing(x->x)).get();
//**********************************************************************************
  int count= Stream.of(1,2,3).reduce(8,(acc, element)->acc+element);
//******************************************************************************

    }
}
