
class MyParent{
    public MyParent(int y) {
        System.out.println(" MY parent");
    }

    public MyParent() {
        System.out.println("Defolte construcotr");
    }
}


public class ConstructorExample extends MyParent {

    public ConstructorExample() {
        super(5);
        //super();//Даже неявно но добавляется в конструктор
        System.out.println("Constructor example");
    }

    public static void main(String[] args) {
        new ConstructorExample();
    }


}
