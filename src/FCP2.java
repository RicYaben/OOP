import java.util.Scanner;

public class FCP2 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int length =  scanner.nextInt();
        int [] array = new int[length];
        double total = 0;


        for (int indexof = 0; indexof <= (length -1); indexof ++ ){
            array[indexof]= scanner.nextInt();

            total = total + array[indexof];
        }

        double average = total / length;

        System.out.printf("%.2f", average);

    }
}
