import java.util.Scanner;

public class W5P5 {

    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int pos = 0;
        int neg = 0;
        double average = 0;
        double total = 0;

        while(x != 0 ){
            if(x>0){
                pos ++;
                total = total + x;
            }
            if(x<0){
                neg ++;
                total = total + x;
            }
            x = scanner.nextInt();
            if(x ==0){
                average = (total)/(pos+neg);
                System.out.printf("P: %d%nN: %d%nT: %.0f%nA: %.2f", pos, neg, total, average);
            }
        }
    }
}
