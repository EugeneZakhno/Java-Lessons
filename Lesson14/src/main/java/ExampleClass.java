abstract class ExampleClass {
    void method() {
        Car car = new Ferrary();
        car.run();
        car.stop();
     }
}
 abstract class  Car{
    int speed;
   abstract void run();
    void stop(){
        speed = 0;
    }
}
class Ferrary extends Car{
    @Override
    void run() {
        speed = 300;
    }
}

class MeSecondClass{

}
class MeSecondClass01{

}
class MeSecondClass02{

}
abstract  class  Ball extends ExampleClass{

}

final class MyFinalClass{ // Mostly for libraries
    void someLogic(){
    }
}

//public strictfp abstract final class someClass{
    //class cannot be abstract final in one class
//}

/*
strictfp  class ExampleClass { // строгий float
    // We use strictfp in every method we use for count
    // float values better.
    void method(float f){
    }
}*/
