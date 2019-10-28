package com.Sergio.Galera;
public class Group {
    ParkingLot lot;
    public Group() {
        lot = new ParkingLot();
    }
    public void setPrice(int price) {
        lot.outGate.setCost(price);
    }
}
