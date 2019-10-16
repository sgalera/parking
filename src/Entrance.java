public class Entrance extends ParkingLot {
    public void enter(Car c) {
        if(openSpots != 0) {
            c.ticket = true;
            openSpots--;
        }
        else {
            System.out.println("Parking Lot is full.");
        }
    }
}
