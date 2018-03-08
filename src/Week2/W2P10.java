package Week2;
import java.util.Scanner;

public class W2P10 {

    public static void main(String[]arg){

        Scanner scanner =new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            double temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }

        System.out.print(c + " " + b + " " + a );


    }
}
