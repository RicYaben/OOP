import java.util.Scanner;

/**
 * Week 4 – Problem 6
 * Write a program that check if a string is a palindrome.
 * NOTE: Use the method charAt(), not reverse().
 */

public class W4P6 {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();

        for(int x = 0; x < string.length(); x++) {
            if (Character.isLetterOrDigit(string.charAt(x))) {
                stringBuilder.append(string.charAt(x));
            }
        }
        string = stringBuilder.toString();

        int x = 0;
        int i = string.length() -1;
        while((x < string.length())&&( i>=0)){
            if(string.charAt(x) == string.charAt(i)){
                x++;
                i--;
            }else{
                System.out.print("The sentence is NOT a palindrome.");
                break;
            }
            if(i ==0){
                System.out.print("The sentence is a palindrome.");
            }
        }

    }
}
