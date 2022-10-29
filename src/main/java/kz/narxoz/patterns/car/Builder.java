package kz.narxoz.patterns.car;

public interface Builder {
    void reset();
    void setDoors(int doors);
    void setCarType(String carType);
    void setEngineType(String engineType);
    void setEngine(double engine);
    void setAutoTransmission(boolean isAutoTransmission);
}