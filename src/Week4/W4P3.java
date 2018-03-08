package Week4;
import java.util.Scanner;

public class W4P3 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();


        int out;
        if (b >= 1970 && b <= 2070) {
            switch (a) {
                case 1:
                    out = 31;
                    break;
                case 2:
                    if (b % 4 == 0 || b%400 == 0 && b%100 == 0) {
                    out = 29;
                    }else {out = 28;}
                    break;
                case 3:
                    out = 31;
                    break;
                case 4:
                    out = 30;
                    break;
                case 5:
                    out = 31;
                    break;
                case 6:
                    out = 30;
                    break;
                case 7:
                    out = 31;
                    break;
                case 8:
                    out = 30;
                    break;
                case 9:
                    out = 31;
                    break;
                case 10:
                    out = 30;
                    break;
                case 11:
                    out = 31;
                    break;
                case 12:
                    out = 30;
                    break;
                default:
                    out = 0;
                    break;
            }
            System.out.print(out);
        }
    }
}
