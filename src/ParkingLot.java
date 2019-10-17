public class ParkingLot {
    static int openSpots;
    static int revenue;
    Entrance inGate;
    Exit outGate;
    ParkingLot() {
        openSpots = 10;
        inGate = new Entrance();
        outGate = new Exit();
    }
    public void run(Car c) {
        inGate.enter(c);
        outGate.leave(c);
    }
    public void printRevenue() {
        System.out.println("Total Revenue: " + revenue);
    }
}
