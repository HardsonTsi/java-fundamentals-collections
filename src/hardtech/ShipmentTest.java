package hardtech;

import org.junit.jupiter.api.Test;

import static hardtech.ProductFixtures.*;

public class ShipmentTest {

    private final Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems() throws Exception {
        shipment.add(door);
        shipment.add(window);
    }

    @Test
    public void shouldReplaceItems() throws Exception {
        shipment.add(door);
        shipment.add(floorPanel);
        shipment.replace(door, floorPanel);
    }

    @Test
    public void shouldNotReplaceItems() throws Exception {
        shipment.add(window);
        shipment.replace(window, floorPanel);
    }

    @Test
    public void shouldIdentifyVanRequirements() throws Exception {
        shipment.add(door);
        shipment.add(window);
        shipment.add(floorPanel);

        shipment.prepare();
    }


}
