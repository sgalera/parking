public class Exit extends ParkingLot {
    private int cost;
    public void leave(Car c) {
        if(c.ticket = true) {
            c.ticket = false;
            openSpots++;
            revenue = revenue + cost;
        }
    }
}
