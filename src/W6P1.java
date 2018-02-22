import java.util.Scanner;

public class W6P1 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int c = (scanner.nextInt());
        int[][]a = new int[c][c];
        System.out.print(a.length);

        for(int row = 0; row < a.length; row++)
            for(int colum = 0; colum < a[row].length; colum ++)
                a[row][colum]= scanner.nextInt();
                System.out.print(a);
    }
}
