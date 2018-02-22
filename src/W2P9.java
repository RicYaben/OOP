import java.util.Scanner;

public class W2P9 {
    public static void main(String[]arg){

        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder(scanner.next());

        String a = stringBuilder.toString();
        String b = stringBuilder.reverse().toString();

        if (String.valueOf(a).equals(String.valueOf(b)))
            System.out.println("It is a palindrome");
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
