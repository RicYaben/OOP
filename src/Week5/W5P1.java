package Week5;
import java.util.*;

public class W5P1 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int i = 10000;
        int counter = 0;

        while (i != 0){

            int a = scanner.nextInt();
            counter = counter + a;
            if (a == 0)
                i = 0;
        }
        System.out.println(counter);
    }
}
