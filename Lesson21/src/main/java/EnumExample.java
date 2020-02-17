import java.io.Serializable;

public class EnumExample {

    //  Enum могут имплементировать интерфейсы, но не могут расширять какие-либо классы,
    //  т.к. enum наследуются (уже расширяют класс Enum).

 enum coffeeSize{SMALL, MEDIUM, BIG }

// values(). Он возвращает массив всех констант перечисления пример: Color[] colors = Color.values();
// ordinal() возвращает порядковый номер определенной константы (нумерация начинается с 0):
// name()  - возвращает имя
//equals()
//hashCode()
//toString()
//finalize()
//clone()
//values()
}
enum coffeeSize implements Serializable  {SMALL, MEDIUM, BIG }
