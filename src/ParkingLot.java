public class ParkingLot {
    private int openSpots;
    static int revenue;
    Entrance inGate;
    Exit outGate;
    ParkingLot() {
        openSpots = 10;
        inGate = new Entrance();
        outGate = new Exit();
    }
    public void run(Car c) {
        openSpots = inGate.enter(c, openSpots);
        openSpots = outGate.leave(c, openSpots);
    }
    public void printOpenSpots() {
        System.out.println("Number of open spots: " + openSpots);
    }
    public void printRevenue() {
        System.out.println("Total Revenue: " + revenue);
    }
}
