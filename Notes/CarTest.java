

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CarTest
{
    /**
     * Default constructor for test class CarTest
     */
    public CarTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testGetGasInTank()
    {
        Car testCar = new Car( 50 );
        double amount = testCar.getGasInTank();
        /*
         * The assertEquals method checks if the two specified values are
         *      equal. If not, the test fails, and JUnit reports where the
         *      failure occurred.
         *  Specify the expected value first and the queried value second.
         *  For floating point numbers, specify a third value which is
         *      the epsilon value (i.e., how close is close enought to
         *      be considered equal).
         */
        assertEquals( 0, amount, 1e-6 /* 1 x 10^-6 */ );
    }
    
    @Test
    public void testAddGas()
    {
        Car testCar = new Car( 50 );
        testCar.addGas( 20 );
        double amount = testCar.getGasInTank();
        assertEquals( 20, amount, 1e-6 );
        
        testCar.addGas( 5 );
        amount = testCar.getGasInTank();
        assertEquals( 25, amount, 1e-6 );
    }
    
    @Test
    public void testDrive()
    {
        Car testCar = new Car( 50 );
        testCar.addGas( 20 );
        testCar.drive( 25 );
        double amount = testCar.getGasInTank();
        assertEquals( 19.5, amount, 1e-6 );
        
        testCar.drive( 100 );
        amount = testCar.getGasInTank();
        assertEquals( 17.5, amount, 1e-6 );
    }
    
        
        
    
    
    
    
    
    
}
