package Week4;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Week 4 – Problem 8
 * Write a program that reads a positive integer bigger than one and then prints out the PRIME factors of the number in an increasing order. If a number is a prime, print out that number followed by a statement saying that it is a prime, as shown in the example
 * Note: Look up what factorization of a number in primes is.
 */

public class W4P8 {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        int integer = scanner.nextInt();
        int index = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int x = 1 ; x <= integer; x++){

            int counter = 0;
            for(int i = x; i >= 1; i--){

                if(x%i == 0){
                    counter ++;
                }
            }
            if (counter == 2){

                arrayList.add(index,x);
                index ++;
            }
        }
        if (integer == arrayList.get(arrayList.size()-1)) {
            System.out.print(integer + " is a prime number.");
        }else{
            for(int j = 0; j < arrayList.size(); j++){
                while(integer >= arrayList.get(j)){
                    if(integer%arrayList.get(j) == 0 ){
                        System.out.print(arrayList.get(j)+" ");
                        integer = integer/arrayList.get(j);
                    }else{ j++;}
                }
            }
        }
    }
}
