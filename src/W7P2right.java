import java.util.Scanner;



public class W7P2right {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int x = 0 ; x <= (n-1) ; x++){
            array[x] = scanner.nextInt();
        }

        for(int y = (n-1); y >=0; y --){
            System.out.printf("%d"+ " ", array[y]);
        }
    }
}
