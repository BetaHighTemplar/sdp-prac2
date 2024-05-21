package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTest {

    // Test Case 1: Empty List Test Case
    @Test
    void testEmptyList() {
        // Given
        List<String> inputList = new ArrayList<>();
        // When
        List<String> result = SimpleFunctions.task2(inputList);
        // Then
        List<String> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, result);
    }

    // Test Case 2: Normal Input Test Case
    @Test
    void testNormalInput() {
        // Given
        List<String> inputList = Arrays.asList("apple", "banana", "carrot");
        // When
        List<String> result = SimpleFunctions.task2(inputList);
        // Then
        List<String> expectedOutput = Arrays.asList("pple", "anana", "arrot");
        assertEquals(expectedOutput, result);
    }

    // Test Case 3: List with Empty Strings Test Case
    @Test
    void testListWithEmptyStrings() {
        // Given
        List<String> inputList = Arrays.asList("apple", "", "banana", "", "carrot");
        // When
        List<String> result = SimpleFunctions.task2(inputList);
        // Then
        List<String> expectedOutput = Arrays.asList("pple", "anana", "arrot");
        assertEquals(expectedOutput, result);
    }

    // Test Case Task 6
    @Test
    public void testRoundUpToMultipleOf100() {
        List<Integer> input = Arrays.asList(50, 100, 150, 200, 250);
        List<Integer> expectedOutput = Arrays.asList(100, 100, 200, 200, 300);

        List<Integer> actualOutput = SimpleFunctions.roundUpToMultipleOf100(input);

        assertEquals(expectedOutput, actualOutput);
    }

    // Task 1 test cases G19m1985
    @Test
    public void testSumElementsByIndexes() {
        SimpleFunctions simpleFunctions = new SimpleFunctions();

        // 1
        List<Integer> a1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> b1 = Arrays.asList(0, 2, 4);
        assertEquals(9, simpleFunctions.sumElementsByIndexes(a1, b1));

        // 2 - negative
        List<Integer> a2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> b2 = Arrays.asList(-1, -2, -3, -4);
        assertEquals(0, simpleFunctions.sumElementsByIndexes(a2, b2));

        // 3 , Out-of-range
        List<Integer> a3 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> b3 = Arrays.asList(5, 6, 7);
        assertEquals(0, simpleFunctions.sumElementsByIndexes(a3, b3));

        // 4 , Mixed valid and invalid
        List<Integer> a4 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> b4 = Arrays.asList(1, 3, 5, -1);
        assertEquals(60, simpleFunctions.sumElementsByIndexes(a4, b4));
    }
}
