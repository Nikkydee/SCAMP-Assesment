package chapter4;

public class RepeatTwoSum {

    public static int f (int n) {
        if (n <= 1) {
            return n;
        } else {
            return f ( n - 1 ) + f ( n - 2 );
        }
    }

    public static void main (String[] args) {
        Integer c = 8;
        Integer answer = f ( c );
        System.out.println ( "Fibonacci " + c + "'s number is: " + answer );
    }
}
