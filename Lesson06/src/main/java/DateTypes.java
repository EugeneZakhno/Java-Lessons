public class DateTypes {
    // 8 primitive types
    byte b = -127; // till 128. (1 byte == 256)
    short s = 1234;
    char c = 'f';
    int i = 54654;
    long l = 654567684;
    float f = 657654545455754545645646546156455785.46554756463564641416854654654564848784f;
    double d = 35465454.5648;
    boolean bool = false;

    public static void main(String[] args) {
        DateTypes dateTypes = new DateTypes();
        System.out.println(dateTypes.b);
        System.out.println(dateTypes.s);
        System.out.println(dateTypes.c);
        System.out.println(dateTypes.i);
        System.out.println(dateTypes.l);
        System.out.println(dateTypes.f);
        System.out.println(dateTypes.d);
        System.out.println(dateTypes.bool);
    }

/*    Output:
        1234
        f
        54654
        654567684
        6.5765456E35
        3.54654545648E7
        false
    */
}
