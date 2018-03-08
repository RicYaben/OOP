package Week2;
import java.util.Scanner;

public class W2P1 {
    public static void main(String[]arg){

        Scanner fryer=new Scanner(System.in);

        int num1 = fryer.nextInt();
        if ((num1%2)==0) {
            System.out.printf("Even");
        }
        else {
            System.out.printf("Odd");
        }

    }
}
