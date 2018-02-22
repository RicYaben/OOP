import java.util.Scanner;

public class W3P6 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int lenght = scanner.nextInt();

        for (int y = 1; y <= lenght; y ++) {

            int a = 1;
            while (a <= y) {
                System.out.print(a);
                a++;
            }
            System.out.printf("%n");
        }

        for (int x = lenght; x > 0; x--){

            int b = 1;
            while (b <= x){
                System.out.print(b);
                b ++;
            }
            System.out.printf("%n");
        }



    }
}
