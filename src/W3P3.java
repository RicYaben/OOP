import java.util.Scanner;

public class W3P3 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        for(int x = 1; x <= num2; x++){

            int mul = num1 * x;

            System.out.printf("%d%n", mul);
        }
    }
}
