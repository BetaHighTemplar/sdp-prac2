package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
    }<<<<<<<HEAD

    public boolean Task5(List<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
        if (list.get(i) > list.get(i + 1)) {
            return false;
        }
    }
    return true;
=======
    //Task 1
    public int sumElementsByIndexes(List<Integer> a, List<Integer> b){
        int sum= 0;
        for (Integer index : b){
            if(index >=0 && index < a.size()){
                sum += a.get(index);
            }
        }
        return sum;
>>>>>>> origin/g20m1710
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////

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
}
