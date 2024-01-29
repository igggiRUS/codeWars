package FUNDAMENTALS.STRING;


/**
 * https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
 We need a function that can transform a number (integer) into a string.

 What ways of achieving this do you know?

 Examples (input --> output):
 123  --> "123"
 999  --> "999"
 -100 --> "-100"
 */
class KataNumberToString {

    public static String numberToString(int num) {
        return Integer.toString(num);
    }
}


