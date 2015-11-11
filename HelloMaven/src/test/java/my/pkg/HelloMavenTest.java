package my.pkg;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

public class HelloMavenTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    public HelloMavenTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */

    public static Test suite() {
        return new TestSuite( HelloMavenTest.class );
    }

    /**
     * Rigourous Test :-)
     */

    public void testNothing() {
    }

    public void testWillAlwaysPass() {
        assertTrue( true );
    }

//    public void testWillAlwaysFail() {
//        fail("An error message");
//    }

}
