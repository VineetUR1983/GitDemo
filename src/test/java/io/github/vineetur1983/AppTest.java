package io.github.vineetur1983;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        System.out.println("This is the Test Suite");
        System.out.println("Running from Test Suite Method");
        System.out.println("This is update from User1");
        System.out.println("This is update from User1");
        System.out.println("This is update from User1");
        System.out.println("This is update from User1");
        System.out.println("This is update from User1");
        
        
    	return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
