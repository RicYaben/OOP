import java.util.Scanner;

public class W3P11 {

    public static void main(String[]arg){

        Scanner scanner= new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int neutral;

        if(num1 > num2){
            neutral = num1;
            num1 = num2;
            num2 = neutral;
        }

        for (int x = num1; x <= num2; x ++){
            int counter = 0;
            for(int i = x; i >= 1; i --) {

                if (x % i == 0) {
                    counter++;
                }
            }
            if(counter == 2){
                System.out.print(x + " ");
            }
        }
    }
}
