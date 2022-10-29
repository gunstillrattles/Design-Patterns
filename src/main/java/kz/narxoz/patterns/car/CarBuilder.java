package kz.narxoz.patterns.car;

public class CarBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setDoors(int doors) {
        car.doors = doors;
    }

    @Override
    public void setCarType(String carType) {
        car.carType = carType;
    }

    @Override
    public void setEngineType(String engineType) {
        car.engineType = engineType;
    }

    @Override
    public void setEngine(double engine) {
        car.engine = engine;
    }

    @Override
    public void setAutoTransmission(boolean isAutoTransmission) {
        car.isAutoTransmission = isAutoTransmission;
    }

    public Car getResult(){
        return car;
    }
}