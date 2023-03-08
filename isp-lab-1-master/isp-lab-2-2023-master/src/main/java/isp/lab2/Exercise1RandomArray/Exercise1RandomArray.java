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
        int min = 0;
        int max = 0;
        for (int n : array) {
            if (n <= min) {
                min = n;
            }
            if (n >= max) {
                max = n;
            }
        }

        int mm[] = new int[2];
        mm[0]=min;
        mm[1]=max;

        return mm;
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




