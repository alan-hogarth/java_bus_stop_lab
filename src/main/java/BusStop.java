import java.util.ArrayList;

public class BusStop {

//    Add a BusStop class which interacts with the other two.
//    BusStop should have a name and an initially empty ArrayList of type "Person" called Queue.
//    Add a method to add a Person to the queue.
//    Add a method to remove a person from the queue.
//    Create a pickUp method in bus that gets person from bus stop and adds to bus passengers.

    private String name;
    private ArrayList<Passenger> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<Passenger>();
    }

    public int queueCount() {
        return queue.size();
    }

    public void addPerson(Passenger passenger) {
        queue.add(passenger);
    }

    public Passenger removePerson() {
        return queue.remove(0);
    }
}
