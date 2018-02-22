import java.util.Scanner;

public class W2P4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if ((n % 2) == 0) {
            if (n >= 2 && n <= 10) {
                System.out.print("Not Weird");
            }


            if (n >= 11 && n <= 30) {
                System.out.print("Weird");

            }

            if (n >= 30) {
                System.out.print("Not weird");
            }
        }
        else {
            System.out.print("Weird");
        }
    }
}
