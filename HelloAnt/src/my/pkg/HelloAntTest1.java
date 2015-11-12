package my.pkg;

public class HelloAntTest1 extends junit.framework.TestCase {

    public void testNothing() {
    }
    
    public void testWillAlwaysPass() {
        assertTrue( true );
    }

    public void testWillAlwaysFail() {
        fail("Error message from HelloAntTest1.");
    }
    
}
