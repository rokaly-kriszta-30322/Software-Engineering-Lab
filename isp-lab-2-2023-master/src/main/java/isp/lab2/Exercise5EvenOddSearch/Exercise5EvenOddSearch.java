package isp.lab2.Exercise5EvenOddSearch;

import java.util.ArrayList;
import java.util.Arrays;
public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList(input.split(",")));
        int largestEvenNumber = 0, smallestOddNumber = 100000000;
        int[] inputArray = new int[inputList.size()];
        for(int i = 0; i < inputList.size(); ++i) {
            inputArray[i] = Integer.parseInt(inputList.get(i));
        }
        int[] result = new int[4];
        for (int i = 0; i < inputArray.length; ++i) {
            if (inputArray[i] % 2 == 0 && largestEvenNumber < inputArray[i]) {
                largestEvenNumber = inputArray[i];
                result[0] = inputArray[i];
                result[1] = i;
            } else if (inputArray[i] % 2 != 0 && smallestOddNumber > inputArray[i]) {
                smallestOddNumber = inputArray[i];
                result[2] = inputArray[i];
                result[3] = i;
            }
        }
        if (largestEvenNumber == 0) {
            System.out.println("No even numbers found!");
        } else if (smallestOddNumber == 100000000) {
            System.out.println("No odd numbers found!");
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
