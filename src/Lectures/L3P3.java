import java.util.Scanner;
public class L3P3 {
    public static void main(String[]arg) {

        Scanner scan = new Scanner(System.in);

        int count = 0;
        int grade = 100000;
        int grade2 = grade + 1;

       while (grade < grade2){
           grade2 = grade;
           grade = scan.nextInt();
           count ++;

       }

        System.out.print(count);
    }
}
