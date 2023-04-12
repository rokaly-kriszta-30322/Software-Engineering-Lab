package isp.lab2.Exercise3SumOfIntegersRecursive;

public class Exercise3SumOfIntegersRecursive {


    /**
     * This method will return the sum of the first n integers
     * @param n
     * @return
     */
    public static int sumOfIntegers(int n) {
        if (n > 0) {
            return n + sumOfIntegers(n - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOfIntegers(5));

    }
}
