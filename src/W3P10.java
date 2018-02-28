import java.util.Scanner;

/**
 * Week 3 – Problem 10
 *
 * Write a program that takes a positive integer N that is larger than 10 and displays the first N Fibonacci numbers F(n),
 * where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. The program should also show their average as a double with 2 digits after
 * the decimal point on a new line.
 */

public class W3P10 {

    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        int[]fib =  new int[scanner.nextInt()];
        fib[0] = 1;
        fib[1] = 1;
        double average = 0;

        for(int x =2; x< fib.length; x++){
            fib[x] = (fib[x-1]) + (fib[x-2]);
        }
        for(int a: fib) {
            System.out.print(a + " ");
        }
        for (int aFib : fib) {
            average += aFib;
        }
        System.out.printf("%n%.2f", (average/fib.length));
    }
}
