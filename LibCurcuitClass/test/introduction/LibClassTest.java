/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nedim.basic
 */
public class LibClassTest {
    
    public LibClassTest() {
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
     * Test of about method, of class LibClass.
     */
    @Test
    public void testAbout() {
       System.err.println("Running testAbout...");
       String result = LibClass.about(new String[]
                  {"This source code past JUnit test."});
                assertEquals("Correct value", "This source code past JUnit test.", result);
    }
    
}
