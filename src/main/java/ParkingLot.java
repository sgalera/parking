import java.util.LinkedList;

public class ParkingLot {
    public int openSpots;
    private LinkedList<Car> lot = new LinkedList<Car>();
    Entrance inGate;
    Exit outGate;

    ParkingLot() {
        openSpots = 5;
        inGate = new Entrance();
        outGate = new Exit();
    }

    public void entering(Car c) {
        if(openSpots != 0) {
            inGate.enter(c);
            lot.add(c);
            openSpots--;
        }
        else {
            System.out.println("Parking lot is full.");
        }
    }

    public void leaving(String n, String t)
    {
        int b = 0;
        while(b < lot.size())
        {
            Car check = lot.get(b);
            if(check.name.equals(n) && check.timeEnter.equals(t)) {
                outGate.leave(check);
                lot.remove(check);
                openSpots++;
                return;
            }
            b++;
        }
    }
    public void printOpenSpots() {
        System.out.println("Number of open spots: " + openSpots);
    }
}
