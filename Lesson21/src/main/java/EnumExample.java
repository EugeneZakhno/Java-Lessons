import java.io.Serializable;

public class EnumExample {

    //  Enum могут имплементировать интерфейсы, но не могут расширять какие-либо классы,
    //  т.к. enum наследуются (уже расширяют класс Enum).

 enum coffeeSize{SMALL, MEDIUM, BIG }



}
enum coffeeSize implements Serializable  {SMALL, MEDIUM, BIG }
