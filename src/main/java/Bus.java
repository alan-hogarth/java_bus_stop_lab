import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Passenger> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Passenger>();
    }

    public int passengerCount() {
        return passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (passengerCount() < capacity){
            passengers.add(passenger);
        }
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(0);
    }
}
