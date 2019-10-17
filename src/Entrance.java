public class Entrance {
    public int enter(Car c, int spots) {
        if(spots != 0) {
            c.ticket = true;
            spots--;
            System.out.println(c.name + " is now entering the parking lot.");
        }
        else {
            System.out.println("Parking lot is full.");
        }
        return spots;
    }
}
