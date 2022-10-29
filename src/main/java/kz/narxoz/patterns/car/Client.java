package kz.narxoz.patterns.car;

public class Client {
    public void makeCar() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);
        Car car = builder.getResult();
        System.out.println(car);
    }
}