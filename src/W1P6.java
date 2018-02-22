import java.util.Scanner;
public class W1P6 {
    public static void main(String[]arg) {

        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        int Y = X + scan.nextInt();
        int Z = Y + scan.nextInt();
        int A = Z + scan.nextInt();
        int B = A + scan.nextInt();

        System.out.printf("%d%n%d%n%d%n%d%n%d", X,Y,Z,A,B);
    }
}
