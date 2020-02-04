/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dronesdomicilio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MAYER MONSALVE
 */
public class DronesDomicilioTest {
    
    public DronesDomicilioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class DronesDomicilio.
     */
   /* @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] arg = null;
        DronesDomicilio.main(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recorrer method, of class DronesDomicilio.
     */
   /* @Test
    public void testRecorrer() throws Exception {
        System.out.println("recorrer");
        String rutaEntrada = "";
        DronesDomicilio.recorrer(rutaEntrada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of movimiento method, of class DronesDomicilio.
     */
    @Test
    public void testMovimiento() {
        System.out.println("movimiento");
        char pos = 'A';
        String expResult = "(0,1) en dirección Norte";
        String result = DronesDomicilio.movimiento(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult))
        fail("The test case is a prototype.");
    }

    /**
     * Test of escribirArchivo method, of class DronesDomicilio.
     */
   /* @Test
    public void testEscribirArchivo() {
        System.out.println("escribirArchivo");
        String msg = "";
        DronesDomicilio.escribirArchivo(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
}