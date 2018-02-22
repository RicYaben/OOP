import java.util.Scanner;
import java.lang.Math.*;

public class W3P9 {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        int num;
        int total = 0;
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 1; i < n; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                total ++;
                a[total] = i;
            }
        }
        System.out.println("There are " + total + " primes below "+ n +":");
        for(int x = 1; x<=total ; x++){
            System.out.print(a[x] + " ");
            if(x%5 == 0){
                System.out.printf("%n");
            }
        }
    }
}
