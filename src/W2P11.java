import java.util.Scanner;

public class W2P11 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if((a%4 == 0 && a%100 != 0)||(a%400 == 0 ))
            System.out.print(a + " " + "is a leap year.");
        else{
            System.out.print(a + " " + "is not a leap year.");
        }
    }
}
