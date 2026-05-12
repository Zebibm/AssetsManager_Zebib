package org.example;

public class House extends Asset {
private String address;
private  int condition;
private int squareFoot;
private int lotSize;

    public House(double originalCost, String dateAcquired, String description, int lotSize, int squareFoot, int condition, String address) {
        super(originalCost, dateAcquired, description);
        this.lotSize = lotSize;
        this.squareFoot = squareFoot;
        this.condition = condition;
        this.address = address;
    }
}
