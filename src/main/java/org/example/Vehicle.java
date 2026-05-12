package org.example;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(double originalCost, String dateAcquired, String description, int odometer, int year, String makeModel) {
        super(originalCost, dateAcquired, description);
        this.odometer = odometer;
        this.year = year;
        this.makeModel = makeModel;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
