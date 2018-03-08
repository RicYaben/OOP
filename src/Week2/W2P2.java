package Week2;
import java.util.Scanner;

public class W2P2 {
    public static void main(String[]arg){
        Scanner bro= new Scanner(System.in);
        int n1 = bro.nextInt();
        int n2 = bro.nextInt();

        if ((n1%n2)==0) {
            System.out.printf("Yes");
        }
        else {
            System.out.printf("No");
        }
    }
}
