import java.util.Scanner;
public class W1P7 {
    public static void main(String[]arg){

     Scanner scan= new Scanner(System.in);

     String s= scan.nextLine();
     String t= scan.nextLine();
     int n= scan.nextInt();

     System.out.printf("%d, %s, %s",n / 2,t,s);
    }
}

