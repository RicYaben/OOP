import java.util.Scanner;

public class W2P12 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int[] a = new int[5];
        int c;

        for(c = 0; c <= a.length; c++){
            a[c] = b%10;
            b = b/10;

            if(a[c] > 1)
                System.out.print("Not binary.");
                c = a.length +1;
        }

        if(b%10 == 0)
            System.out.print("Binary.");
    }
}
