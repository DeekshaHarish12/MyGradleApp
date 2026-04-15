import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testApp() {
        String name = "Deeksha";
        assertNotNull(name, "Name should not be null");
    }
}
