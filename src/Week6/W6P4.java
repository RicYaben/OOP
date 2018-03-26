package Week6;
import java.util.Scanner;

/**
 *
 * Week 6 – Problem 4
 * Write a program that reads an integer T denoting the number of tests. Then, the program performs T tests, where each
 * test consists of reading an integer and printing the sum of its digits.
 */

public class W6P4 {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        int numberTest = scanner.nextInt();
        int[] array = new int[numberTest];

        for(int x = 0; x < numberTest; x++){

            int test = scanner.nextInt();
            int temp = 0;

            while(test >= 1){
                temp += test%10;
                test /= 10;
            }
            array[x] = temp;
        }
        for(int a: array){
            System.out.println(a);
        }
    }
}
