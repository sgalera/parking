public class Exit {
    public int cost = 5;
    public int revenue = 0;
    public void setCost(int cost) {
        this.cost = cost;
    }

    public void leave(Car c) {
        if(c.ticket == true) {
            c.ticket = false;
            revenue = revenue + cost;
            System.out.println(c.name + " is now leaving the parking lot.");
        }
    }

    public void printRevenue() {
        System.out.println("Total Revenue: $" + revenue);
    }
}
