package isp.lab2.Exercise6WordGuess;

public class Exercise6WordGuess {

    /**
     * This method will return the number of occurrences of a character in a word
     * @param c
     * @param word
     * @return
     */
    public static int countOccurence(char c, char[] word) {
        int occurances = 0;
        for(char letter : word) {
            if (c == letter) {
                ++occurances;
            }
        }
        return occurances;
    }

    public static void main(String[] args) {

    }

}
