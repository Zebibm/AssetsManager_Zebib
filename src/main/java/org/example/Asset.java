package org.example;

public class Asset {
    private String description;
    private String dateAcquired;
    private double originalCost;

    public Asset(double originalCost, String dateAcquired, String description) {
        this.originalCost = originalCost;
        this.dateAcquired = dateAcquired;
        this.description = description;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public double getValue(){
        return originalCost;
    }


}
