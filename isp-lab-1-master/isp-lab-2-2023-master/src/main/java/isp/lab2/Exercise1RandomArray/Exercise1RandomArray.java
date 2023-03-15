package isp.lab2.Exercise1RandomArray;

import java.util.Random;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static int[] findMaxAndMin(int[] array) {
        int min = array[0], max = array[1];
        for (int j : array) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
        }
        int[] result = new int[2];
        result[0] = min;
        result[1] = max;
        return result;
    }


    public static void main(String[] args) {

        Random random = new Random();

        //genereaza numar random intre 10 si 100
        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMaxAndMin(a);
        System.out.println("Min is:" + mm[0] + " Max is:" + mm[1]);
    }
}




