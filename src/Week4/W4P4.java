package Week4;
import java.util.Scanner;

public class W4P4 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int[] grade = new int[5];

        int empty;
        int total = 0;

        for (int x = 0; x <= 4; x++){
            grade[x]= scanner.nextInt();

            for(int i = 0; i <= x; i++){
                if(grade[i] < grade[x]){
                    empty = grade[i];
                    grade[i] = grade[x];
                    grade[x] = empty;
                }
            }

        }
        for(int a: grade){
            if(a > 90){
                total ++;
            }
        }
        if(total >= 4){
            for(int b:grade){
                System.out.printf("%d%n", b);
            }
            System.out.print("Congratulations, your class is one of the best this year!");
        }else{System.out.print("Thank you for your submission.");}
    }
}
