import java.util.Scanner;

/**
 * Week 3 – Problem 13
 * Read an integer n from the terminal and print the amount of Pythagorean triples of a, b, c, where 0 < a, b, c <= n.
 * Note: The values can be interchanged. Meaning that Pythagorean triples of 3, 4, 5 and 4, 3, 5 count as two.
 */
public class W3P13 {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        double integer = scanner.nextInt();
        int counter = 0;
        for(double b = 1; b <= integer; b++){
            for(double a = 1; a <= integer; a++){
                double c = 1;
                while( c<= integer){
                   if( b == Math.sqrt(Math.pow(c,2)+Math.pow(a,2))){
                        counter++;
                   }
                   c++;
                }
            }
        }
        System.out.print(counter);
    }
}
