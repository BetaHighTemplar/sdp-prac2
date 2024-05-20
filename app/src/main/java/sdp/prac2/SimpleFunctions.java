package sdp.prac2;

import java.util.ArrayList;
import java.util.List;

public class SimpleFunctions {

    public SimpleFunctions() {
        // Constructor
    }

    // Method to remove the first character from every element in a list
    public static List<String> task2(List<String> list) {
        List<String> result = new ArrayList<>();

        // Iterate over each element in the input list
        for (String element : list) {
            // Check if the element is not empty and has more than one character
            if (!element.isEmpty() && element.length() > 1) {
                // Remove the first character from the element and add it to the result list
                result.add(element.substring(1));
            }
        }
        
        return result;
    }
}
