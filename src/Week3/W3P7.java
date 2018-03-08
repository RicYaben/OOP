package Week3;
import java.util.Scanner;
import java.lang.Math.*;

public class W3P7 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int p = scanner.nextInt();

        for(int x = 0; x <= p; x++){

            double total = Math.pow(n, x);
            System.out.printf("%.0f ",total);
        }
        System.out.printf("%n");
        for(int y = 0; y <= p; y++){

            double total2 = Math.pow(k, y);

            System.out.printf("%.0f ",total2);
        }

    }
}
