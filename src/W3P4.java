import java.util.Scanner;

public class W3P4 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int num2 = 1;
        System.out.printf("%d%n", num2);

        for(int x = 1; x < num; x++ ){

            int num3 = ((num2 * 10) + (x+1));
            num2 = num3;

            System.out.printf("%d%n", num3);
        }
    }
}
