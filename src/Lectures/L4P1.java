import java.util.Scanner;
public class L4P1 {
    public static void main(String[]arg){

        Scanner scan = new Scanner(System.in);
        int p = 1000;
        double r = 0.05;
        int i = scan.nextInt();
        int n;

        for (n = 1; n <= i; n++){
            double a = p * Math.pow((1+r),n);
            System.out.printf("%.3f%n", a);
        }

    }
}
