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
public class PlayersTest {
    
    public PlayersTest() {
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
     * Test of getSumP method, of class Players.
     */
    @Test
    public void testCardsGood() {
        System.out.println("getSumP");
        Players instance = new Players("Piero", 20);
        boolean expResult = true;
        boolean result = instance.playerCards.size()== 2;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCardsBad(){
        System.out.println("getSumP");
        Players instance = new Players("Piero", 20);
        boolean expResult = false;
        boolean result = instance.playerCards.size()== 1;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCardsBoundary() {
        System.out.println("getSumP");
        Players instance = new Players("Piero", 20);
        boolean expResult = false;
        boolean result = instance.playerCards.size()== 0;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
