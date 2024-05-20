/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

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
}
