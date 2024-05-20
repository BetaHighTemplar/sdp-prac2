package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testValidBracketString() {
        // Arrange
        String input = "(())";

        // Act
        boolean result = false; // Placeholder, replace with actual implementation once method is implemented

        // Assert
        assertTrue(result, "Expected valid bracket string");
    }

    @Test
    void testInvalidBracketString() {
        // Arrange
        String input = "(()";

        // Act
        boolean result = false; // Placeholder, replace with actual implementation once method is implemented

        // Assert
        assertFalse(result, "Expected invalid bracket string");
    }
}
//Num 11