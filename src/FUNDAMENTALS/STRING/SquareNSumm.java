package FUNDAMENTALS.STRING;

/**
 * https://www.codewars.com/kata/515e271a311df0350d00000f
 * Square(n) Sum
 * возведи в степерь и сложи
 */
public class SquareNSumm {
    public static int squareSum(int[] n) {
        int result = 0;
        for (int number : n) result += Math.pow(number, 2);
        return result;
    }
}
