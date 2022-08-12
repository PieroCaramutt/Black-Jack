/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package black.jack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Piero
 */
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetNameGood() {
        System.out.println("getName");
        Player instance = new Players("Piero", 20);
        boolean expResult = true;
        boolean result = instance.getName()== "Piero";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetNameBad() {
        System.out.println("getName");
        Player instance = new Players("Piero", 20);
        boolean expResult = false;
        boolean result = instance.getName()== "james";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetNameBoundary() {
        System.out.println("getName");
        Player instance = new Players("Piero", 20);
        boolean expResult = false;
        boolean result = instance.getName()== "";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBet method, of class Player.
     */
    @Test
    public void testGetBetGood() {
        System.out.println("getBet");
        Player instance = new Players("Piero", 20);
        boolean expResult = true;
        boolean result = instance.getBet()==20;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetBetBad() {
        System.out.println("getBet");
        Player instance = new Players("Piero", 20);
        boolean expResult = false;
        boolean result = instance.getBet()==10;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetBetBoundary() {
        System.out.println("getBet");
        Player instance = new Players("Piero", 20);
        boolean expResult = false;
        boolean result = instance.getBet()==10;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   
    
}
