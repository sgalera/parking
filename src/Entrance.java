public class Entrance {
    public void enter(Car c) {
        c.ticket = true;
        System.out.println(c.name + " is entering the parking lot at " + c.timeEnter + ".");
    }
}
