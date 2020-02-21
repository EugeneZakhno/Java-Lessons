import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Book x = new Book("one");
        Book y = new Book("one");
        Book z = new Book("one");

        //reflexive
        System.out.println("reflexive");
        System.out.println(x.equals(x)); //always true
        System.out.println();
        //symmetric
        System.out.println("symmetric");
        System.out.println(x.equals(y));
        System.out.println(y.equals(x));
        System.out.println();
        //transitive
        System.out.println("transitive");
        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));
        System.out.println();
        //consistent - постоянный
        System.out.println("consistent");
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println();
        //not null
        System.out.println("not null");
        System.out.println(x.equals(null)); // always false
    }
}
class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && this.title.equals(((Book) obj).title);
    }


    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return title.equals(book.title);
    }
*/

}