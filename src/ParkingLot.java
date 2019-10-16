public class ParkingLot {
    protected int openSpots;
    protected int revenue;
    Entrance inGate;
    Exit outGate;
    ParkingLot() {
        openSpots = 10;
        inGate = new Entrance();
        outGate = new Exit();
    }
}
