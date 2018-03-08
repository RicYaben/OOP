package Week4;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Week 4 – Problem 9
 * Hash function is an irreversible function, which maps keys (e.g. strings), to small integers. It is often used in
 * tables and various data structures to compare and locate keys.
 * (Read more at https://en.wikipedia.org/wiki/Hash_function)
 * Implement the following method:
 * int hash(String s)
 * This method will calculate the sum of the ASCII values of all the letters and symbols (excluding spaces) in the
 * string and return the value of sum % 31. Read an indefinite number of strings. The program ends when x is entered.
 * Hint: You can use the chartAt(int i) method to get individual characters of a string.
 * To convert a character into an integer value of the ASCII table, simply cast it to an (int).
 */

public class W4P9 {

    private static int hash(String s){
        int sum = 0;
        String[]strings=  s.split(" ");

        for (int x=0; x< strings.length; x++){
            for(int i = 0; i< strings[x].length(); i++){
                int j = strings[x].charAt(i);
                sum += j;
            }
        }
        return sum %31;
    }
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(!"x".equals(s)){
            arrayList.add(hash(s));
            s = scanner.nextLine();
        }
        for(int x=0; x<arrayList.size();x++){
            System.out.println(arrayList.get(x));
        }
    }
}
