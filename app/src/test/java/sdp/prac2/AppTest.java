package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AppTest {

<<<<<<< HEAD
//////////////////////////Tests for Task 6 by Ashleigh//////////////////
       // Test case 1: Normal case
        List<Integer> list1 = Arrays.asList(123, 200, 345, 400, 567);
        System.out.println(roundUpToMultipleOf100(list1));  // Expected output: [200, 200, 400, 400, 600]

        // Test case 2: All numbers are multiples of 100
        List<Integer> list2 = Arrays.asList(100, 200, 300, 400, 500);
        System.out.println(roundUpToMultipleOf100(list2));  // Expected output: [100, 200, 300, 400, 500]

        // Test case 3: Empty list
        List<Integer> list3 = new ArrayList<>();
        System.out.println(roundUpToMultipleOf100(list3));  // Expected output: []
=======
    // Test Case 1: Empty List Test Case
    @Test
    void testEmptyList() {
        // Given
        List<String> inputList = new ArrayList<>();
        // When
        List<String> result = Task2(inputList);
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
        List<String> result = Task2(inputList);
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
        List<String> result = Task2(inputList);
        // Then
        List<String> expectedOutput = Arrays.asList("pple", "anana", "arrot");
        assertEquals(expectedOutput, result);
    }

    //test case task 6
     @Test
    void testAddElementsAtIndexes() {
        // Test case 1: Basic scenario
        List<Integer> a1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> b1 = Arrays.asList(0, 2, 4);
        assertEquals(9, Task7.addElementsAtIndexes(a1, b1), "Test case 1 failed");

        // Test case 2: Empty lists
        List<Integer> a2 = Arrays.asList();
        List<Integer> b2 = Arrays.asList();
        assertEquals(0, Task7.addElementsAtIndexes(a2, b2), "Test case 2 failed");

        // Test case 3: Index out of range
        List<Integer> a3 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> b3 = Arrays.asList(0, 2, 5);
        assertEquals(6, Task7.addElementsAtIndexes(a3, b3), "Test case 3 failed");

        // Test case 4: Indexes with negative values
        List<Integer> a4 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> b4 = Arrays.asList(-1, -2, -3);
        assertEquals(0, Task7.addElementsAtIndexes(a4, b4), "Test case 4 failed");

        // Test case 5: List with multiple indexes pointing to the same element
        List<Integer> a5 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> b5 = Arrays.asList(1, 1, 1);
        assertEquals(60, Task7.addElementsAtIndexes(a5, b5), "Test case 5 failed");
    }
    // Add other test cases here following the same pattern
    // ...
>>>>>>> origin/master
}

