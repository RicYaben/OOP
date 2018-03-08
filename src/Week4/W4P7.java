package Week4;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Week 4 – Problem 7
 * Write a program that reads some positive integers until it finds the sentinel -1, and prints the length of the longest
 * increasing subsequence found in these numbers. If more than one such subsequence exists, print the length only once.
 */

public class W4P7 {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();
        int counter1 = 1;
        int counter2 = 1;

        int i = 0;
        while(i != -1){
            int temp = scanner.nextInt();
            if(temp == -1){
                break;
            }
            if(temp > 0){
                arrayList.add(i,temp);
            }
            i++;
        }

        for(int x = 0; x< (arrayList.size()-1); x++){
            if(arrayList.get(x) <= arrayList.get(x+1)) {
                counter1++;
                }else{
                    if(counter1 >= counter2) {
                        counter2 = counter1;
                        counter1 = 1;
                    }else{ counter1 = 1; }
            }
        }
        System.out.print(counter2);
    }
}
