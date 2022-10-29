package kz.narxoz.patterns.car;

public class Director {
    public void constructSportCar(Builder builder) {
        builder.reset();
        builder.setDoors(2);
        builder.setCarType("Sport");
        builder.setEngineType("Sport Engine");
        builder.setEngine(2.0);
        builder.setAutoTransmission(true);
    }
}