package kz.narxoz.patterns.car;

public class Car {
    public int doors;
    public String carType;
    public String engineType;
    public double engine;
    public boolean isAutoTransmission;

    public String toString(){
        StringBuilder str = new StringBuilder("CAR: ");
        str.append("doors: ");
        str.append(doors);
        str.append("Car Type: ");
        str.append(carType);
        str.append("Engine Type: ");
        str.append(engineType);
        str.append("Engine: ");
        str.append(engine);
        str.append("Auto Transmission: ");
        str.append(isAutoTransmission);
        return str.toString();
    }
}