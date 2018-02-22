import java.util.*;

public class W4P1 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int b;
        int c = 0;

        while (i > 0 ) {
            b = i%10;
            i = i/10;
            c = c + b;
        }

        System.out.println(c);
    }
}
