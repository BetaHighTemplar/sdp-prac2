package sdp.prac2;

import java.util.ArrayList;
import java.util.List;

public class SimpleFunctions {
   
    public boolean Task5(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    // Task 1
    public int sumElementsByIndexes(List<Integer> a, List<Integer> b) {
        int sum = 0;
        for (Integer index : b) {
            if (index >= 0 && index < a.size()) {
                sum += a.get(index);
            }
        }
        return sum;
    }

    // Task6 G19m1985
    public static List<Integer> roundUpToMultipleOf100(List<Integer> numbers) {
        List<Integer> roundedNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            int roundedNumber = roundUpToMultipleOf100(number);
            roundedNumbers.add(roundedNumber);
        }

        return roundedNumbers;
    }

    private static int roundUpToMultipleOf100(int number) {
        // If the number is already a multiple of 100, return it as is
        if (number % 100 == 0) {
            return number;
        }

        // round it up to the next multiple of 100
        int remainder = number % 100;
        return number + (100 - remainder);
    }
    
    // Inner class Item
    public class Item {
        char value;
        Item next;

        Item(char value) {
            this.value = value;
            this.next = null;
        }
    }

    // Nested class Listed
    class Listed {
        private Item head;
        private int count;

        public Listed() {
            this.head = null;
            this.count = 0;
        }

        public void push(char value) {
            Item newItem = new Item(value);
            newItem.next = head;
            head = newItem;
            count++;
        }

        public char pop() {
            if (head == null) {
                return 'N';  // Using 'N' as a sentinel value
            }
            char value = head.value;
            head = head.next;
            count--;
            return value;
        }

        public char check() {
            if (head == null) {
                return 'N';  // Using 'N' as a sentinel value
            } else {
                return head.value;
            }
        }

        public boolean isEmpty() {
            return head == null;
        }

        public int length() {
            return count;
        }
    }

    // Task 3
    public static boolean checkParenthesesBalance(String x) {
        int openCount = 0;
        int closeCount = 0;
        Listed workAnswer = new SimpleFunctions().new Listed();

        // Push each character of the input word to the stack
        for (int i = 0; i < x.length(); i++) {
            workAnswer.push(x.charAt(i));
        }

        // While the stack is not empty, pop characters and count open and close parentheses
        while (!workAnswer.isEmpty()) {
            char currentChar = workAnswer.pop();
            if (currentChar == '(') {
                openCount++;
            } else if (currentChar == ')') {
                closeCount++;
            } else {
                System.out.println("Not within scope of problem");
                return false;
            }
        }

        // Return whether the counts of open and close parentheses are equal
        return openCount == closeCount;
    }

    // Task 2
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
