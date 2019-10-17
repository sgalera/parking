public class Exit {
    private int cost = 7;
    public void leave(Car c) {
        if(c.ticket = true) {
            c.ticket = false;
            ParkingLot.revenue = ParkingLot.revenue + cost;
            System.out.println(c.name + " is now leaving the parking lot.");
        }
        else {
            System.out.println(c.name + " lost his/her ticket.");
        }
    }
}
