public class Human {

    int age = 20;

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getAge(5,0.2,true, new Human()));
        System.out.println(human.gettingAge(8,0.9,false, new Human()));
    }

    double getAge(int i, double d, boolean bool, Human human){
        return human.age;
    }
    // Infinity Recursion.
    double gettingAge(int i, double d, boolean bool, Human human){
        return  human.gettingAge(i, d, bool, human);
    }
}
