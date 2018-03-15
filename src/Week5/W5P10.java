package Week5;

import java.util.Scanner;

/**
 * Week 5 – Problem 10
 *
 * Read number n from the console. Then read n numbers (integers), and print the minimum and maximum sum given by a
 * combination of n-1 numbers.
 * (If the user enters 5 numbers, you need to find out of those four numbers that give the maximum sum and four numbers
 * that give the minimum sum).
 *
 * Do not use arrays to solve this problem!
 */

public class W5P10 {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        int maxSum, minSum;

        int numbers = scanner.nextInt();
        int smaller = scanner.nextInt();
        int bigger = smaller;
        int sum = smaller;

        for(int x = 1; x < numbers; x++){
            int temporal = scanner.nextInt();

            if(temporal > bigger){
                bigger = temporal;
            }else if(temporal < smaller){
                smaller = temporal;
            }
            sum += temporal;
        }

        maxSum = sum - smaller;
        minSum = sum - bigger;

        System.out.printf("Min: %d%nMax: %d", minSum, maxSum);
    }
}
