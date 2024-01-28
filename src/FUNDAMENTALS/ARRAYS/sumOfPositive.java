package FUNDAMENTALS.ARRAYS;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java
 * Sum of positive
 * #ARRAYS #FUNDAMENTALS
 * You get an array of numbers, return the sum of all the positives ones.
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 * Note: if there is nothing to sum, the sum is default to 0.
 * RUS: сложить все положительные числа массива
 */

public class sumOfPositive {
//    public static void main(String[] args) {
//        sum(new int[]{1, 2, 3, 4, 5});
//        sum(new int[]{1, -2, 3, 4, 5});
//        sum(new int[]{});
//        sum(new int[]{-1, -2, -3, -4, -5});
//        sum(new int[]{-1, 2, 3, 4, -5});
//    }

    public static int sum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0 ){
                result += arr[i];
            }
        }
        return result;
    }
}