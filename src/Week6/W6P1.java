package Week6;
import java.util.Scanner;

/**
 * Week 6 – Problem 1
 * Write a program that reads a number N followed by an NxN matrix. The program should then read the numbers of the
 * matrix, consisting of doubles, and sum all the numbers in the major diagonal.
 * Print the sum as double with two digits after the decimal point.
 * Hint: Use a double nested for loop to read the numbers of the matrix.
 */

public class W6P1 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int c = (scanner.nextInt());
        double[][]array = new double[c][c];
        double sum = 0;

        for(int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = scanner.nextDouble();
            }
        }
        for(int x = 0; x < array.length; x++) {
            sum += array[x][x];
        }
        System.out.printf("%.2f", sum);
    }
}
