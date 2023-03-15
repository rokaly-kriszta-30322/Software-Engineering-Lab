package isp.lab2.Exercise4StringSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     * @param input
     * @param substring what to search for
     * @return
     */
    public static String[] searchSubstrings(String input, String substring) {
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList(input.split(",")));
        ArrayList<String> resultList = new ArrayList<>();
        for (String word : inputList) {
            if (word.contains(substring)) {
                resultList.add(word);
            }
        }
        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); ++i) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car";
        String substring = "te";
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {
            System.out.println(string);
        }
    }
}
