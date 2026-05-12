package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        // Houses
        assets.add(new House("Vacation Home", "2020-01-01", 200000,
                "123 Beach Rd", 2, 2000, 5000));

        assets.add(new House("My House", "2018-06-10", 180000,
                "45 Main St", 1, 1800, 4000));

        // Vehicles
        assets.add(new Vehicle("My Car", "2022-03-01", 30000,
                "Toyota Camry", 2021, 40000));

        assets.add(new Vehicle("Work Truck", "2015-09-12", 25000,
                "Ford F150", 2014, 120000));

        // Polymorphism loop
        for (Asset asset : assets) {

            String message = asset.getDescription()
                    + " | Date: " + asset.getDateAcquired()
                    + " | Cost: " + asset.getOriginalCost()
                    + " | Value: " + asset.getValue();

            // Modern instanceof
            if (asset instanceof House house) {

                message += " | Address: " + house.getAddress();

            } else if (asset instanceof Vehicle vehicle) {

                message += " | Vehicle: " + vehicle.getYear()
                        + " " + vehicle.getMakeModel();
            }

            System.out.println(message);
        }
    }
}