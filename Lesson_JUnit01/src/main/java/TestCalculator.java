public class TestCalculator {
    public void testCalc() throws Exception{
        Calculator calculator = new Calculator();
        int result =  calculator.add(3,4);
        if(result != 7) {
            System.out.println("calculator works wrong! ");
        }
    }
}
