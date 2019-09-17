class Popcorn{
    void doSomething(){
        System.out.println("doSomething_1");
    }
    void secondMethod(){
        System.out.println("secondMethod");
    }
}
public class Main {
    public static void main(String[] args) {

        Popcorn popcorn = new Popcorn() {
            //This is anonimous class and it has no name
            // Its methods is always overriding and its methods is
            // polimorphism
            @Override
            void doSomething() {
                System.out.println("doSomething_2");
            }
        };
        popcorn.doSomething();
        popcorn.secondMethod();

        // This is one time when we can use new Comparable()
        // for interface;
        Comparable comparable = new Comparable() {
            public int compareTo(Object o) {
                System.out.println("compareTo");
                return 0;
            }
        };
        comparable.compareTo(new Object());

    /*  method(new Popcorn()){
            void doSomthing (){
                System.out.println("bla");
            }
        });
      }
        static void method(Popcorn popcorn){
            popcorn.doSomething();
        }
    */
    }
}
