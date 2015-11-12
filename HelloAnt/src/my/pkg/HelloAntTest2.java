package my.pkg;

public class HelloAntTest2 extends junit.framework.TestCase {

    public void testNothing() {
    }
    
    public void testWillAlwaysPass() {
        assertTrue( true );
    }

    public void testWillAlwaysFail() {
        fail("Error message from HelloAntTest2.");
    }
    
}
