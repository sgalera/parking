public class Exit {
    private int cost = 5;
    public int leave(Car c, int spots) {
        if(c.ticket == true) {
            c.ticket = false;
            spots++;
            ParkingLot.revenue = ParkingLot.revenue + cost;
            System.out.println(c.name + " is now leaving the parking lot.");
        }
        return spots;
    }
}
