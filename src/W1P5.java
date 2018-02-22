import java.util.Scanner;
public class W1P5 {
    public static void main(String[]arg){
        Scanner scanner =new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int prod = ((17 * 25) - (7 * X)) / (35 - ( 25 / Y));

        System.out.printf("%d",prod);
    }
}
