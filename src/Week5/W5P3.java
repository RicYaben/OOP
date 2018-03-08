package Week5;
import java.util.Scanner;

/**
 *  Week 5 – Problem 3
 *  A right triangle can have sides whose lengths are all integers. The set of three integer values for the lengths of
 *  the sides of a right triangle is called a Pythagorean triple. The lengths of the three sides must satisfy the
 *  relationship that the sum of the squares of two of the sides is equal to the square of the hypotenuse.
 *  Write an application that read an integer N and finds all Pythagorean triples for side1, side2, and the hypotenuse,
 *  all no larger than N. Use a triple-nested for loop that tries all possibilities. This method is an example of
 *  “brute-force” computing.
 *  The triples should be printed in increasing order. See the template in the next page for help.
 */

public class W5P3 {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for(int x= 1; x<= N; x++){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N; j++){
                    if((x*x)+(i*i) == (j*j)){
                        System.out.println(x +" "+ i +" "+ j);
                    }
                }
            }
        }
    }
}
