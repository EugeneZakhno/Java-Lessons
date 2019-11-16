package io.github.eugenezakhno;

public class Main {

        public static void main(String[]args){
        MyObject myObject = new MyObject();
        myObject.i = 1;
        MyObject myObject1 = myObject;
        myObject.i = 2;

        }

}
class MyObject {
    int i;
}
