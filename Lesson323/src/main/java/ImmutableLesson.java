import java.util.Date;

public class ImmutableLesson {
    public static void main(String[] args) {
        Student student = new Student(18, "Bill", new Date());
        int i = student.getAge();
        String s = student.getName();
        Date d = student.getDate();

        i = 1;
        s="Make";
        d.setTime(0);
        System.out.println(student.getAge()+" "+ student.getName()+ " " +student.getDate());
      /*  System.out.println();
        Student student1 = new MyStudent(20, "fg", new Date());
        System.out.println(student1.getDate());*/

    }
}
 final class Student {
    int age;
    String name;
    Date date;

    public Student(int age, String name, Date date) {
        this.age = age;
        this.name = name;
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return (Date)date.clone();
    }
}
/*class MyStudent extends Student{
    public MyStudent(int age, String name, Date date) {
        super(age, name, date);
    }

    @Override
    public Date getDate() {
        Date date = new Date();
        date.setTime(0);
        return date;
    }

}*/
