package FUNDAMENTALS.STRING;

/**
 * https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java
 * Complete the solution so that it reverses the string passed into it.
 * <p>
 * 'world'  =>  'dlrow'
 * 'word'   =>  'drow'
 * Переверните слово
 */

public class ReversString {
    public static void main(String[] args) {
        String string = "Миша";
        Kata.solution(string);
        System.out.println(Kata.solution(string));
    }

    public class Kata {

        public static String solution(String str) {
            return new StringBuilder(str).reverse().toString();
        }
    }
}