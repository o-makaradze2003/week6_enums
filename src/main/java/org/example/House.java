package org.example;

public class House {
    public int HousePrice;
    public String HouseAddress;
    public HouseTypes typehouse;

    public House(int housePrice, String houseAddress, HouseTypes typehouse) {
        HousePrice = housePrice;
        HouseAddress = houseAddress;
        this.typehouse = typehouse;

    }

    public int getHousePrice() {
        return HousePrice;
    }

    public void setHousePrice(int housePrice) {
        HousePrice = housePrice;
    }

    public String getHouseAddress() {
        return HouseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        HouseAddress = houseAddress;
    }

    public HouseTypes getTypehouse() {
        return typehouse;
    }

    public void setTypehouse(HouseTypes typehouse) {
        this.typehouse = typehouse;
    }
}
