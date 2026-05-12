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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    @Override
    public double getValue(){
        double pricePerSqft = 0;
      if (condition == 1)  {
      pricePerSqft = 180;
      } else if (condition == 2){
          pricePerSqft = 130;
          } else if (condition == 3){
              pricePerSqft = 90;
          } else {
              pricePerSqft = 80;
          }
          double value = squareFoot * pricePerSqft;
          value += lotSize * 0.25;
          return value;


          }
      }


