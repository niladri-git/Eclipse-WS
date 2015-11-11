package my.pkg;

public class HelloAntTest extends junit.framework.TestCase {

    public void testNothing() {
    }
    
    public void testWillAlwaysPass() {
        assertTrue( true );
    }

    public void testWillAlwaysFail() {
        fail("An error message");
    }
    
}
