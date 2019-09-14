public class PersonComparable implements  Comparable <PersonComparable> {
    int age;
    Person person = new Person();

    public PersonComparable(int age) {
        person.age = age;
    }
    @Override
    public int compareTo(PersonComparable p) {
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
