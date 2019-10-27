import java.util.LinkedList;

public class Car {
    public boolean ticket;
    public String name;
    public String timeEnter;

    public Car(String n, String t) {
        name = n;
        timeEnter = t;
        ticket = false;
    }
    public ParkingLot getLowestPrice(LinkedList<ParkingLot> lots) {
        ParkingLot low = lots.get(0);
        int b = 1;
        while(b < lots.size())
        {
            if(lots.get(b).outGate.cost < low.outGate.cost) {
                low = lots.get(b);
            }
            b++;
        }
        return low;
    }

    public ParkingLot getLowestSpots(LinkedList<ParkingLot> lots) {
        ParkingLot low = lots.get(0);
        int b = 1;
        while(b < lots.size())
        {
            if(lots.get(b).openSpots < low.openSpots) {
                low = lots.get(b);
            }
            b++;
        }
        return low;
    }
}
