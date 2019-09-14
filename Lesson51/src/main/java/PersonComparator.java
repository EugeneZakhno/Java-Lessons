import java.util.Comparator;

public class PersonComparator implements Comparator<PersonComparator> {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compare(PersonComparator o1, PersonComparator o2) {
        return o1.getAge() - o2.getAge() ;
    }
}
