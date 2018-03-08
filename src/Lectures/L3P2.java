package Lectures;
import java.util.Scanner;

public class L3P2 {
    public static void main(String [] arg) {

        Scanner scan = new Scanner(System.in);

        int total = 0;
        int count = 0;
        while (count < 1000 ) {
            int n = scan.nextInt();
            total += n;
            count ++;
        }
        int average = total / 1000;
        System.out.printf("%d", average);
    }
}
