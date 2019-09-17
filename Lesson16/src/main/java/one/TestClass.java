package one;

public class TestClass {
    private int i = 6;
    int k = 7;
    protected int j = 6;
    public int n = 8;
}
class TestModifiers{
    void method(){
        TestClass testClass = new TestClass();
        System.out.println(testClass.j);
    }
}
