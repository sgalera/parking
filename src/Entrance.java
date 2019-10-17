public class Entrance {
    public void enter(Car c) {
        if(ParkingLot.openSpots != 0) {
            c.ticket = true;
            ParkingLot.openSpots--;
            System.out.println(c.name + " is now entering the parking lot.");
        }
        else {
            System.out.println("Parking Lot is full.");
        }
    }
}
