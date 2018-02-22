import java.util.Scanner;

public class W3P2 {

    public static void main(String[]arg){

        Scanner scanner =new Scanner(System.in);

        int num = scanner.nextInt();
        int total = 0;

        for(int x = 0; x <= num; x ++){
            total = total + x;
        }
        System.out.print(total);
    }
}
