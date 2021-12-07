// package calculator.model.drive;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;


public class DriversManagerTest
{

    private final DriversManager driversManager = new DriversManager();

    @Before
    public void setup(){
        driversManager.addPassenger( new Passenger( "Carlos", "44234", 100 ) );
        driversManager.addPassenger( new Passenger( "Elise", "533434", 100 ) );
        driversManager.addPassenger( new Passenger( "Ian", "5343433", 100 ) );
        driversManager.addPassenger( new Passenger( "Debbie", "44555521", 100 ) );
        driversManager.addPassenger( new Passenger( "Cleon", "559988", 100 ) );
        driversManager.addPassenger( new Passenger( "Santiago", "1203123", 100 ) );

        driversManager.addDriver( new Driver( "Emilio", "1234990", 10f ) );
        driversManager.addDriver( new Driver( "Pedro", "12312440", 12f ) );
        driversManager.addDriver( new Driver( "Constanza", "9824990", 11f ) );
    }

    @Test
    public void startTripTest(){
	// DriversManager d= new DriversManager();
	driversManager.startTrip("44234","1234990");
	driversManager.startTrip("442341","1234990");
	// Assert.assertEquals(res,30);
    }

    @Test
    public void endTripTest(){
	driversManager.endTrip("44234","1234990");
    }

    @Test
    public void nextAvailableDriverTest(){
	String res = driversManager.findNextAvailableDriver();
	Assert.assertEquals(res,"1234990");
    }
}
