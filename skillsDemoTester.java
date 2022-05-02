import static org.junit.Assert.*;
import org.junit.*;

public class skillsDemoTester {

    @Test
    public void testGradingScale() {
        String output = skillsDemo.gradingScale(75);
        assertEquals("You got a B", output);
    }

    
}
