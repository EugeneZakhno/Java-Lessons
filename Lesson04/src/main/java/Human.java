public class Human {
    int age;
    double height;

    public static void main(String[] args) {
       Human human = new Human();
       human.buyBread();
       human.buyMilk();
       System.out.println("Hello world!");
       human.birthday();
    }

    void birthday(){
        age = age + 1;
        System.out.println(age);
    }

    void buyMilk(){
      System.out.println("Buy milk");
    }

    void buyBread(){
     System.out.println("buy bread!");
    }

}
