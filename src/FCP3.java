import java.util.Scanner;

public class FCP3 {

    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int[]b = new int[a];

        double total = 0;
        double average;

        for (int x = 0; x <= (a - 1); x++){

            b[x]= scanner.nextInt();

            total = total + b[x];
            average = total / (x + 1);
            System.out.printf("%.2f", average);
        }

    }
}
