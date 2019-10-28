package com.Sergio.Galera;
public class Entrance {
    public void enter(Car c) {
        if(c.ticket == false) {
            c.ticket = true;
            System.out.println(c.name + " is entering the parking lot at " + c.timeEnter + ".");
        }
        else {
            System.out.println(c.name + "cannot park in two parking lots.");
        }
    }
}
