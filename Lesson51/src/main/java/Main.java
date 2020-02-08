import java.util.*;

class Person /*implements Comparable<Person>*/ {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
    }

/*    @Override
    public int compareTo(Person o) {
        return  this.age - o.age ;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

// Comparator we use when wa have no access to class Person:
class ComparePerson implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}

public class Main {
    public static void main(String[] args) {

        Set set = new TreeSet(new ComparePerson());

        set.add(new Person(41));
        set.add(new Person(70));
        set.add(new Person(70));
        set.add(new Person(61));
        set.add(new Person(32));

        for (Object o : set) {
            System.out.println(o);

       /*   Начиная с Java 8, мы можем сделать так
            Set<Person> set = new TreeSet<>(Comparator.comparingInt(Person::getAge))
            или если для имени
            Set<Person> set = new TreeSet<>(Comparator.comparing(Person::getName))
            Это без написания дополнительных классов и имплементации Comparable - работает сразу.
            И еще можно выводить коллекции так
            set.forEach(System.out::print), чтобы не писать дополнительно цикл.
        */
        }
    }
}
