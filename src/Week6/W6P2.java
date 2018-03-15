package Week6;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Week 6 – Problem 2
 * Write a program that reads an integer from 1 to 100 (inclusively).
 * • If the number is below 25:
 * o Factorize it and print its prime factors in a single line separated by single space.
 * • If the number is between 25 and 75 (inclusive):
 * o Multiply the number with the sum of its digits and print the result.
 * • If the number is above 75 to 100 (inclusive): o Multiply its digits and print the result.
 */

public class W6P2 {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        int inte = scanner.nextInt();

        if(inte >=1 && inte <= 100){
            if(inte < 25){
                ArrayList<Integer> array = new ArrayList<>();

                for(int i = 2; 1 < inte;){
                    if(inte % i == 0){
                        array.add(i);
                        inte /= i;
                    }else {i++;}
                }
                for (Integer anArray : array) {
                    System.out.print(anArray+" ");
                }
            }
            if(inte >= 25 && inte <= 75){
                int sum = 0;
                for(int i = inte; i >= 1; i /= 10){
                    sum += (i%10);
                }
                System.out.print(sum * inte);
            }
            if(inte > 75){
                int mul = 1;
                for(int i = inte; i >= 1; i /= 10){
                    mul *= (i%10);
                }
                System.out.print(mul);
            }
        }
    }
}
