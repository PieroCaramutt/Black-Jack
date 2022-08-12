/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
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
public class GenerateCardsTest {
    
    public GenerateCardsTest() {
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
     * Test of generate method, of class GenerateCards.
     */
    @Test
    public void testGenerateGood() {
        System.out.println("generate");
        GenerateCards instance = new GenerateCards();
        instance.generate();
        boolean expResult = true;
        boolean result = instance.cards.size()== 52; 
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGenerateBad() {
        System.out.println("generate");
        GenerateCards instance = new GenerateCards();
        instance.generate();
        boolean expResult = false;
        boolean result = instance.cards.size()==51; 
        assertEquals(expResult, result);
    
    }
    
@Test
    public void testGenerateBoundary(){
        System.out.println("generate");
        GenerateCards instance = new GenerateCards();
        instance.generate();
        boolean expResult = false;
        boolean result = instance.cards.size()==0; 
        assertEquals(expResult, result);}
    
}
