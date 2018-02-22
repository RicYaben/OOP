import java.util.Scanner;

public class W3P0 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);


        double totalpos = 0;
        double totalneg = 0;
        int lenght = scanner.nextInt();

        int counter1 = 0;
        int counter2 = 0;

        int x = 1;

        while( x <= lenght){

            float num = scanner.nextFloat();

            if(num > 0) {
                totalpos = totalpos + num;
                counter1 = counter1 + 1;
            }


            if(num < 0) {
                totalneg = totalneg + num;
                counter2 = counter2 + 1;
            }

            x = x + 1;
        }

        double average1 = totalpos / counter1;
        double average2 = totalneg / counter2;

        System.out.printf("%.5f %.5f", average1,average2);

    }
}
