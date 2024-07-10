package org.example;

public class Main {
    public static void main(String[] args) {
        House houseN1 = new House(1000, "batumi", HouseTypes.Sold);
        House houseN2 = new House(10000, "tbilisi", HouseTypes.in_Taking);
        House houseN3 = new House(100000, "kutaisi", HouseTypes.on_Sale);

        System.out.println("housePriceIs: " + houseN1.HousePrice + " houseAddressIs: " + houseN1.HouseAddress + " houseType: " + houseN1.typehouse);
        System.out.println("housePriceIs: " + houseN2.HousePrice + " houseAddressIs: " + houseN2.HouseAddress + " houseType: " + houseN2.typehouse);
        System.out.println("housePriceIs: " + houseN3.HousePrice + " houseAddressIs: " + houseN3.HouseAddress + " houseType: " + houseN3.typehouse);
    }
}