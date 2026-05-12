package org.example;

import java.util.ArrayList;

public class Main {

    // ANSI COLORS
    public static final String RESET = "\u001B[0m";

    public static final String GREEN = "\u001B[92m";   // bright green
    public static final String YELLOW = "\u001B[93m";  // gold yellow

    //
    public static final String BLUE = "\u001B[94m";

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

        // HEADER
        System.out.println(BLUE + "==========================================================================");
        System.out.println("DESCRIPTION     | DATE       | COST        | VALUE       | DETAILS");
        System.out.println("=========================================================================="
                + RESET);

        // LOOP THROUGH ASSETS
        for (Asset asset : assets) {

            String details = "";

            // HOUSE → no color change here (kept simple)
            if (asset instanceof House house) {
                details = "Address: " + house.getAddress();

                // VEHICLE → yellow
            } else if (asset instanceof Vehicle vehicle) {
                details = YELLOW + vehicle.getYear() + " " + vehicle.getMakeModel() + RESET;
            }

            String row = String.format(
                    "%-15s | %-10s | $%-10.2f | $%-10.2f | %s",
                    asset.getDescription(),
                    asset.getDateAcquired(),
                    asset.getOriginalCost(),
                    asset.getValue(),
                    details
            );

            // MAIN ROW
            System.out.println(GREEN + row + RESET);
        }
    }
}