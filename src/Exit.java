public class Exit extends ParkingLot {
    private int cost;
    public void leave(Car c) {
        if(c.ticket = true) {
            c.ticket = false;
            openSpots++;
            revenue = revenue + cost;
            System.out.println(c.name + " is now leaving the parking lot.");
        }
        else {
            System.out.println(c.name + " lost his/her ticket.");
        }
    }
}
