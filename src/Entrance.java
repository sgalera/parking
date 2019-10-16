public class Entrance extends ParkingLot {
    public void enter(Car c) {
        if(openSpots != 0) {
            c.ticket = true;
            openSpots--;
            System.out.println(c.name + " is now entering the parking lot.");
        }
        else {
            System.out.println("Parking Lot is full.");
        }
    }
}
