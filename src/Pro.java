import java.util.Scanner;

public class Pro {

    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] a = new int[b];

        for (int row = 0; row < a.length; row ++)
            a[row]= scanner.nextInt();

        for(int numb : a)
            System.out.printf("%d ",numb);
    }
}
