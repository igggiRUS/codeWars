package FUNDAMENTALS.STRING;

/**
 * https://www.codewars.com/kata/55d24f55d7dd296eb9000030
 * сложить все входящие числа
 */
public class Summation {
    public static int summation(int n) {
        int result = 0;
        while (n < 0) {
            result += n--;
        }
        return result;
    }
}

