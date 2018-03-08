package Week3;
import java.util.Scanner;

public class W3P5 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int counter = 1;

        while(num > 1){

            if( num / 2 > 1){
                counter ++;
            }

            num = num/2;
        }
        System.out.print(counter);
    }
}
