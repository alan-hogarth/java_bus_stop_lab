import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Passenger passenger;
    private Passenger passenger2;

    @Before
    public void before(){
        bus = new Bus("home", 5);
        passenger = new Passenger();
        passenger2 = new Passenger();
    }

    @Test
    public void startsWithoutPassengers(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengerIfNotFull(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(passenger);
        bus.removePassenger(passenger);
        assertEquals(0, bus.passengerCount());
    }
//
//    Create a method to add a passenger onto the bus only if the passenger
//    count is less than the capacity.
//    Create a method to remove a passenger from the bus.


}
