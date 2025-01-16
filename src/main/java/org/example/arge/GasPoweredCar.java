package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double averageKmPerLiter;
private int cylinders;

    public GasPoweredCar(String name, String description, int cylinders, double avgKmPerLitre) {
        super(name, description);
        this.cylinders = cylinders;
        this.averageKmPerLiter = avgKmPerLitre;
    }
    @Override
    public String startEngine() {
        runEngine(this);
        return getName()+"car starting";
    }

    @Override
    public String drive() {
        return "run from GasPoweredCAr car";
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

}
