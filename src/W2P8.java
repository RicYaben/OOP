import java.util.Scanner;

public class W2P8 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double r1 = (b*b)-(4*a*c);
        double r2 = ( -b + (Math.sqrt(r1)))/(2*a);
        double r3 = ( -b - (Math.sqrt(r1)))/(2*a);

        if (r1 < 0)
            System.out.println("The equation has no real roots");

        if (r1 > 0)
            System.out.printf("%.3f %.3f",r2, r3);

        if (r1 == 0)
            System.out.printf("%.3f", r2);
    }

}
