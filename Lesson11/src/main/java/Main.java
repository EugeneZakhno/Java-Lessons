public class Main {
    void useCar(Car car) {
        car.driving();
        System.out.println(car.getNumOfSeets());
    }
    public static void main(String[] args) {
    Main main = new Main();
    main.useCar(new Car());

    //Polimorphism
    Car car = new Toyota();
    main.useCar(car);
    }
}
