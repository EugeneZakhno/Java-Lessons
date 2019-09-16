strictfp interface ISomeInterface {
    public static final int SOME_VARIEBLE = 5;
    public abstract void addTwoDigits(int one, int two);
}
interface OtherInterface{
    void someMethod();
}
interface BanCable{
    void bounce();
}
class Example implements ISomeInterface, BanCable{

    public void addTwoDigits(int one, int two){

    }
    public void someMethod(){

    }
    public void bounce(){

    }
}