public class TestCalculator {
    public static void testCalc() {
        Calculator calculator = new Calculator();
        int result =  calculator.add(3,4);
        if(result != 7) {
            System.out.println("calculator works wrong! ");
        }
    }
}
