package main.java.com.classes.danvode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] array = {4, 2,6, 9,1,7, 8};
        boolean a = true;
        while (a) {
            a = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    a = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }

    private static void swap(int[] array, int b1, int b2) {
        int tmp = array[b1];
        array[b1] = array[b2];
        array[b2] = tmp;
    }
}
