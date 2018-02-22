import java.util.*;

public class W5P2 {

    public static void main(String[]arg) {

        Scanner scanner = new Scanner(System.in);

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int x;
        int y;



        switch (x = scanner.nextInt()){
            case 1: x = a;
            case 2: x = b;
            case 3: x = c;
            case 4: x = d;
            case 5: x = e;
            break;
        }
        switch (y = scanner.nextInt()){
            case 1: y = a;
            case 2: y = b;
            case 3: y = c;
            case 4: y = d;
            case 5: y = e;
            break;
        }

        int mult = x * y;

        System.out.println(mult);
    }
}
