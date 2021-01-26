import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop bustop;
    private Passenger passenger;

    @Before
    public void before() {
        bustop = new BusStop("Tower Hamlets");
        passenger = new Passenger();
    }

    @Test
    public void canAddPersonToQueue(){
        bustop.addPerson(passenger);
        assertEquals(1, bustop.queueCount());
    }

    @Test
    public void canRemovePersonToQueue(){
        bustop.addPerson(passenger);
        Passenger removedPassenger = bustop.removePerson();
        assertEquals(passenger, removedPassenger);
        assertEquals(0, bustop.queueCount());
    }
}
