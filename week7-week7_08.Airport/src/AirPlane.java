/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class AirPlane {
    private String id;
    private int capacity;
    private String departure;
    private String destination;
    public AirPlane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
public AirPlane(String id, int capacity, String departure, String destination) {
        this.id = id;
        this.capacity = capacity;
        this.departure = departure;
        this.destination = destination;
    }
    public String toString() {
        return id + " (" + capacity + " ppl)";  
    }
    public String flights() {
        return toString() + " (" + departure + "-" + destination+")\n";
    }
}
