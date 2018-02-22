import java.util.Scanner;

public class w2p13 {

    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int[] b = new int[3];

        for(int x = 2; x >= 0; x--){

            b[x] = a%10;
            a = a/10;

            System.out.print(b[x]);
        }

    }
}
